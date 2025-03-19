package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import production.ProductionDAO;
import production.ProductionDTO;


@WebServlet("/production")
public class ProductionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 주별, 월별, 분기별 선택
		String unit = request.getParameter("unit"); 
		ProductionDAO productionDAO = new ProductionDAO();
		
		if (unit != null) {
		List<ProductionDTO> productionList = productionDAO.getProductionByUnit(unit);
		request.setAttribute("productionList", productionList);
		
		} 
			
		String url = "/WEB-INF/view/production_dashboard.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
		}
		

	}


package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardDTO;


@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDAO boardDAO = new BoardDAO();
		List resultList = boardDAO.selectBoard();
		
		request.setAttribute("resultList", resultList);
		
		String url = "/WEB-INF/views/board_list.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=urf-8");
		
		String command = request.getParameter("command");
		System.out.println("command : "+ command);
		if("update".equals(command)) {
			// update 장소
			
			int boardId = Integer.parseInt(request.getParameter("boardId"));
			String title = request.getParameter("title");
			String boardContent = request.getParameter("content");
			int notice = Integer.parseInt(request.getParameter("notice"));
			
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setBoardId(boardId);
			boardDTO.setTitle(title);
			boardDTO.setBoardContent(boardContent);
			boardDTO.setNotice(notice);
			
			BoardDAO boardDAO = new BoardDAO();
			int result = boardDAO.updateBoard(boardDTO);
			System.out.println("result : "+ result);
			
		} else {
			// insert 장소
			// jsp에서 보낸 title을 가져와서, String title 변수에 저장.
			
			int empno = Integer.parseInt(request.getParameter("empno"));
			String title = request.getParameter("title");
			String boardContent = request.getParameter("content");
			int notice = Integer.parseInt(request.getParameter("notice"));
			
			// 값을 가져온다.
			// title 저장된 값을, setTitle로 DTO에 저장한다.
			
			BoardDTO boardDTO = new BoardDTO();
	        boardDTO.setEmpno(empno);
	        boardDTO.setTitle(title);
	        boardDTO.setBoardContent(boardContent);
	        boardDTO.setNotice(notice);
			
			// DTO 객체에 값을 저장한다.
	        // insertBoard 메소드에 DTO를 전달한다.
			
			BoardDAO boardDAO = new BoardDAO();
			int result = boardDAO.insertBoard(boardDTO);
			System.out.println("result : "+ result);
			
			// DB에 DTO 값을 삽입한다.
			
		}
		
		String url = "board";
		response.sendRedirect(url);
	}
		
		
	}




import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/req")
public class RequestServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("RequestServlet 생성자 실행");
        
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("/req doGet 실행");

		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		//  응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; chaset=utf-8");
		
		String num1 = request.getParameter("num1");
        System.out.println("num1 : " + num1);
        
        // getParameter 
        //전달 받은 인자의 key를 적어서 해당 값을 얻어오기
        // 없으면 null
        String num2 = request.getParameter("num2");
        System.out.println("num2 : " + num2);
        
        String[] nums = request.getParameterValues("num1");
	
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

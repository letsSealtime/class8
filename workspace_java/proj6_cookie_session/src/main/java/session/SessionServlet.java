package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 세션을 가져오는 방법
		// 기존 세션이 없으면 새로 만들어주고
		// 있으면 그걸 가져옴
//		HttpSession session = request.getSession();
		
		
		// 기존 세션이 없으면 null, 있으면 가져옴
		HttpSession session = request.getSession(false);
		
	
	}

}

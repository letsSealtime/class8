package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comment.CommentDAO;
import comment.CommentDTO;



@WebServlet("/comment")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=urf-8");
		
		String command = request.getParameter("command");
		System.out.println("command : "+ command);
		
		if("update".equals(command)) {
			// update 장소
			
			int commentId = Integer.parseInt(request.getParameter("commentId"));
			String content = request.getParameter("content");
			
			CommentDTO commentDTO = new CommentDTO();
			commentDTO.setContent(content);
			commentDTO.setCommentId(commentId);
			
			CommentDAO commentDAO = new CommentDAO();
			int result = commentDAO.updateComment(commentDTO);
			System.out.println("result : "+ result);
			
		} else if ("insert".equals(command)) {
			// insert 장소
			
			int boardId = Integer.parseInt(request.getParameter("boardId"));
			String content = request.getParameter("content");
			
			CommentDTO commentDTO = new CommentDTO();
			commentDTO.setBoardId(boardId);
			commentDTO.setContent(content);
			
			CommentDAO commentDAO = new CommentDAO();
			int result = commentDAO.insertComment(commentDTO);
			System.out.println("result : "+ result);
			
		} else if ("delete".equals(command)) {
			// delete 장소
			
			int commentId = Integer.parseInt(request.getParameter("commentId"));
			
			CommentDTO commentDTO = new CommentDTO();
			commentDTO.setCommentId(commentId);
			
			CommentDAO commentDAO = new CommentDAO();
			int result = commentDAO.deleteComment(commentDTO);
			System.out.println("result : "+ result);
		
		}
		
		String url = "board";
		response.sendRedirect(url);
	}
		
		
	}


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
		
		
		// board 접속 시, 목록 - 새글 작성 - 상세 보기 구분이 필요하다.
		// action 파라미터를 주어 확인하자.
		
		String action = request.getParameter("action");
		BoardDAO boardDAO = new BoardDAO();
		
		// 새글 작성 요청
		if ("form".equals(action)) {
			request.getRequestDispatcher("/WEB-INF/views/form.jsp").forward(request, response);
		}
		
		// 게시글 상세 보기
		else if ("detail".equals(action)) {
			
			int boardId = Integer.parseInt(request.getParameter("boardId"));
			
			BoardDTO board = boardDAO.getBoardDetail(boardId);
			request.setAttribute("board", board);
			
			request.getRequestDispatcher("/WEB-INF/views/board_detail.jsp").forward(request, response);
		}
		
		else {
			// 게시글 목록 가져오기
			List resultList = boardDAO.selectBoard();
			
			// JSP에서 사용할 수 있게 request에 저장
			request.setAttribute("resultList", resultList);
			
			// 게시판 목록 페이지로 이동
			String url = "/WEB-INF/views/board_list.jsp";
			request.getRequestDispatcher(url).forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
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
			
		} else if ("insert".equals(command)) {
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
			
		} else if ("delete".equals(command)) {
			
			int boardId = Integer.parseInt(request.getParameter("board_id"));
			
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setBoardId(boardId);
			
			BoardDAO boardDAO = new BoardDAO();
			int result = boardDAO.deleteBoard(boardDTO);
			System.out.println("result : "+ result);
		
		}
		
		String url = "board";
		response.sendRedirect(url);
	}
		
		
	}


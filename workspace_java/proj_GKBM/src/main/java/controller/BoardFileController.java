//package controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;
//
//import board.BoardDAO;
//import board.BoardDTO;
//import boardFile.BoardFileDAO;
//import boardFile.BoardFileDTO;
//
//
//@WebServlet("/boardFile")
//public class BoardFileController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	}
//
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html; charset=utf-8");
//	
//		// 파일 part 객체로 가져오기 
//		Part part = request.getPart("fileName");
//		
//		// 파일 이름 추출
//	 	String fileName = getFileName(part);
//		
//	 	// 파일 저장 경로
//	 	String uplodePath = "C:\\GKBMUploadTest\\" + fileName;
//		
//	 	// 파일 저장
//		if (! fileName.isEmpty()) {
//			part.write(uplodePath);
//			
//		}
//		
//
//		// DTO에 정보 저장 (파일 이름, 저장경로)
//		BoardFileDTO boardFileDTO = new BoardFileDTO();
//		boardFileDTO.setFileName(fileName);
//		boardFileDTO.setFilePath(uplodePath);
//		
//		// DAO로 보내기
//		BoardFileDAO boardFileDAO = new BoardFileDAO();
////		int result = boardFileDAO.insertBoardFile(boardFileDTO);
//		
//		System.out.println("result : "+ result);
//		
//	}
//
//	
//	private String getFileName(Part part) {
//		String contentDisp = part.getHeader("content-disposition");
//
//		// form-data;name="fileName";fileName="추가한 파일 이름"
//		// split(";") 로 자르고,
//		// trim() 공백 제거
//		// startWith, fileName으로 시작하는 요소를 얻음.
//		// substring(indexOf("="로 시작, 2번째), 그리고 -1만큼
//		String[] split = contentDisp.split(";");
//		for(int i = 0; i < split.length; i++) {
//			String temp = split[i];
//			if(temp.trim().startsWith("fileName")) {
//				return temp.substring(temp.indexOf("=") + 2, temp.length() - 1);
//			}
//		}
//		
//		return "";
//	}
//	
//	
//}

package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import board.BoardDAO;
import board.BoardDTO;
import boardFile.BoardFileDAO;
import boardFile.BoardFileDTO;

@WebServlet("/file")
public class BoardFileController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			String fileName = request.getParameter("fileName");
			String path = "C:\\temp\\upload";
			File file = new File(path + "\\" + fileName);

			// 브라우저 캐시를 사용하지 않도록 설정
			response.setHeader("Cache-Control", "no-cache");
			// 지금 응답이 첨부파일이라는 것
			// 그리고 그 파일 이름이 뭐 라는 것
			response.addHeader("Content-disposition", "attachment; fileName=" + fileName);

			// 파일 읽기
			FileInputStream fis = new FileInputStream(file);
			// 메모리로 퍼 올릴 바가지 크기 설정
			byte[] buf = new byte[1024 * 1]; // 보통은 8kB

			OutputStream os = response.getOutputStream();

			int count = -1;
			// 바가지 크기 만큼 읽음
			// 읽을게 없으면 -1
			while ((count = fis.read(buf)) != -1) {
				// 브라우저로 내보냄
				// 0 : 건너뛰 byte 수
				// count : 보낼 byte 수
				os.write(buf, 0, count);
			}
			os.flush();
			os.close();
			fis.close();
		}
	
	}


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

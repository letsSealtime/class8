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
public class BoardFileController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String encoding = "utf-8";
		request.setCharacterEncoding(encoding);

		
		String action = request.getParameter("action");
		if("upload".equals(action)) {
			
			int boardId = (int) request.getAttribute("boardId");
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			
			
			// 파일 업로드 메소드 
			try {
				// File : 파일 또는 디렉토리(폴더)를 관리하는 class
				File currentDirPath = new File("C:\\temp\\upload");

				// 세팅
				DiskFileItemFactory factory = new DiskFileItemFactory();
				factory.setRepository(currentDirPath); // 경로 지정
				factory.setSizeThreshold(1024 * 1024); // 임시 파일의 크기를 byte단위로

				ServletFileUpload upload = new ServletFileUpload(factory);
				// 업로드 파일의 최대 크기 지정
				upload.setFileSizeMax(1024 * 1024 * 100); // 100 메가 바이트 100MB

				// request를 분석해서
				// 요청 파라메터들을 FileItem 뽑고 그걸 List에 담아서 돌려줌
				List<FileItem> items = upload.parseRequest(request);
				
				for (int i = 0; i < items.size(); i++) {

					FileItem fileItem = (FileItem) items.get(i);

					// form 요소인지 판별
					if (fileItem.isFormField()) {
						// getFieldName : 파라메터 key
						// getString : 파라메터 value
						System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
					} else {
						// 첨부파일 영역

						// getSize : 파일 크기
						if (fileItem.getSize() > 0) {
							// 파일명 추출
							String fileName = fileItem.getName();

							fileName = System.currentTimeMillis() + "_" + fileName;

							File uploadFile = new File(currentDirPath + "\\" + fileName);
							String filePath = currentDirPath + "\\" + fileName;
							
							
							// 파일 저장
							fileItem.write(uploadFile);
							
							// DTO에 값 저장
							boardFileDTO.setFileName(fileName);
							boardFileDTO.setFilePath(filePath);
							boardFileDTO.setBoardId(boardId);
							
						} // end if
					} // end if
				} // end for

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// DAO에 전달 (insert)
			BoardFileDAO boardFileDAO = new BoardFileDAO();
			int result = boardFileDAO.uploadBoardFile(boardFileDTO);
			System.out.println("result : "+ result);
			
			 String url = "board?action=detail&boardId=" + boardId;
			 response.sendRedirect(url);
			
		}
		
		
		
	}

	@WebServlet("/download.do")
	public class FileDownload extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			String fileName = request.getParameter("filename");
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

}

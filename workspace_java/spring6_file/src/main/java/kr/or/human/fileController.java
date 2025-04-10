package kr.or.human;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class fileController {

	@RequestMapping("/uploadzz")
	public String uploadPage(HttpServletRequest request, HttpServletResponse response){
		return "uploadForm";
	}

	@RequestMapping("/upload")
    public String upload( MultipartHttpServletRequest req )  {
//		req.setChracterEnconding("utf-8");
        // multipart = 파일 다운로드 뜻함
		// multipart로 받으면 getParameter은 못 가져오는데,
		// MultipartHttpServletRequest는 됨 
		
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        System.out.println("title: "+ title);
        System.out.println("content: "+ content);
        
        // 파일 처리
        MultipartFile mf = req.getFile("file1");
        
        long fileSize = mf.getSize();
        System.out.println("fileSize: "+ fileSize);
        // 파일 크기(bite)
        
        String fileName = mf.getOriginalFilename();
        System.out.println("fileName: "+ fileName);
        
        try {
            String path = "C:\\temp\\upload";
            String safeFileName = path +"\\"+ System.currentTimeMillis() +"_"+ fileName;
            System.out.println("safeFileName: "+ safeFileName);
            File file = new File(safeFileName);
            
            mf.transferTo( file );
            // 파일을 위의 경로로 이동 시켜라. 
            
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return "uploadForm";
    }
	
	@RequestMapping("/uploads")
    public String uploads( MultipartHttpServletRequest req ) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
        // multipart = 파일 다운로드 뜻함
		// multipart로 받으면 getParameter은 못 가져오는데,
		// MultipartHttpServletRequest는 됨 
		
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        System.out.println("title: "+ title);
        System.out.println("content: "+ content);
        
        // 파일 처리
//        MultipartFile mf = req.getFile("file1");
        List<MultipartFile> fileList = req.getFiles("file1");
        
        for(MultipartFile mf : fileList) {
            long fileSize = mf.getSize();
            System.out.println("fileSize: "+ fileSize);
            // 파일 크기(bite)
            
            String fileName = mf.getOriginalFilename();
            System.out.println("fileName: "+ fileName);
            
            try {
                String path = "C:\\temp\\upload";
                String safeFileName = path +"\\"+ System.currentTimeMillis() +"_"+ fileName;
                System.out.println("safeFileName: "+ safeFileName);
                File file = new File(safeFileName);
                
                mf.transferTo( file );
                // 파일을 위의 경로로 이동 시켜라. 
                
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return "uploadForm";
    }
	
	
}




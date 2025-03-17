package boardFile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.Part;
import javax.sql.DataSource;

public class BoardFileDAO {
	
	private String getFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");

		// form-data;name="fileName";fileName="추가한 파일 이름"
		// split(";") 로 자르고,
		// trim().startWith, fileName으로 시작하는 요소를 얻음.
		// substring(indexOf("="로 시작, 2번째), 그리고 -1만큼
		String[] split = contentDisp.split(";");
		for(int i = 0; i < split.length; i++) {
			String temp = split[i];
			if(temp.trim().startsWith("fileName")) {
				return temp.substring(temp.indexOf("=") + 2, temp.length() - 1);
			}
		}
		
		return "";
	}
	
	
	
	
	public int insertBoardFile(BoardFileDTO boardFileDTO) {
	
		System.out.println("insertBoard 실행");
		int result = -1;
		
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String 	query =  " insert into P_BOARD (Board_id, empno, title, board_content, notice, create_date, reserve_date, views )";
					query += " values ( seq_p_board.nextval, ?, ?, ?, ?, sysdate, null, 0 )";
			PreparedStatement ps = con.prepareStatement(query);
			
//			ps.setInt(1, boardFileDTO.getEmpno());
//			ps.setString(2, boardFileDTO.getTitle());
//			ps.setString(3, boardFileDTO.getBoardContent());
//			ps.setInt(4, boardFileDTO.getNotice());

			// [SQL 실행] 및 [결과 확보]
			// int executeUpdate() : select 외 모든 것
			// int에는 영향받은 줄의 수
			result = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	
	}
	
	
}

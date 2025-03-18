package boardFile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.Part;
import javax.sql.DataSource;

public class BoardFileDAO {
	
	
	public int uploadBoardFile(BoardFileDTO boardFileDTO) {
		System.out.println("uploadBoardFile 실행");
		int result = -1;
		
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String 	query =  " insert into P_BOARD_File ";
					query += " (File_id, board_id, file_name, file_path, upload_date )";
					query += " values ( seq_p_board_board.nextval, ?, ?, ?, sysdate )";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, boardFileDTO.getBoardId());
			ps.setString(2, boardFileDTO.getFileName());
			ps.setString(3, boardFileDTO.getFilePath());

			// [SQL 실행] 및 [결과 확보]
			result = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
		
	
	}
	
	
}

package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDAO {

	public int insertBoard(BoardDTO boardDTO) {
		System.out.println("insertBoard 실행");
		int result = -1;
		
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String 	query =  " insert into p_board ";
					query += " values ( seq_p_board.nextval, ?, ?, ?, ?, sysdate, null, 0 )";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, boardDTO.getEmpno());
			ps.setString(2, boardDTO.getTitle());
			ps.setString(3, boardDTO.getBoardContent());
			ps.setInt(4, boardDTO.getNotice());

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
	
	
	public List selectBoard(){
		System.out.println("selectBoard 실행");
		List list = new ArrayList();

		
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String 	query =  " select * from p_board ";
			PreparedStatement ps = con.prepareStatement(query);

			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBoardId(rs.getInt("board_id"));
				dto.setEmpno(rs.getInt("empno"));
				dto.setTitle(rs.getString("title"));
				dto.setBoardContent(rs.getString("board_content"));
				dto.setNotice(rs.getInt("notice"));
				dto.setCreateDate(rs.getDate("create_date"));
				dto.setReserveDate(rs.getDate("reserve_date"));
				dto.setViews(rs.getInt("views"));
				
				list.add(dto);
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public int updateBoard(BoardDTO boardDTO) {
		System.out.println("updateBoard 실행");
		System.out.println(boardDTO);
		int result = -1;
		
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String 	query =  " update p_board ";
					query += " set title = ?, boardContent = ?, ";
					
					if(boardDTO.getReserveDate() != null) {
						query += " reserveDate = ? ";
						
					} else {
						query += " reserveDate = sysdate ";
					}
					query += " where boardId = ? ";
					
			PreparedStatement ps = con.prepareStatement(query);
			// 물음표에 값을 넣어달라
			
			ps.setString(1, boardDTO.getTitle());
			ps.setString(2, boardDTO.getBoardContent());
			ps.setDate(3, boardDTO.getReserveDate());
			ps.setInt(4, boardDTO.getBoardId());

			result = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	
	public int deleteBoard(BoardDTO boardDTO) {
		System.out.println("deleteBoard 실행");
		int result = -1;
		
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String 	query =  " delete from p_board ";
					query += " where boardId = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			
			// 첫번째 물음표에 값을 넣어달라
			ps.setInt(1, boardDTO.getBoardId());
			result = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
		
		}
	
	
	
}

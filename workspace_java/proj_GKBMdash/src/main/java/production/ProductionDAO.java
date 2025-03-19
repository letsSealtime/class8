package production;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class ProductionDAO {

	public List<ProductionDTO> getProductionByUnit(String unit){
		System.out.println("getProductionByUnit");
		List<ProductionDTO> productionList = new ArrayList<>();

		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			String 	query =  " select ";
			if ("week".equals(unit)) {
				query += " TO_CHAR(production_date, 'YYYY-MM-DD') AS production_date, ";
			} else if ("month".equals(unit)) {
				query += " TO_CHAR(production_date, 'IYYY-MM') AS production_date, ";
			} else if ("quarter".equals(unit)) {
				query += " TO_CHAR(production_date, 'YYYY-MM') AS production_date, ";
			}
			
			query += " SUM(quantity) AS quantity ";
			query += " FROM P_PRODUCTION ";
			query += " GROUP BY production_date ";
			query += " ORDER BY production_date ";
			
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			// [SQL 실행] 및 [결과 확보]
			while (rs.next()) {
                ProductionDTO productionDTO = new ProductionDTO();
                productionDTO.setProductionDate(rs.getString("production_date"));
                productionDTO.setQuantity(rs.getInt("quantity"));
                productionList.add(productionDTO);
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return productionList;
	}
	
	public int insertProduction(ProductionDTO productionDTO) {
        int result = -1;
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            Connection con = ds.getConnection();

            String query = "INSERT INTO P_PRODUCTION (production_id, production_date, quantity, work_order_id, week_plan_id, unit) " +
                           "VALUES (seq_p_production.nextval, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

//            ps.setDate(1, new java.sql.Date(productionDTO.getProductionDate().getTime()));
            ps.setInt(2, productionDTO.getQuantity());
            ps.setInt(3, productionDTO.getWorkOrderId());
            ps.setInt(4, productionDTO.getWeekPlanId());
            ps.setString(5, productionDTO.getUnit());

            result = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
	

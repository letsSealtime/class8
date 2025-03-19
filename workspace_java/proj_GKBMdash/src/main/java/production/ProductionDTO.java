package production;

import java.sql.Date;

public class ProductionDTO {
	
	int productionId;
	String productionDate;
	int quantity;
	int workOrderId;
	int weekPlanId;
	String unit;
	
	public int getProductionId() {
		return productionId;
	}
	public void setProductionId(int productionId) {
		this.productionId = productionId;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getWorkOrderId() {
		return workOrderId;
	}
	public void setWorkOrderId(int workOrderId) {
		this.workOrderId = workOrderId;
	}
	public int getWeekPlanId() {
		return weekPlanId;
	}
	public void setWeekPlanId(int weekPlanId) {
		this.weekPlanId = weekPlanId;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	
}

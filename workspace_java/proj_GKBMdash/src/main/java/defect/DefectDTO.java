package defect;

import java.sql.Date;

public class DefectDTO {

	Date defectDate;
	int week;
	int defectCount;
	int skuCategory;
	String defectType;
	int workOrderId;
	public Date getDefectDate() {
		return defectDate;
	}
	public void setDefectDate(Date defectDate) {
		this.defectDate = defectDate;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getDefectCount() {
		return defectCount;
	}
	public void setDefectCount(int defectCount) {
		this.defectCount = defectCount;
	}
	public int getSkuCategory() {
		return skuCategory;
	}
	public void setSkuCategory(int skuCategory) {
		this.skuCategory = skuCategory;
	}
	public String getDefectType() {
		return defectType;
	}
	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}
	public int getWorkOrderId() {
		return workOrderId;
	}
	public void setWorkOrderId(int workOrderId) {
		this.workOrderId = workOrderId;
	}
	
}

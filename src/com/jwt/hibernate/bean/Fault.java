package com.jwt.hibernate.bean;

public class Fault {
	private int ConnectionNo;
	private String MaterialDw;
	private String MaterialDc;
	private String MaterialPb;
	private String Note;
	private String Fixed;
	
	
	public int getConnectionNo() {
		return ConnectionNo;
	}
	public void setConnectionNo(int connectionNo) {
		ConnectionNo = connectionNo;
	}
	public String getMaterialDw() {
		return MaterialDw;
	}
	public void setMaterialDw(String materialDw) {
		MaterialDw = materialDw;
	}
	public String getMaterialDc() {
		return MaterialDc;
	}
	public void setMaterialDc(String materialDc) {
		MaterialDc = materialDc;
	}
	public String getMaterialPb() {
		return MaterialPb;
	}
	public void setMaterialPb(String materialPb) {
		MaterialPb = materialPb;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public String getFixed() {
		return Fixed;
	}
	public void setFixed(String fixed) {
		Fixed = fixed;
	}

}

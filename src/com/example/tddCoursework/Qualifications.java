package com.example.tddCoursework;

public class Qualifications {
	
	private String startDateQ;
	private String Level;
	private String fullName;
	// Constructor for making qualifications
	public Qualifications(String startDateQ, String Level, String fullName){
		this.startDateQ = startDateQ;
		this.Level = Level;
		this.fullName = fullName;
	}
	
	
	public String getStartDateQ() {
		return startDateQ;
	}
	public void setStartDateQ(String startDateQ) {
		this.startDateQ = startDateQ;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	

}

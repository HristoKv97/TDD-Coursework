package com.example.tddCoursework;

import java.util.ArrayList;

public class Employees {

	private String name;
	private String homeaddress;
	private String phoneNumber;
	private String department;
	private final int staffID;
	private String startDate;
	private ArrayList<Qualifications> addition;

	// Constuctor for making employees
	public Employees(int ID ,String name, String homeaddress, String phoneNumber, String department,  String startDate) {

		this.name = name;
		this.homeaddress = homeaddress;
		this.phoneNumber = phoneNumber;
		this.department = department;
		staffID = ID;
		this.startDate = startDate;
		addition = new ArrayList<Qualifications>();
	}

	public ArrayList<Qualifications> getAddition() {
		return addition;
	}

	public void setAddition(ArrayList<Qualifications> addition) {
		this.addition = addition;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public int getStaffID() {
		return staffID;
	}
	
	

}

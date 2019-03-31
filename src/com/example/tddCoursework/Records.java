package com.example.tddCoursework;


import java.util.ArrayList;

public class Records {
	
	
	// Making list to be filled with employees
	private ArrayList<Employees> employee = new ArrayList<Employees>();
	// Setting the ID so it cannot be changed
	private int ID = 0;

	
	
	//Method for adding employees

	public void addEmployee(String name, String homeaddress, String phoneNumber, String department, String startDate) {
		
		Employees emp = new Employees(ID , name, homeaddress, phoneNumber, department,startDate);
		getEmployee().add(emp);
		ID++;

	}
	// Method for searching people with matching names from the employee list
	public ArrayList<Employees> nameSearch(String name) {
		ArrayList<Employees> results = new ArrayList<Employees>();
		for (int i = 0; i < employee.size(); i++) {
			if (getEmployee().get(i).getName().equals(name)) {
				results.add(getEmployee().get(i));
			}
		}
		if (results.isEmpty())
			return null;
		else {
			return results;
		}
	}
	 
	// Method for changing the employee name and address
	public void changeDetails(int idx, String name, String address) {
		if (!name.equals(null)) {
			getEmployee().get(idx).setName(name);
		}
		if (!address.equals(null)) {
			getEmployee().get(idx).setHomeaddress(address);
		}

	}
	// Method for adding qualifications
	public void addQualification(int ID, String fullName, String Level,
			String startDateQ) {
		
		Qualifications addition = new Qualifications( startDateQ, Level, fullName);
		addition.setFullName(fullName);
		addition.setLevel(Level);
		addition.setStartDateQ(startDateQ);
		for (int i = 0; i < getEmployee().size(); i++) {
			if (getEmployee().get(i).getStaffID() == ID) {
				getEmployee().get(i).getAddition().add(addition);
			}

		}

	}
	// Method for printing the details of all employees and their qualifications
	public void print() {
		
		for (Employees i : getEmployee()) {
			System.out.printf("Employee %d:\n\tName: %s\n\tAddress: %s\n\tPhone: %s\n\tDepartment: %s\n\tDate: %s\n",
					i.getStaffID(), i.getName(), i.getHomeaddress(), i.getPhoneNumber(), i.getDepartment(),
					i.getStartDate());
				for(Qualifications j : i.getAddition()){
					System.out.printf("Name of qualification: %s\n\tLevel: %s\n\tStart Date: %s\n", j.getFullName() , j.getLevel(), j.getStartDateQ());
				}
		}
		

	}
	public ArrayList<Employees> getEmployee() {
		return employee;
	}


	public void setEmployee(ArrayList<Employees> employee) {
		this.employee = employee;
	}
	
	
	public static void main(String[] args) {
		

	}


}

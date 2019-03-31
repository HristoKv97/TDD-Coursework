package com.example.tddCoursework;

import java.util.ArrayList;


public class RecordsTest {
	
	ArrayList<Qualifications> addition;
	ArrayList<Employees> employee;

	// method for testing if all the employees and their details can be printed
	public void print() {
		Records a1 = new Records();

		a1.addEmployee("John", "London", "0782321231", "IT", "14/02/2008");
		a1.addQualification(0, "Java SE", "Professional", "12/12/2012");
		
		a1.addEmployee("John", "Newcastle", "2132512312", "Bussiness", "17/05/2010");
		a1.addQualification(1, "Javascript", "Professional", "03/03/2011");
		
		a1.addEmployee("Sam", "Sunderland", "1231232132", "Research", "5/12/2012");
		a1.addQualification(2, "Python", "Professional", "06/08/2010");
		
		a1.print();
		
	}

	
	
	
	public static void main(String[] args) {
		
		RecordsTest test = new RecordsTest();
		test.print();
	
	}

}

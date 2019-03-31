package com.example.tddCoursework;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ExampleLoggingTest extends AbstractLoggingJUnitTest {
	Records a1;

	Employees a;
	Employees b;
	Employees c;

	ArrayList<Qualifications> addition;

	ArrayList<Employees> employee;

		// Initilizing all the details needed 
	@Before
	public void initialize() {
		
		a1 = new Records();
		
		a1.addEmployee("John", "London", "0782321231", "IT", "14/02/2008");
		a1.addQualification(0, "Java SE", "Professional", "12/12/2012");
		
		a1.addEmployee("John", "Newcastle", "2132512312", "Bussiness", "17/05/2010");
		a1.addQualification(1, "Javascript", "Professional", "03/03/2011");
		
		a1.addEmployee("Sam", "Sunderland", "1231232132", "Research", "5/12/2012");
		a1.addQualification(2, "Python", "Professional", "06/08/2010");
		
	}

	// Testing if all the information have been successfully  added to the lists trough the metods and can be retrieved
	@Test
	public void inputInformation() {
		
		assertNotNull("Name not initilized",a1.getEmployee().get(0).getName());
		assertEquals("Name not assigned correctly", "John", a1.getEmployee().get(0).getName());
		assertNotNull("Address not initialized", a1.getEmployee().get(0).getHomeaddress());
		assertEquals("Address is not correct", "London",a1.getEmployee().get(0).getHomeaddress());
		assertNotNull("Phone number is not assigned", a1.getEmployee().get(0).getPhoneNumber());
		assertEquals("Phone number is incorrect", "0782321231", a1.getEmployee().get(0).getPhoneNumber());
		assertNotNull("Start date is not assigned",a1.getEmployee().get(0).getStartDate());
		assertEquals("Start date is incorrect", "14/02/2008", a1.getEmployee().get(0).getStartDate());
		
	}

	// Testing if the method for searching by name works and the information retrieved is correct
	@Test
	public void findEmplByName() {

		int i = 0;

		for (Employees e : a1.nameSearch("John")) {

			assertEquals("Employees with the same name not found", "John", e.getName());
			i++;
		}
		
	}

	// Testing if the method for adding qualifications works and the information is correct
	@Test
	public void addQualification(){
		if(a1.getEmployee().get(0).getAddition().size() <= 0){
			System.out.println("Adding failed");
		}else{ 
			assertNotNull("Qualification name not initialized", a1.getEmployee().get(0).getAddition().get(0).getFullName());
			assertEquals("Qualification name not selected correctly" , "Java SE", a1.getEmployee().get(0).getAddition().get(0).getFullName());
			
			assertNotNull("Qualification level not initialized", a1.getEmployee().get(0).getAddition().get(0).getLevel());
			assertEquals("Qualification level not selected correctly" , "Professional",a1.getEmployee().get(0).getAddition().get(0).getLevel());
			
			assertNotNull("Qualification date not initialized", a1.getEmployee().get(0).getAddition().get(0).getStartDateQ());
			assertEquals("Qualification date not selected correctly" , "12/12/2012",a1.getEmployee().get(0).getAddition().get(0).getStartDateQ());
		}
	}
	//Testing if the method for chaning name and address works and the new information is correctly set
	@Test
	public void changeDetails(){
		
		a1.changeDetails(0, "Jack", "Leeds");
		
		assertEquals("Name change failed", "Jack", a1.getEmployee().get(0).getName());
		assertEquals("Address change failed", "Leeds", a1.getEmployee().get(0).getHomeaddress());
		
		
	}
	
}

package com.harsh.sampleJavaApp.ui;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import com.harsh.sampleJavaApp.daoManager.EmployeeManager;

public class Test {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
	/*	Scanner s = new Scanner(System.in);
		System.out.print("Enter employee's Name: ");
		String name = s.next();
		System.out.println("Enter employee's ");	*/	
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.getAllEmployees();
	}
	
}

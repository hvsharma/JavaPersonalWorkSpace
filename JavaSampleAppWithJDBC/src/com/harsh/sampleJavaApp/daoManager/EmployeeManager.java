package com.harsh.sampleJavaApp.daoManager;

import java.util.List;

import com.harsh.sampleJavaApp.businessObjects.Employee;

public class EmployeeManager {
	
	public List<Employee> getAllEmployees() {
		return EmployeeDAO.getAllEmployees();
	}
	
}

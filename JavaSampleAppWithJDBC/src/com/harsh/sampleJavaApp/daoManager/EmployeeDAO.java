package com.harsh.sampleJavaApp.daoManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.harsh.sampleJavaApp.businessObjects.Employee;

class EmployeeDAO {
	
	static List<Employee> getAllEmployees() {
		
		String query = "Select * from EmployeeDetails";
		
		try {
			PreparedStatement stmt = DBConnectionManager.getConnection().prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			List<Employee> empList = new ArrayList<>();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				/*Employee emp = new Employee();
				emp.setEmpID(emp);*/
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	static Employee	getEmployeeByID(String empID) {
		return null;
	}
	
	
}

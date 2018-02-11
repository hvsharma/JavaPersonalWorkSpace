package com.harsh.sampleJavaApp.businessObjects;

import java.time.LocalDate;

public class Employee {
	
	private String empID;
	private String empName;
	private LocalDate dob;
	private String userRole;
	private String email;
		
	public Employee(String empID, String empName, LocalDate dob, String userRole, String email) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.dob = dob;
		this.userRole = userRole;
		this.email = email;
	}
	
	public Employee() {
		super();
	}
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empID=");
		builder.append(empID);
		builder.append(", empName=");
		builder.append(empName);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", userRole=");
		builder.append(userRole);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}	
	
}

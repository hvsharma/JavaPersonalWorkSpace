package com.harsh.healthPlanDemo;

import java.util.List;

public class HealthPlanRegistration 
{
	private String employeeID;
	
	private String employeeName;

	private String errorMessage;
	
	private List<HealthPlan> healthPlanList;
	
	private HealthPlan plan;
	
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID.trim();
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName.trim();
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public HealthPlan getPlan() {
		return plan;
	}
	
	public void setPlan(HealthPlan plan) {
		this.plan = plan;
	}
	
	public List<HealthPlan> getHealthPlanList() {
		return healthPlanList;
	}

	public void setHealthPlanList(List<HealthPlan> healthPlanList) {
		this.healthPlanList = healthPlanList;
	}

	public HealthPlanRegistration()
	{
		HealthPlanFinder finder = new HealthPlanFinderImpl();
		this.healthPlanList = finder.getAllHealthPlans();
		this.plan=healthPlanList.get(0);
	}

	public String register() 
	{
		if (!isAnyEmpty(employeeID, employeeName)) 
		{
			return "success";			
		}
		else
		{
			this.errorMessage = "Missing Data Input!";
			return "error";
		}
	}
	
	private boolean isAnyEmpty(String... values)
	{
		for (String string : values) 
		{
			if(string==null||string.trim().isEmpty())
			{
				return true;
			}
		}
		
		return false;
	}
}

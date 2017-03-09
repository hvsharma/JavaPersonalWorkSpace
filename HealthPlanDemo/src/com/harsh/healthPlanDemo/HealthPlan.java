package com.harsh.healthPlanDemo;

public class HealthPlan 
{
	private String planName;
	private int monthlyPremium;
	private String phoneNumber;
	
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getMonthlyPremium() {
		return monthlyPremium;
	}
	public void setMonthlyPremium(int monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public HealthPlan(String planName, int monthlyPremium, String phoneNumber) {
		super();
		this.planName = planName;
		this.monthlyPremium = monthlyPremium;
		this.phoneNumber = phoneNumber;
	}
	
	public HealthPlan()
	{
		
	}
	
	@Override
	public String toString() 
	{
		return planName+";"+String.valueOf(monthlyPremium)+";"+phoneNumber;
	}
}

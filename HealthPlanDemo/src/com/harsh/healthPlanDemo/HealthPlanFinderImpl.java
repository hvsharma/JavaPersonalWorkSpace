package com.harsh.healthPlanDemo;

import java.util.ArrayList;
import java.util.List;

public class HealthPlanFinderImpl implements HealthPlanFinder {

	private List<HealthPlan> healthPlansList;
	
	@Override
	public HealthPlan findHealthPlan(String healthPlanName) 
	{
		for (HealthPlan healthPlan : healthPlansList) 
		{
			if(healthPlan.getPlanName().equalsIgnoreCase(healthPlanName))
			{
				return healthPlan;
			}
		}
		
		return null;
	}

	public HealthPlanFinderImpl()
	{
		this.healthPlansList = new ArrayList<HealthPlan>();
		healthPlansList.add(new HealthPlan("ProtectionBasic", 1000, "+91-9039256020"));
		healthPlansList.add(new HealthPlan("ProtectionPlus", 2000, "+91-7702040091"));
		healthPlansList.add(new HealthPlan("ProtectionUltimate", 1000, "+91-8003000360"));
	}

	@Override
	public List<HealthPlan> getAllHealthPlans() 
	{
		return this.healthPlansList;
	}
	
	
}

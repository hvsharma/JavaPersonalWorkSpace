package com.harsh.healthPlanDemo;

import java.util.List;

public interface HealthPlanFinder 
{
	public HealthPlan findHealthPlan(String healthPlanName);
	
	public List<HealthPlan> getAllHealthPlans();
}

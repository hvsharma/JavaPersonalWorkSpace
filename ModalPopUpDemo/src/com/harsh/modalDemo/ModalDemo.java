package com.harsh.modalDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.event.AjaxBehaviorEvent;


public class ModalDemo
{
	private boolean priorityShipping;
	
	private boolean outsideItemsAdded;
	
	private boolean agreePriorityShipPayment;
	
	private boolean agreeOutsideContractsPayment;
	
	private String purchaseOrderNumberText;
	
	private List<Supplies> suppliesList;
	
	private List<NonContractSupplies> nonContractSuppliesList;

	private List<Supplies> suppliesOrders;
	
	private List<NonContractSupplies> nonContractSuppliesOrders;
	
	

	public ModalDemo()
	{
		this.suppliesList = DataProvider.getAllSupplies();
		this.nonContractSuppliesList = DataProvider.getAllNonContractSupplies();
		
		this.suppliesOrders = new ArrayList<Supplies>();
		this.nonContractSuppliesOrders = new ArrayList<NonContractSupplies>();
	}
	
	public String submitForm()
	{	
		
		return null;
	}
	
	public String addNonContractItemsToOrderList()
	{
		if(nonContractSuppliesList!=null)
		{
			for (NonContractSupplies nonContractSupplies : nonContractSuppliesList)
			{
				if(!nonContractSuppliesOrders.contains(nonContractSupplies))
				{
					if(nonContractSupplies.isAddedToOrder())
					{
						nonContractSuppliesOrders.add(nonContractSupplies);
					}	
				}
			}
			
			Iterator<NonContractSupplies> iterator = nonContractSuppliesOrders.iterator();
			
			while(iterator.hasNext())
			{
				NonContractSupplies nonContractSupplies = iterator.next();
				if(!nonContractSupplies.isAddedToOrder())
				{
					iterator.remove();
				}
			}
			
			if(nonContractSuppliesOrders.isEmpty())
			{
				outsideItemsAdded = false;
			}
			else
			{
				outsideItemsAdded = true;
			}
			
		}
		
		return null;
		
	}
	
	public String removeItemFromList(NonContractSupplies nonContractSupplies)
	{
		nonContractSuppliesOrders.remove(nonContractSupplies);
		return null;
	}
	
	public boolean isPriorityShipping()
	{
		return priorityShipping;
	}

	public void setPriorityShipping(boolean priorityShipping)
	{
		this.priorityShipping = priorityShipping;
	}

	public boolean isOutsideItemsAdded()
	{
		return outsideItemsAdded;
	}

	public void setOutsideItemsAdded(boolean outsideItemsAdded)
	{
		this.outsideItemsAdded = outsideItemsAdded;
	}

	public boolean isAgreePriorityShipPayment()
	{
		return agreePriorityShipPayment;
	}

	public void setAgreePriorityShipPayment(boolean agreePriorityShipPayment)
	{
		this.agreePriorityShipPayment = agreePriorityShipPayment;
	}

	public boolean isAgreeOutsideContractsPayment()
	{
		return agreeOutsideContractsPayment;
	}

	public void setAgreeOutsideContractsPayment(
			boolean agreeOutsideContractsPayment)
	{
		this.agreeOutsideContractsPayment = agreeOutsideContractsPayment;
	}

	public String getPurchaseOrderNumberText()
	{
		return purchaseOrderNumberText;
	}

	public void setPurchaseOrderNumberText(String purchaseOrderNumberText)
	{
		this.purchaseOrderNumberText = purchaseOrderNumberText;
	}

	public List<Supplies> getSuppliesList()
	{
		return suppliesList;
	}

	public void setSuppliesList(List<Supplies> suppliesList)
	{
		this.suppliesList = suppliesList;
	}

	public List<NonContractSupplies> getNonContractSuppliesList()
	{
		return nonContractSuppliesList;
	}

	public void setNonContractSuppliesList(
			List<NonContractSupplies> nonContractSuppliesList)
	{
		this.nonContractSuppliesList = nonContractSuppliesList;
	}

	public List<Supplies> getSuppliesOrders()
	{
		return suppliesOrders;
	}

	public void setSuppliesOrders(List<Supplies> suppliesOrders)
	{
		this.suppliesOrders = suppliesOrders;
	}

	public List<NonContractSupplies> getNonContractSuppliesOrders()
	{
		return nonContractSuppliesOrders;
	}

	public void setNonContractSuppliesOrders(
			List<NonContractSupplies> nonContractSuppliesOrders)
	{
		this.nonContractSuppliesOrders = nonContractSuppliesOrders;
	}

}

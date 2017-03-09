package com.harsh.modalDemo;

public class Supplies
{
	private String productCode;
	private String supplyOrderNum;
	private String productDescription;
	private String someDummyValue;
	private boolean updateFlag;
	private int quantity;
	
	public String getProductCode()
	{
		return productCode;
	}
	public void setProductCode(String productCode)
	{
		this.productCode = productCode;
	}
	public String getSupplyOrderNum()
	{
		return supplyOrderNum;
	}
	public void setSupplyOrderNum(String supplyOrderNum)
	{
		this.supplyOrderNum = supplyOrderNum;
	}
	public String getProductDescription()
	{
		return productDescription;
	}
	public void setProductDescription(String productDescription)
	{
		this.productDescription = productDescription;
	}
	
	public String getSomeDummyValue()
	{
		return someDummyValue;
	}
	
	public void setSomeDummyValue(String someDummyValue)
	{
		this.someDummyValue = someDummyValue;
	}
	public boolean isUpdateFlag()
	{
		return updateFlag;
	}
	public void setUpdateFlag(boolean updateFlag)
	{
		this.updateFlag = updateFlag;
	}	
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public Supplies(String productCode, String supplyOrderNum, String productDescription, String someDummyValue)
	{
		this.productCode = productCode;
		this.supplyOrderNum = supplyOrderNum;
		this.productDescription = productDescription;
		this.someDummyValue = someDummyValue;
	}
	
	public Supplies()
	{
		
	}
	
	
}

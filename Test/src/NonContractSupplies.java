

public class NonContractSupplies
{
	private String productCode;
	private String supplyOrderNum;
	private String productDescription;
	private boolean addedToOrder;
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
	
	
	public boolean isAddedToOrder()
	{
		return addedToOrder;
	}
	public void setAddedToOrder(boolean addedToOrder)
	{
		this.addedToOrder = addedToOrder;
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
	public NonContractSupplies(String productCode, String supplyOrderNum, String productDescription)
	{
		this.productCode = productCode;
		this.supplyOrderNum = supplyOrderNum;
		this.productDescription = productDescription;
	}
	
	public NonContractSupplies()
	{
		
	}
}

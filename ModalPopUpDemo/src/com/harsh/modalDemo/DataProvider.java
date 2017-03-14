package com.harsh.modalDemo;

import java.util.ArrayList;
import java.util.List;

public class DataProvider
{
	public static List<Supplies> getAllSupplies()
	{
		List<Supplies> suppliesList = new ArrayList<Supplies>();
		suppliesList.add(new Supplies("MX02", "RX091029", "Awesome Printer Cartridge!", "Dummy!"));
		suppliesList.add(new Supplies("MX03", "RX091030", "Awesome Printer Cartridge - 2!", "Dummy!"));
		suppliesList.add(new Supplies("MX04", "RX091031", "Awesome Printer Cartridge - 3!", "Dummy!"));
		suppliesList.add(new Supplies("MX05", "RX091032", "More Awesome Printer Cartridge!", "Dummy!"));
		suppliesList.add(new Supplies("MX06", "RX091033", "The Most Awesome Printer Ink!", "Dummy!"));
		suppliesList.add(new Supplies("MX07", "RX091034", "F*ing Awesome Printer Cartridge!", "Dummy!"));
				
		return suppliesList;
	}
	
	public static List<NonContractSupplies> getAllNonContractSupplies()
	{
/*		List<NonContractSupplies> nonContractSuppliesList = new ArrayList<NonContractSupplies>();
*/		List<NonContractSupplies> nonContractSuppliesList = null;
		
	/*	nonContractSuppliesList.add(new NonContractSupplies("NU01", "TXDL8908", "Awesome Staple Pins!"));
		nonContractSuppliesList.add(new NonContractSupplies("NU03", "TXDL8909", "More Awesome Staple Pins!"));
		nonContractSuppliesList.add(new NonContractSupplies("NU04", "TXDL8910", "The Most Awesome Staple Pins!"));
		nonContractSuppliesList.add(new NonContractSupplies("NU05", "TXDL8911", "F*ing Awesome Staple Pins!"));*/
		
		return nonContractSuppliesList;
	}
}

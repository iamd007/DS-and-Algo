package com.durga.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// stock date and value
// stock A-JAN 1 100 RS 
// stock B-JAN 1 150 RS
// stock A-JAN 2 200 RS



class StockDetails
{
	String stockType;
	int stockPrice;
	
	public String getStockType() {
		return stockType;
	}
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	
}

interface MemeCache{
	public void setData();
	public void getData();
}



interface FileAPI{
    // Stock Details 16-09-2020 	
	public List< List<Object>> getFileData(String fileLocation,
			                           int startIndex ,int lastIndex);
}



public class StorageFileApplication {

	public static void m1()
	{ 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Date,ArrayList<StockDetails>> stockDayWise = new HashMap<>();
		String filePath="";
		FileAPI fileApi = null;
		List<List<Object>> list =fileApi.getFileData(filePath, 0, 1000);
		
		for(List<Object> li: list )
		{
		   StockDetails tempData = new StockDetails();
		   tempData.setStockPrice((Integer)li.get(2));
		   tempData.setStockType((String)li.get(0));
		   Date date =(Date)li.get(1);
		   if(stockDayWise.containsKey(date))
		   {
			   stockDayWise.get(date).add(tempData);
		   }else
		   {
			   stockDayWise.put(date,new ArrayList<StokDetails>)();
			   stockDayWise.get(date).add(tempData);
		   }
		
		  m1();
		}
		
		

	}

}

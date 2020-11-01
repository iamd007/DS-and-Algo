package com.valencia.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


enum Weak
{
	sun;
}

class Obj
{
	int count;
	String value;
	Obj(int count,String value)
	{
		this.count = count;
		this.value = value;
	}
}

public class DemoOak {

	
	public void myMethod(String... strings)
	{
		
	}
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		Map<String,Integer> resMap = new HashMap<String,Integer>();
		HashMap<Integer,Obj> hm = new HashMap<Integer,Obj>();
		map.put("apple", 3);
		map.put("apple", 5);
		map.put("banana", 3);
		map.put("grape", 3);
		map.put("Guavava",4);
		map.put("pineapple", 3);
		
		
		Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		//	System.out.println(it.next().getValue());
			
		}
		
		
		
		
		
		/*for(Map.Entry<String, Integer> e : map.entrySet())
		{
			if(hm.containsKey(e.getValue()))
			{
				Obj  temp = hm.get(e.getValue());
				temp.count++;
				hm.put(e.getValue(),temp);
			}
			else
				hm.put(e.getValue(), new Obj(1,e.getKey()));
		}
		
		for(Map.Entry<Integer , Obj> e :  hm.entrySet())
		{
			Obj temp = e.getValue();
			System.out.println(temp.count +" "+ temp.value);
			if(temp.count >1)
			{
			   map.remove(temp.value);
			}
		}
		
		System.out.println(map);
		
		*/
		
		
		
		int low =1;
		int high =100000000;
		int k =2;
		int count=0;
		for(int i=low;i<=high;i++)
		{
			if(i%2==0)
				count++;
		}
		int totalNumer = high-low+1;
		int res = (int) (Math.pow(totalNumer,k-1)*count);
		System.out.println("resutl is "+res);
		
	}

}

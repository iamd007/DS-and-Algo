package com.durga.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

 class ObjectSer{
	
	Map<String,Integer> map = new ConcurrentHashMap<String, Integer>();
    
	int count;
   
	
	public void addValue(String key,Integer value){
		if(map.get(key) == null){
			map.put(key, value);
		}
	}
	
	public  int getCount(){   
		return count; 
	}
	
	
	public  void setCount(int count){  
		this.count = count;
	}
	
	public  int addObject(int a,int b){
	 	         
		
	   return a+b;    
		
	 }
	
}

//
//
//
//
//
//
public class ObjectService {
	
	public static void display(int i){
		System.out.println("int integer");
	}
	public static void display(String i){
		System.out.println("into string");
	}

	public static void main(String[] args) {
		/*bjectSer ob1 = new ObjectSer();
		ob1.getCount();
		ob1.addValue("rishi", 1);
		System.out.println(ob1.map.get("rishi"));*/
		display(null);

	}

}

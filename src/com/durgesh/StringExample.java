package com.durgesh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;



public class StringExample {
    
	public ArrayList<Integer> processArray(ArrayList<Integer> array)
	{
	   int a[] = new int[array.size()];
	   for(int i=0;i<array.size();i++)
	   {
		   a[i] = array.get(i);
		   //System.out.print(" "+a[i]);
	   }
	   array.clear();
	  // System.out.println("befor  "+array);
	   //System.out.println();
	   for(int i=0;i<a.length;i++)
	   {
		   int count=0;
		   boolean checkGreater = false;
		   
		   while(a[i] >100)
		   {
			   count++;
			   i++;
			   checkGreater = true;
		   }
		   if(checkGreater)
			    array.add(count);
		   array.add(a[i]);
		   
	   }
	   
		return array;
	}
	
    public static void main(String[] args) {
    	StringExample s = new StringExample();
    	int a[] = {22,113,135,62,14,161,129,375,66,7};
    	ArrayList<Integer> arrayList = new ArrayList<Integer>();
    	for(int i=0;i<a.length;i++)
    		arrayList.add(a[i]);
        //s.processArray(arrayList);
      System.out.println(s.processArray(arrayList));
    }
}
    
    
   

package com.durgesh;

import java.util.ArrayList;

public class ArrayListExample {

	public static int calculateSize(ArrayList<Integer> array )
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
		   
			
		
		return array.size();
	}
	
	public static void main(String[] args) {

           ArrayList<Integer> array = new ArrayList<>();
           array.add(22);
           array.add(113);
           array.add(161);
           array.add(7);
           
           int n = calculateSize(array);
           for(int i=0; i<n; i++)
           System.out.println(array.get(i));

	}

}

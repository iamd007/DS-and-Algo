package com.durgesh;

import java.util.HashMap;
import java.util.Iterator;

abstract class Parent
{
	public static void add()
	{
		System.out.println("add");
	}
	static{
		System.out.println("sp");
	}
	{
		System.out.println("pi");
	}
	Parent()
	{
		System.out.println("pc");
	}
	
}


class child extends Parent 
{
	static{
		System.out.println("sc");
	}
	{
		System.out.println("ci");
	}
	child()
	{
		System.out.println("cc");
	}	
}

public class childmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
       System.out.println("hello");
       
       int a[]  = {1,12,3,14,5,16};
    		   int fl =a[0];
    		   int sl = Integer.MAX_VALUE;
    		   for(int i = 0; i<a.length;i++)
    		   {
    			   if(sl > a[i])
    			   {
    				   sl = a[i];
    			   }
    			   if(fl > a[i])
    			   {
    				   sl = fl;
    				   fl = a[i];
    			   }
    			   
    				   
    		   }
    		 System.out.println(sl);  
       
       
	}

}

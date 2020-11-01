package com.valencia.test;

public class TestScenarios {

	public static int sum(int a,int b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	  int sum = sum(10,15)+sum(-3,-4);
	  if(sum == 18)
		  System.out.println("passed");
	  else
		  System.out.println("failed");
			
		

	}

}

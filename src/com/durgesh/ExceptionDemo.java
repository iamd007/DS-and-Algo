package com.durgesh;

import java.io.IOException;

public class ExceptionDemo {

	
	public static double division(int a,int b) throws CustomException
	{
		/*if(b==0)
			throw  new CustomException(" Divisor cant be zero");*/
		return (double)(a/b);
	}
	
	
	public static void main(String arg[]) throws CustomException
	{
		
		System.out.println(division(10,0));
	}
}

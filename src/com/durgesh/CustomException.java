package com.durgesh;

public class CustomException extends Exception{

	
	public CustomException(String str) {
		super(str);
		System.out.println("Into custom Exception");
		
		// TODO Auto-generated constructor stub
	}
}

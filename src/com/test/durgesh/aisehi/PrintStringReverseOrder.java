package com.test.durgesh.aisehi;

public class PrintStringReverseOrder {

	public static void reversePrint(String s){
		if(s.length() == 0)
			 return;
		reversePrint(s.substring(1));
		System.out.print(s.charAt(0));
	}
	public static void display(Integer a){
	  System.out.println("into integer");
	}
	
	public static void main(String[] args) {
		reversePrint("durgesh");
		display(null);

	}

}

package com.test.durgesh.aisehi;

public class TestDevyani {

	public static void main(String[] args) {
		
			
		Integer a = 90;
		Long aa = 40l;
	
		StringBuilder sb = new StringBuilder("d");
		StringBuilder sb1 = new StringBuilder("d");
		
		System.out.println(sb==sb1);  //false
		System.out.println(sb.equals(sb1)); //treu
		
		String s = "abc";
		String d = "abc";
		System.out.println(d);
		d="abcd";
		System.out.println(d);
		s="cde";
		System.out.println(s);
		
		
		String ds = "devyani";
		System.out.println(ds.substring(1,4));

	}

}

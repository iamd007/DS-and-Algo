package com.anurag.test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ExceptionExample {

	
	public static void main(String arg[])
	{
		int b=0;
		try{
			int a =10/0;
		}catch(RuntimeException e)
		{
			b=9;
			System.out.println(e.getMessage());
		}
		System.out.println("value of b "+ b);
		System.out.println("HI I AM DURGESH mISHRA");
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(89);
		al.stream().forEach(System.out::println);
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Durgesh");
		al1.add("Mishra");
		al1.add("Hamare");
		ArrayList<String > al2 = (ArrayList<String>) al1.stream().map(s->s.substring(2)).collect(Collectors.toList());
		System.out.println(al2);
		
	}
}

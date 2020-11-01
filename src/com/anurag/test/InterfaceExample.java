package com.anurag.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

interface Phone
{
	public void phone();
	default public void message()
	{
		System.out.println("set");
	}
}

class Android implements Phone
{

	@Override
	public void phone() {
		System.out.println("calling");
		
	}
   @Override
   public void message()
   {
	   System.out.println("a1");
   }
}


public class InterfaceExample {

	public static void main(String[] args) {
		
		Phone a1 = new Android();
		a1.phone();
		a1.message();
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		Consumer<Integer> c= (i)-> System.out.println(i); 
		
		
		values.forEach( c); //Lamda Expresssion
		List<Integer> values1 =values.stream().filter(i->i%2!=0).collect(Collectors.toList());
		List<Integer> values2 =values.stream().filter(i->i%2!=0).collect(Collectors.toList());

	}

}

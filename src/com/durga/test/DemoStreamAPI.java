package com.durga.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
			li.add(i);
		List<Integer> lii = li.stream().map(i->i+10).collect(Collectors.toList());
		
		lii.stream().forEach(i->System.out.print(" " +i));

	}

}

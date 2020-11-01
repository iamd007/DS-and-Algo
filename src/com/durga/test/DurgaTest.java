package com.durga.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DurgaTest {

	public static void display(String str)
	{
		System.out.println("str");
	}
	public static void display(int str)
	{
		System.out.println("int");
	}
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.addAll(Arrays.asList(1,2,12,4));
		AtomicInteger i = new AtomicInteger();
		
		List<Integer> custom = li.stream().map(i::addAndGet).collect(Collectors.toList());
		System.out.println(custom);
		
		display(null);

	}

}

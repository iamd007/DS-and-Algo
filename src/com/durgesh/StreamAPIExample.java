package com.durgesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		l.add("durgesh");
		l.add("mishra");
		l.add("devyani");
		l.add("deepak");
		
		System.out.println(l);
		List<String> updatedL= l.stream().map(s->s+" hello").collect(Collectors.toList());
		System.out.println(updatedL);
		//Collections.sort(l);
		System.out.println(l);
		//Comparator<Object> 
		
		//Comparator<Developer> byName =
			//	(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
		
				
		Collections.sort(l, (a,b)->b.compareTo(a));
		System.out.println(l);
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
	
		
		Consumer <Integer> con = i->{System.out.println("the square root of "+i+ " is " +i*i);};
		li.stream().forEach(con);
		
		int arr[] = {6,4,9,7,8};
		Function<Integer,Integer> tempCon = i->{return i*i;};
		List<Integer> lll = li.stream().map(tempCon).collect(Collectors.toList());
		System.out.println(lll);

	}

}

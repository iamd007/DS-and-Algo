package datastructureandalgorithem;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashmapAsCustomKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Student,Integer> m = new TreeMap<Student,Integer>(new sortById());
		
		m.put(new Student(1,"anil","prasad") , 100);
		m.put(new Student(1,"haridwar","prasad") , 200);
		m.put(new Student(2,"durgesh","mishra") , 300);
		m.put(new Student(3,"durgesh","jugani") , 400);
		System.out.println(m);
		for(Map.Entry<Student,Integer> en :m.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
	    List<Student> ss = new ArrayList<Student>(m.keySet());
		System.out.println(ss);
		 List<Integer> st = new ArrayList<Integer>(m.values());
			System.out.println(st);
	}

}

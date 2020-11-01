package com.anurag.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Base { 
    public void foo() {
    	System.out.println("b");
    } 
}  
class Derived extends Base { 
	/*private void foo(){
		System.out.println("d");
		
	} */
}  

class Parent
{
	int id;
	String name;
	Parent(int id,String Name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;*/
		return 51;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/

	
}

public class Test {

	
	public void display(String s)
	{
		s ="def";
		System.out.println(s);
	}
	
	protected void finalize()
	{
		System.out.println("ff");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Derived d = new Derived(); 
		    d.foo(); */
		String str = "abc";
		str = null;
		/*Test t = new Test();
		t = null;*/
		System.gc();
		try{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("edn");
		
		
		Map<Integer,Integer> m = new HashMap();
		m.put(3,8);
		m.put(null, null);
		m.put(null, 2);
		System.out.println(m);
		Map<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		tm.put(4, null);
		System.out.println(tm);
		Set s = new HashSet<Integer>();
		s.add(null);
		s.add(null);
		System.out.println(s.size());
		
		Parent p1  = new Parent(1,"durgesh");
		Parent p2  = new  Parent(1,"durgesh");
		
		HashMap<Parent,Integer> map = new HashMap<>();
		map.put(p1,1);
		map.put(p2,2);
		System.out.println("Size of Map is "+map.size());
		int x = 8;
		int y=9;
		Integer x1 = new Integer(x);
		Integer y1 = new Integer(y);
		float res = (x+y)/2;
		float xx= x1.floatValue();
		float yy = y1.floatValue();
		System.out.println((x1+y1)/2);
		System.out.println((int)(xx+yy)/2);
		System.out.println((int)res);
 		
		
	}

}

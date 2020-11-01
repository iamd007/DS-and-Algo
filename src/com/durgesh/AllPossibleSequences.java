package com.durgesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;


class CreditCard {

    public int number;
    String name;

    public CreditCard(int number,String name) {
        this.number = number;
        this.name = name;
    }
}
public class AllPossibleSequences {

	public String[] apsUtil(String s)
	{
		if(s.length()==0)
		{
			String a[]={""};
			return a;
		}
		
		String b[]= apsUtil(s.substring(1));
		String c[] = new String[2*b.length];
		for(int i=0;i<b.length;i++)
			c[i]=b[i];
		
		for(int i=0;i<b.length;i++)
		{
			c[i+b.length] =s.charAt(0)+b[i];
		}
		//System.out.println("yyyyyyyyyyyyyyyyyyyyyyy");
		return c;
	}
	public static int add(int i,int j)
	{
		return i+j;
	}
	public static void main(String arg[])
	{
		Map<CreditCard,String> map = new HashMap<>();	
		 CreditCard c1  = new CreditCard(1,"a");
		 CreditCard c2  = new CreditCard(2,"b");
		 map.put(c1,"c1");
		 map.put(c2,"c2");
		 System.out.println(map.get(c1));
		 System.out.println(map.get(new CreditCard(1,"A")));
		 ArrayList<Integer> li = new ArrayList<>();
		 
	}
	
}

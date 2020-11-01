package com.durgesh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumEqualToNumber {

	public static void main(String[] args) {
		int a[] ={0,2,5,6,7};
		/*Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i< a.length;i++)
		{
			m.put(a[i], 1);
		}*/
		int n=a.length;
		int sum=90;
		int count =0;
		//boolean visited[] = new boolean[a.length];
		Map m = new HashMap<Integer,Integer>();
        Set s = new HashSet<Integer>();
        
        for(int i=0;i<n;i++)
        {
            m.put(a[i],1);
        }
        
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(sum-a[i]) && !s.contains(a[i])
            && a[i] != sum-a[i])
            {
                System.out.println(a[i]+" " + (sum-a[i]) +" " +sum);
                s.add(a[i]);
                s.add(sum-a[i]);
                count=1;
            }
        }
        if(count ==0)
        	System.out.println("-1");
	}

}

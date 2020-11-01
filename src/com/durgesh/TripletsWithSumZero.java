package com.durgesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TripletsWithSumZero {

	List<List<Integer>> returnTripletsList(int a[])
	{
		List<List<Integer>> res = new ArrayList<>();
		
		int l = a.length;
		for(int i=0;i<l-1;i++)
		{
			int start = i+1;
			int end =l-1;
			while(start < end)
			{
				if(a[i]+a[start]+a[end] ==0)
				{
					List<Integer> values = Arrays.asList(a[i],a[start],a[end]);
					res.add(values);
					start++;end--;
				}
				else if(a[i]+a[start]+a[end] <0)
				{
					start++;
				}
				else
				{
					end--;
				}
			}
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TripletsWithSumZero obj = new TripletsWithSumZero();
		int a[] = {0,-1,2,-3,1};
		Arrays.sort(a);
		List<List<Integer>> list = obj.returnTripletsList(a);
	   Iterator it = list.iterator();
	   while(it.hasNext())
	   {
		   List l =(List) it.next();
		   Iterator it1 = l.iterator();
		   while(it1.hasNext())
		   {
			   System.out.print(" "+it1.next() );
		   }
		   System.out.println();
	   }
	}

}

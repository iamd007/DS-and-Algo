package com.durgesh.test;

import java.util.Arrays;

class LngestIncreasingSequenceUitl
{
	
   public static int longestIncreasingSequence(int a[])
   {
	   
	   int l = a.length;
	   int res[] = new int[l+1];
	   Arrays.fill(res, 1);
	   for(int i =1;i<l;i++)
	   {
		   for(int j=0;j<i;j++)
		   {
			   if(a[i] >a[j] && res[j]+1 > res[i] )
				    res[i] = res[j]+1;
		   }
	   }
	   int max =res[0];
	   for(int i=0;i<=l;i++)
	   {
		   if(res[i] > max)
		   {
			   max=res[i];
		   }
	   }
	   
	return max;
	   
   }
}

public class LngestIncreasingSequence {

	public static void main(String[] args) {
		int a[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
		int b = LngestIncreasingSequenceUitl.longestIncreasingSequence(a);
		System.out.println(b);

	}

}

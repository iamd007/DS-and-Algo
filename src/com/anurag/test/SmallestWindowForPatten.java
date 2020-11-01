package com.anurag.test;

import java.util.Arrays;
import java.util.List;

public class SmallestWindowForPatten {

	
	public static String calculateSmallestWindow(String str,String pat)
	{
		
		int n = str.length();
		int m = pat.length();
	    int []	hash_pat = new int[256];
	    int [] hash_str = new int[256];
	    Arrays.fill(hash_pat,0);
	    Arrays.fill(hash_str,0);
	    for(int i = 0; i<m;i++)
	    	hash_pat[pat.charAt(i)] ++;
	    
	    if(n==1&& m==1 )
	    {
	    	if( str.equals(pat))
	    	{
	    		return pat;
	    	}
	    	else
	    		return "";
	    }
	    	 
	    
	    int start =0;
	    int startIndex = -1;
	    int minLength = Integer.MAX_VALUE;
	    int count=0;
	    for(int j=0;j<n;j++)
	    {
	    	hash_str[str.charAt(j)]++;
	    	if(hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] && hash_pat[str.charAt(j)]  !=0)
	    	{
	    	  count++;	
	    	}
	    	
	    	if(count == m)
	    	{
	    		while(hash_pat[str.charAt(start)] ==0 || hash_str[str.charAt(start)] 
	    				                                  >hash_pat[str.charAt(start)])
	    		{
	    			if(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
	    				 hash_str[str.charAt(start)]--;
	    			
	    			start++;
	    		}
	    		
	    		
	    		int tempLength = j-start+1;
	    		if(minLength  > tempLength)
	    		{
	    			minLength = Math.min(minLength, tempLength);
	    		    startIndex  = start;
	    		}
	    	}
	    }
 		
		System.out.println("String is " + str +" Length of string is "+n);
		System.out.println("Start index is " + startIndex +" minLength "+minLength);
		if(minLength == Integer.MAX_VALUE)
			 return "";
		else
		  return str.substring(startIndex,startIndex+minLength);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "ab";
		String pat = "A";
		System.out.println("Result is:: " + calculateSmallestWindow(str,pat));
		
	}

}

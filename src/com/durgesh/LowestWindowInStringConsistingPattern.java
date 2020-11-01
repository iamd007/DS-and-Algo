package com.durgesh;

public class LowestWindowInStringConsistingPattern {

	public static void main(String[] args) {
		String str ="this is a test string";
		String pattern ="tist";
		int l1=str.length();
		int l2 = pattern.length();
		int c_str [] = new int[256];
		int c_pattern[] = new int[256];
		int i,j;
		int res = Integer.MAX_VALUE;
		int start_index=-1;
		for(i=0;i<l2;i++)
			c_pattern[pattern.charAt(i)]++;
		
		int count=0;
		int start=0;
		
		for(j=0;j<l1;j++)
		{
			c_str[str.charAt(j)]++;
			if(c_pattern[str.charAt(j)]!=0 && c_str[str.charAt(j)] <= c_pattern[str.charAt(j)])
				count++;
			if(count==l2)
			{
				while(c_str[str.charAt(start)] > c_pattern[str.charAt(start)]  || c_pattern[str.charAt(start)]==0)
				{
					if(c_str[str.charAt(start)] > c_pattern[str.charAt(start)])
						c_str[str.charAt(start)]--;
					start++;
					
				}
				
				int min_length= j-start+1;
				if(min_length< res)
				{
					res=min_length;
					start_index = start;
				}
			}
			
			
		}
		
		System.out.println(str.substring(start_index,start_index+res));
		

	}

}

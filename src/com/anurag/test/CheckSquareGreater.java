package com.anurag.test;

public class CheckSquareGreater {

	public static boolean checkSquareGreaterUtil(int smallerNumber,int maxNumber)
	{
		
		            
		return smallerNumber > Math.sqrt(maxNumber);
	}
	
	public static void main(String[] args) {
		int a[] = {-3,-4,-5};
		int maxNumber=Integer.MIN_VALUE;
		int smallerNumber  = Integer.MAX_VALUE;
		
		
		for(int i=0;i<a.length;i++)
		{
			maxNumber = Math.max(maxNumber,a[i]);
			smallerNumber = Math.min(smallerNumber,  a[i]);
		}
		System.out.println(smallerNumber +" "+maxNumber );
		System.out.println(checkSquareGreaterUtil(smallerNumber,maxNumber));

	}

}

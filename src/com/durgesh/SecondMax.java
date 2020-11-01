package com.durgesh;

public class SecondMax {

	public static void main(String[] args) {
		int a[] ={1,2,4,5,5};
		int fm=a[0];
		int sm = Integer.MIN_VALUE;
		for(int i=0;i<5;i++)
		{
			if(sm <a[i])
				sm=a[i];
			if(a[i] > fm)
			{
				sm =fm;
				fm=a[i];
			}
		}
    
		
		System.out.println("First Max " + fm +" " +"Second Max " +sm);
	}

}

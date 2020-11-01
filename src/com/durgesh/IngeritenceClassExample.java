package com.durgesh;

class tempA
{
	public int i=10;
}
class tempB extends tempA
{
	public int i =20;
}


public class IngeritenceClassExample {

	public static void main(String arg[])
	{
	 tempA temp1 = new tempB();
	 System.out.println(temp1.i);
	}
	
	
}

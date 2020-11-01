package com.anurag.test;

interface V
{
	default void p()
	{
		
	}
	
}
class C implements V
{
	default  void p()
	{
		
	}
}


public class Testone {

	public void display(int i)
	{
		System.out.println("int");
	}
	public void display(long i)
	{
		System.out.println("il");
	}
	protected void finalize()
	{
		System.out.println("fi");
	}
	public static void main(String[] args) {
		Testone t = new Testone();
		t.display(5);
		String s ="abc";
		s=null;
		System.gc();
		System.out.println("end");
	}

}

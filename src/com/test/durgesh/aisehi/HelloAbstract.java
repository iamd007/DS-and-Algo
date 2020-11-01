package com.test.durgesh.aisehi;


abstract class First
{
	String name;
	
	First(String name)
	{
		this.name = name;
	}
	public abstract void  hello();
	public abstract void hello1();
	public static void hello2()
	{
		System.out.println("Inside normal method");
	}
	private void hello3()
	{
		System.out.println("in private method");
	}
}
interface aa
{
	default void method1()
	{
		System.out.println("inside aa method1");
	}
}
interface ab 
{
	default void method1()
	
	{
		System.out.println("inside ab method1");
	}
}
public class HelloAbstract extends First implements aa,ab{

	String name ;
	
	
	HelloAbstract(String name) {
		super(name);
		this.name= name;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloAbstract ha = new HelloAbstract("Durgesh");
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		aa.super.method1();
	}

}

package com.durgesh;

import java.util.LinkedList;
import java.util.Queue;

class A
{
    int i=10;
    static 
    {
        System.out.println("I am static A");
    }
    {
        System.out.println("I am {} A");
    }
    public A()
    {
        System.out.println("I am parameterised A");
    }
    public A(int i)
    {
        this.i=i;
        System.out.println("I am parameterised constructor A");
    }
    void function()
    {
        System.out.println("I am function A");
    }
}
class B extends A
{
	static int i=20;
	static 
    {
        System.out.println("I am static B");
    }
	public B()
    {
		super(30);
        System.out.println("I am constructor B");
    }
	{
        System.out.println("I am {} B");
    }
	/*public B(int i)
    {
		super(i);
        System.out.println("I am parameterised constructor B");
    }*/
	
}
class C extends B
{
	static 
    {
        System.out.println("I am static C");
    }
	
	{
        System.out.println("I am {} C");
    }
    static class D
    {
        static int i=50;
    }
    class E
    {
        E()
        {
        	super();
        }
    }
}
class F extends C
{
    
	static 
    {
        System.out.println("I am static F");
    }
	
	
    class H extends D
    {
    	void function()
        {
            System.out.println("I am function C.D");
        }
    }
    class G extends E 
    {
    	int i = 60;
    	G()
    	{
    		F f = new F();
    	}
    }
}






public class ConstructorExample {
	public static void main(String arg[])
	{
		System.out.println("__________________1");
		A a = new F();
		System.out.println("__________________2");
        a.function();
        System.out.println("__________________3");
        System.out.println(a.i);
        System.out.println("__________________4");
        a=new A();
        System.out.println("__________________5");
        System.out.println(a.i);
        System.out.println("__________________6");
        System.out.println(B.i);
        System.out.println("__________________7");
        System.out.println(C.D.i);
        System.out.println("__________________8");
        F f=new F();
        System.out.println("__________________9");
        F.H b=f.new H();
        System.out.println("__________________10");
        b.function();
        System.out.println("__________________11");
        F.G c=f.new G();
        System.out.println("__________________12");
        System.out.println(c.i); 
        System.out.println("__________________13");
        
        Queue<Integer> q  = new LinkedList<>();
	}

}

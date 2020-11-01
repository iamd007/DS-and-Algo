package datastructureandalgorithem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



class Base
{
	int i;
  	public void cal()
	{
		System.out.println(i);
	}
}

class child extends Base
{
	int j;
	public void cal()
	{
		System.out.println("child");
	}
	
	
}
class A11{
public static void print1(){
System.out.println("a11");
}
}
class B11 extends A11{
public static void print1(){
System.out.println("b11");
}
}




public class ConstructorExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//child c = new child(10);
		//Base b = new child(10);
		Base b1 = new Base();
		A11 a = new B11();
		a.print1();
		String s = "DurgeshMishraAZ";
		String regex = "([A-Z][a-z])";
		String temp[] = s.split(regex);
		for(String temp1 : temp )
		{
			System.out.println(temp1);
		}
		System.out.println(1<<0);
		
		
		
		String s1 = "hill5";
		String s2 = "hill"+s1.length();
		System.out.println(s1==s2);
		
		Base c1 = new child();
		try
		{
		System.out.println("hello" +" " +1/0);
		}catch(ArithmeticException E1)
		{
			System.out.println("WORLD");
		}
		c1.cal();
	}

}

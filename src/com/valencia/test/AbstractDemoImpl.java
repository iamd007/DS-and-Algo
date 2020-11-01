package com.valencia.test;



 abstract class AbstractDEMO {
  private int a;
 AbstractDEMO(int a)
 {
	 this.a =a;
 }
	
	abstract void multiply(int a, int b);

static int add(int a,int b){
	return a+b;
}

static float add(float a,float b)
{
	return a+b;
}

public int getA()
{
	System.out.println(this.a);
	return a;
}
}





public class AbstractDemoImpl extends AbstractDEMO{
	AbstractDemoImpl(int a) {
		super(a);
		
	}

	public static void main(String arg[])
	{
		AbstractDEMO aa = new AbstractDemoImpl(10);
		System.out.println(aa.getA());
		System.out.println(AbstractDEMO.add(3.0f, 8.9f));
		aa.multiply(10,10);
	}

	@Override
	void multiply(int a, int b) {
		System.out.println(a*b);
	}

}

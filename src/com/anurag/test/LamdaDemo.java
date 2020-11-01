package com.anurag.test;

interface LamdaInterface
{
	public void show();
}



public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LamdaInterface obj;
		/*obj = new LamdaInterface()//Anonumous inner class
		{
			
			@Override
			public void show() {
				System.out.println("i am anonymous class");
				
			}
		};*/
		obj = () -> 
		{
			System.out.println("HELLO");
		};
		
       obj.show();
	}

}

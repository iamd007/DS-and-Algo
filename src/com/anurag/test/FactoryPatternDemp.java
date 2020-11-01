package com.anurag.test;

interface Shape{
	public void show();
	
}

class Square implements Shape {

	@Override
	public void show() {
	System.out.println("In Square method.");
		
	}
	
}

class Circle implements Shape
{

	@Override
	public void show() {
		System.out.println("In Circle Method.");
		
	}
	
}
class Triangle implements Shape
{

	@Override
	public void show() {
		System.out.println("In triangle method");
		
	}
	
}

class shapeFactory{
	public Shape getFactory(String factoryType)
	{
		if(factoryType == null) 
			 return null;
		if(factoryType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		return null;
	}
}
public class FactoryPatternDemp {

	public static void main(String[] args) {
		System.out.println("Hello");
		shapeFactory  sf = new shapeFactory();
		Shape s = sf.getFactory("circle");
		s.show();
		System.out.println(s.getClass());
		
	
	}

}

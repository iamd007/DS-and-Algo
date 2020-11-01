package com.valencia.test;

public class AnimalDriver1 {

	public void sound()
	{
		System.out.println("animal");
	}
}


class Dog extends AnimalDriver
{
	public void sound()
	{
		System.out.println("Dog is barking");
	}
}
class Cat extends AnimalDriver
{
	public void sound()
	{
		System.out.println("meoww mewoo");
	}
}



class Fox extends AnimalDriver
{
	public void sound()
	{
		System.out.println("wooo wooo");
	}
}
 class FactoryPattern
 {
	 public AnimalDriver getAnimalType(String type)
	 {
		 if(type.equals("CAT"))
			 return new Cat();
		 else if(type.equals("DOG"))
			 return new Dog();
		 else if(type.equals("FOX"))
			 return new Fox();
		 
		 return null;
	 }
 }

class AnimalDriver1
{
	public static void main(String arg[])
	{
		
		FactoryPattern fp = new FactoryPattern();
		AnimalDriver dogObject = fp.getAnimalType("DOG");
		dogObject.sound();
	}
}
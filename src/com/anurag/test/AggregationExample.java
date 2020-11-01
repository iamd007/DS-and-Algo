package com.anurag.test;


class Engine  
{ 
    // starting an engine. 
    public void work() 
    { 
          
        System.out.println("Engine of car has been started "); 
          
    } 
      
} 
  
// Engine class 
final class Car  
{ 
      
    // For a car to move,  
    // it need to have a engine. 
   //private final Engine engine; // Composition 
    private Engine engine;     // Aggregation 
      
    Car(Engine engine) 
    { 
        this.engine = engine; 
    } 
      
    // car start moving by starting engine 
    public void move()  
    { 
          
        //if(engine != null) 
        { 
            engine.work(); 
            System.out.println("Car is moving "); 
        } 
    } 
} 

public class AggregationExample {
	public static void main (String[] args)  
    { 
          
        // making an engine by creating  
        // an instance of Engine class. 
        Engine engine = new Engine(); 
          
        Engine engine2 = new Engine();
        // Making a car with engine. 
        // so we are passing a engine  
        // instance as an argument while 
        // creating instace of Car. 
        Car car = new Car(engine); 
        car.move(); 
        String str = "geekss@for@geekss"; 
        String[] arrOfStr = str.split("s", 0); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
        
        String name = "Durgesh.Mishra";
        name = name.substring(0,name.length()-1);
        System.out.println(name);
        String []list = name.split("\\.");
        for(String s : list)
        {
        	System.out.println(s);
        }
        
        int a = 100;
        int b =100;
       
        int c=200;
        int d=200;
        System.out.println(a==b);
        System.out.println(c==d);
          
    } 

}

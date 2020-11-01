package com.anurag.test;


//package whatever; // don't place package name!

import java.io.*;

class StackException extends Exception{


public StackException(String exception)
{
 super(exception);
}
}


class Stack {

int a[] = new int[2];
int top ;
int maxSize =10;
Stack()
{
  top =-1;
}
public  void push(int data) throws StackException
{
 
 if(top >= maxSize)
 {
   throw  new StackException("InvalidFormat");
   
 }
 else{
 {
      top++;
      a[top] = data;
     System.out.println(data +"   Inserted");
   }
 }}
 

public int  top()
{
 
 if(top < 0 )
 {
   System.out.print("Stack is empty");
   return 0;
 }
 else{
     int temp = a[top];
   return  temp;
 }
 
 
}
public int pop()
{
 if(top < 0)
 {
   System.out.println("Stack is empty");
   return 0;
 }
 else{
     int temp1  = a[top];
     top--;
     return temp1;
 }
}

}




public class StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i love my comfort zone";
		String strArray[] = str.split(" ");
		System.out.println(strArray[0]);

		
		
		System.out.println("Hello Java");
 Stack s = new Stack();
try{
s.push(10);
s.push(20);
s.push(30);
s.push(40);

}catch(Exception e)
{
  System.out.println("Exception occured");
   }
System.out.println(s.top());
System.out.println(s.pop());
System.out.println(s.pop());
//s.push(70);
System.out.println( "Top element  is" + s.top());
System.out.println(s.pop() +" popped");
System.out.println(s.pop() +" popped");
System.out.println(s.pop() +" popped");
System.out.println(s.pop() +" popped");
System.out.println(s.pop() +" popped");
System.out.println(s.pop() +" popped");



	}

}

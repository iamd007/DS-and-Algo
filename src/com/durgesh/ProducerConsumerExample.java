package com.durgesh;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerExample {

	public static void main(String[] args) throws InterruptedException {
		
		PC  pc = new PC();
		Thread t1 = new Thread(new Runnable()
				{
			      @Override
			      public void run()
			      {	try
			      	{
			    	  pc.producer();
			      	}catch(InterruptedException e)
			         {
			      	    	e.printStackTrace();
			         }
			      }
			
			
				});
		
		Thread t2 = new Thread(new Runnable(){
			
			public void run()
			{
				try
				{
					pc.consumer();
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		});
		
       t1.start();
       t2.start();
	}

}

class PC
{
	LinkedList<Integer> li = new LinkedList<Integer>();
	int capacity = 2;
	public void producer() throws InterruptedException
	{
		int value = 0 ;
		while(true)
		{
			synchronized (this) {
				if(li.size() == capacity)
					wait();
				
				System.out.println("Producer produced  " + value);
				li.add(value++);
				//notify();
				Thread.sleep(1000);
				notify();
			}
		}
	}
	
	public void consumer() throws InterruptedException
	{
	
		 while(true)
		 {
			 synchronized (this) {
				 if(li.size() == 0)
					  wait();
			 
				 int val = li.removeFirst();
				 System.out.println("Consumer consumeed the value " +val);
				 notify();
				 Thread.sleep(1000);
				
			}
		 }
	}
}

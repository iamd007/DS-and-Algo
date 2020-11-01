package com.test.durgesh.aisehi;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

class Message

{
	String message;
	Message(String s)
	{
		this.message = s;
		
	}
	public String getMessage()
	{
		return this.message;
	}
}

class Producer implements Runnable{
	
    
	BlockingQueue<Message> q ;
	Producer(BlockingQueue<Message> q)
	{
		this.q = q;
	}
	@Override
	public void run() {
		System.out.println("Producer started");
		for(int i=0;i<10;i++)
		{
			Message m = new Message(" " +i);
			try{
				q.put(m);
				System.out.println("Produced produced" +m.getMessage()+"  produced");
				Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		Message m = new Message("ex");
		try{
			q.put(m);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}

class Consumer implements Runnable{

	BlockingQueue<Message> q;
	Consumer (BlockingQueue<Message> q)
	{
		this.q = q;
	}
	
	
	@Override
	public void run() {
		System.out.println("Consumer started");
		// TODO Auto-generated method stub
		try{
			Message m;
			while((m = q.take()).getMessage() != "ex")
			{

				System.out.println("Consumed " + q.take().getMessage());


			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
public class ProducerConsumerUsingBlockingQueue {
	public static void main(String arg[])
	
	{
		BlockingQueue<Message> q = new ArrayBlockingQueue<Message>(10);
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		
		
		System.out.println("Main method closed");
		
	}

}

package com.durgesh;

import java.util.concurrent.atomic.AtomicLong;

class Even extends Thread
{
	private AtomicLong l;
	public Object lock;
	Even(AtomicLong l,Object lock)
	{
		this.l = l;
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		synchronized (lock) {
			
			while(true){
				if(l.get() %2 != 0)
				{
					try{
					lock.wait();
				}catch(InterruptedException e)
				{
                       e.printStackTrace();
				}
				}
				else
				{
					System.out.println("Even " + l);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					l.incrementAndGet();
					lock.notifyAll();
				}
				
			}
			
		}
	}
}


class Odd extends Thread
{
	private AtomicLong l;
	public Object lock;
	
	Odd(AtomicLong l,Object lock)
	{
		this.l = l;
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		synchronized (lock) {
			while(true)
			{
				if(l.get() %2 == 0)
				{
					try{
						lock.wait();
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}else
				{
					System.out.println("Odd " +l);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					
					l.incrementAndGet();
					lock.notifyAll();
				}
				

		}
	}
  }
	
}


public class OddEvenThread {

	public static void main(String[] args) {
         
		/*Object lock = new Object();
		AtomicLong l = new AtomicLong(1);
		Even even = new Even(l,lock);
		Odd odd = new Odd(l,lock);
		even.start();
		odd.start();*/
		try
		{
		Thread.currentThread().join();
		}catch(Exception e)
		{
			
		}
        System.out.println("g");
	}

}

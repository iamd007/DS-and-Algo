package com.durgesh.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class MyThreads implements Runnable
{
    CyclicBarrier cyclicBarrier;
    MyThreads(CyclicBarrier cyclicBarrier)
	{
    	super();
		this.cyclicBarrier = cyclicBarrier;
	}
	
	
	
	@Override
	public void run() {
		try{
		cyclicBarrier.await();//blocking call
		letsGoToSchool();
		}catch(InterruptedException  | BrokenBarrierException e)
		{
			e.printStackTrace();
		}
	}



	public static void letsGoToSchool() {
		System.out.println(Thread.currentThread().getName() + " Ran for the School ");
		
	}
	
}


public class CyclicBarrierExample {

	public static void main(String[] args) {
		System.out.println("cyclic barrier exaple");
		CyclicBarrier cb = new CyclicBarrier(3);
		Thread t1 = new Thread(new MyThreads(cb),"Child 1");
		Thread t2 = new Thread(new MyThreads(cb),"Child 1");
		Thread t3 = new Thread(new MyThreads(cb),"Child 2");
		t1.start();
		t2.start();
		t3.start();
		

	}

}

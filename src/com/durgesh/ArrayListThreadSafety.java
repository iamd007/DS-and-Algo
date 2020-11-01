package com.durgesh;

import java.util.ArrayList;

class MyThread1 implements Runnable{
	
	
	int start,end;
	String search;
	ArrayList<String> li;
	MyThread1(int start,int end,String search,ArrayList<String> li)
	{
		this.start = start;
		this.end = end;
		this.search =search;
		this.li =li;
	}
	
	@Override
	public void run()
	
	{  // System.out.println("Inside run");
	    //System.out.println("Searcg "+search);
		for(int i=start;i<=end;i++)
		{
			System.out.println(li.get(i));
			if(li.get(i).equals(search))
			{
				System.out.println(" Found in "+ this.getClass() + search);
			}
		}
	}
}


public class ArrayListThreadSafety {

	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>(); 
         for(int i=1;i<=30;i++)
        	 li.add(" durgesh "+i);
         
       //  System.out.println(li);
         
         MyThread1 mt1 = new MyThread1(1,10," durgesh 2",li);
         MyThread1 mt2 = new MyThread1(11,20," durgesh 2",li);
         
         Thread t1 = new Thread(mt1);
         Thread t2 = new Thread(mt2);
          t1.setName("First  ");
          t2.setName("Second ");
          t1.start();
          t2.start();
         
	}

}

package com.test.durgesh.aisehi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup g = new java.lang.ThreadGroup("fIRST");
		System.out.println(g);
		
		ExecutorService service  = Executors.newFixedThreadPool(3);
		

	}

	}



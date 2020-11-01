package com.durga.test;

class Employeeee{
	static int count=0;
	int id=0;
	
	Employeeee()
	{
	    count++;
	    this.id=count;
	}
	
	
	public int getId()
	{
		return this.id;
	}
}


public class EmployeeeeDemo {

	public static void main(String[] args) {
		
		Employeeee e1 = new Employeeee();
		System.out.println(e1.getId());

	}

}

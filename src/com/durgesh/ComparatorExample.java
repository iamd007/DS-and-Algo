package com.durgesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	String fName;
	String lName;
	int id;
	Student(String fName,String lName,int id)
	{
	   this.fName = fName;
	   this.lName = lName;
	   this.id = id;
	}
	
	@Override
	public String toString()
	{
		return id +" "+fName+" "+lName;
	}
}
/*class NoOfStudent
{
	int n;
	Student st[];
	NoOfStudent(int n)
	{
		this.n = n;
		  st = new Student[n];
		for(int i=0;i<n;i++)
			 st[i] = new Student();
			
	}
}*/
/*class SortByFirstName implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	
	{
		return s1.fName.compareTo(s2.fName);
	}
}

class SortByLastName implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s1.lName.compareTo(s2.lName);
	}
}*/

public class ComparatorExample {
	public static void main(String arg[])
	{
		Student st[] = new Student[5];
		st[0] = new Student("durgesh","mishra",100);
		st[1] = new Student("devyani","vachal",100);
		st[2] = new Student("valencia","joseph",100);
		st[3] = new Student("subash","yadav",100);
		st[4] = new Student("abhishek","chourasia",100);
		
		Comparator<Student> cmp =new Comparator <Student>()
		{public int compare(Student s1,Student s2)
			{
			return s1.fName.compareTo(s2.fName);
			}
		};
		
		Arrays.sort(st, cmp);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(st[i]);
		}
		
		/*Arrays.sort(st,new SortByLastName());
		for(int i=0;i<5;i++)
		{
			System.out.println(st[i]);
		}*/
	}

}

package com.anurag.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Employee
{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int id;
	String firstName;
	String lastName;
	int salary;
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	
}

public class MapStudent {

	public static void main(String[] args) {
		Employee e1 = new Employee(100,"durgesh","mishra",100000);
		Employee e2 = new Employee(200,"anamika","singh",200000);
		Employee e3 = new Employee(300,"anupam","lal",9000000);
		Employee e4 = new Employee(400,"jagat","panna",1000000000);
		System.out.println();
		//e1.setFirstName("hhhh");
		
		
		/*TreeMap<Employee, Integer> m = new TreeMap<>((e11, e12) -> e11.firstName.compareTo(e12.firstName));
		m.put(e1, 100);
		m.put(e2, 200);
		m.put(e3,300);
		m.put(e4, 400);*/
		Map<Employee,Integer> m = new HashMap<>();
		m.put(e1,100);
		m.put(e2, 200);
		System.out.println("Hash Code "+ e1.hashCode());
		System.out.println(e1.getFirstName());
		System.out.println("Value " +m.get(e1));
		List<Employee> l = new ArrayList<>(m.keySet());
		System.out.println(l);
		e1.setFirstName("raina");
		List<Employee> l1 = new ArrayList<>(m.keySet());
		System.out.println(l1);
		System.out.println(e1.getFirstName());
		System.out.println("Hash Code "+ e1.hashCode());
		System.out.println("Value " +m.get(e1));
		//e1.setFirstName("Mohit");
		//System.out.println(m);
		/*for(Map.Entry<Employee,Integer> e:m.entrySet())
		{
			System.out.println(e.getKey().id +" "+  e.getKey().firstName +" " + e.getKey().lastName +" "+ e.getKey().salary);
		}
		
		m.entrySet().stream().sorted(Map.Entry.comparingByKey(
				Comparator.comparing(Employee::getSalary)))
		.forEach(System.out::println);
		System.out.println("*********************************************\n");
		m.entrySet().stream().sorted(Map.Entry.comparingByKey(
				Comparator.comparing(Employee::getFirstName).reversed()))
		    .forEach(System.out::println);
		
		Map<Integer,Integer> m1 = new HashMap<>();
		m1.put(null, 1);
		m1.put(null, 3);
		System.out.println(m1.size());*/
		//a=2;
		//b=1;
				
				
	}

}

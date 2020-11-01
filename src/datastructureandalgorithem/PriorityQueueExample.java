package datastructureandalgorithem;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student{
	int id;
	String fName;
	String lName;
	public Student(int id,String fName,String lName)
	{
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
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
		Student other = (Student) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (id != other.id)
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}

	public String toString()
	{
		return id +"  "+fName +"  " +lName;
	}
}

class sortById implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.id - b.id;
	}
}

class sortByFname implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		
		return arg0.fName.compareTo(arg1.fName);
	}
	
	
	
}

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue <String>pq = new PriorityQueue<String>();
		pq.add("durgesh");
		pq.add("gudia");
		pq.add("sonali");
		pq.add("anil");
		pq.add("deepali");
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		PriorityQueue<Student> pqStudent = new PriorityQueue<Student>(3,new sortByFname());
		 /*PriorityQueue<Student> pqpqStudent = new 
	             PriorityQueue<Student>(5, new sortById());*/
		pqStudent.add(new Student(110,"durgesh"," Mishra"));
		pqStudent.add(new Student(104,"amit"," Agrawal"));
		pqStudent.add(new Student(101,"nattu"," jha"));
		
		System.out.println(pqStudent);
		
	}

}

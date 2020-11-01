package com.durgesh;

import java.util.Date;

class PrivateStudent
{
	private String name;
    private Date date;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PrivateStudent other = (PrivateStudent) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "PrivateStudent [name=" + name + ", date=" + date + "]";
	}
	
	
	
}




public class DataHidingDemp {

	public static void main(String[] args) {
		// TODO Auto-generated msthod stub
   
		PrivateStudent stu = new PrivateStudent();
		stu.setName("Durgesh");
		stu.setDate(new Date());
		System.out.println(stu);
		stu.setName("anil");
		System.out.println(stu);
	}

}

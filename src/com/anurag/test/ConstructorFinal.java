package com.anurag.test;
class student
{
	int id;
	int roll;
	student(int id,int roll){
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + roll;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
}

public class ConstructorFinal {

	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2=new String("def");
		
		String s3="abc";
		System.out.println(s1==s3);
	}

}

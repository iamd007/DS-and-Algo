package datastructureandalgorithem;

class MyException extends Exception
{
	MyException(String s)
	{   super(s);
		System.out.println();
	}
}

public class MyNewException {

	public static void main(String[] args) {
		int a=10;
		try{
		if(a>9)
		{
			throw new MyException("VALUE OF A IS GREATER THAN 9");
		}
		}catch(MyException e)
		{
			System.out.println(e);
		}
	}

}

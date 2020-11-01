package datastructureandalgorithem;

interface TestLamda{
	public  int printMessage(int x,int y);
	
	
}

public class LamdaExpression {

	public static void main(String[] args) {
	TestLamda tl = (int x,int y)->x*y;
	int res = tl.printMessage(7,8);
	System.out.println(res);

	}

}

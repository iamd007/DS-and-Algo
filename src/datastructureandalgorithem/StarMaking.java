package datastructureandalgorithem;

public class StarMaking {
//0,1,2,3
	public static void draw(int n)
	{
		int count =0;
		for(int i=n;i>=1;i=i-2)
		{
			for(int j=0;j<count;j++)
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
			{
			 System.out.print("*");
			}
			System.out.println();
			count++;
		}
	}
	// n/2 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		draw(n);

	}

}

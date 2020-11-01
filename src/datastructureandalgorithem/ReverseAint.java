package datastructureandalgorithem;

public class ReverseAint {

	
	public static int myAtoi(String str) {
	       int b;
	        if(str.charAt(0) =='-');
	        {
	          String str1 = str.substring(1,str.length());
	             b = Integer.parseInt(str1);
	            
	        }
	        
	        if(str.charAt(0) =='-')
	        {
	           return b*-1;
	        }
	        else
	        {
	            return Integer.parseInt(str);
	        }
	        
	         
	    }
	public static int recerseas(int x)
	{
		
		 int b = (int)Math.pow(2, 30);
	        int c=(int)Math.pow(2, 31);
			//System.out.println("Value of b : " +b);
			//System.out.println("Value of a : " +a);
			/*if(x>b-1  || x<(-1)*c)
			{
				return 0;
			}*/
			int rem;
			int res=0;
			//System.out.println(a);
			if(x<0)
			{
				x = x*-1;
				while(x>0)
				{
					rem = x%10;
					res = rem +10*res;
					x =x/10;
				}
				res=res*-1;
	            
			}
			
	        else
	        { 
	            while(x>0)
		 	      {
				    rem = x%10;
			     	res = rem +10*res;
				    x =x/10;
	                
	               }
	            
			}
			
			if(res>b-1  || res<(-1)*c)
			{
				return 0;
			}
			else
				return res;
	
	}
	
	public static void main(String[] args)
	{
		System.out.println(recerseas(1534236469));
		System.out.println(recerseas(-2147483412));
		System.out.println(recerseas(1463847412));
		
		String str = "-42";
		if(str.charAt(0) == '-')
		{
		str = str.substring(1,str.length());
        int b = Integer.parseInt(str);
        System.out.println(b);
		}
        
		System.out.println("myatoi resutl   " + myAtoi("-42"));
		//System.out.println(-123%10);
	}
	
}

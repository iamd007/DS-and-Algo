package com.durgesh;

public class TilingProblem {
	
	
	    static int countWays(int n, int m) 
	    { 
	        // table to store values 
	        // of subproblems 
	        int count[] = new int[n + 1]; 
	        count[0] = 0; 
	  
	        // Fill the table upto value n 
	        int i; 
	        for (i = 1; i <= n; i++) { 
	            // recurrence relation 
	            if (i > m) 
	                count[i] = count[i - 1] + count[i - m]; 
	  
	            // base cases 
	            else if (i < m) 
	                count[i] = 1; 
	  
	            // i = = m 
	            else
	                count[i] = 2; 
	        } 
	   
	        //String ="-1123"
	        
	        // required number of ways 
	        return count[n]; 
	    } 
	  
	    // Driver program 
	    
	    
	    
	   public static int convertfive(int num) {
	        System.out.println(num);
	        String s = String.valueOf(num);
	        System.out.println(s);
	        char ch[] =s.toCharArray();
	        for(int i=0;i<ch.length;i++)
	        {
	        	if(ch[i]=='0')
	        		ch[i]='5';
	        }
	        
	        System.out.println("new string" +String.valueOf(ch));
	        return num;
	     }
	    public static void main(String[] args) 
	    { 
	        int n = 8; 
	        int m = 4; 
	        System.out.println("Number of ways = "
	                           + countWays(n, m)); 
	        
	        
	        convertfive(1105);
	    } 
	} 
	  




package datastructureandalgorithem;

import java.util.Stack;

public class ReverseAStringWithoutChangingSpecialCharacter {

	public String reversea(String s)
	{
		int l = s.length();
		Stack st = new Stack();
		
		for(char ch:s.toCharArray())
		{
			if((ch >=97 && ch <= 122) ||  (ch >=55 && ch <= 90))
			{
			  st.push(ch);
			}
		}
		
		char ch[] = s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i] >=97 && ch[i] <= 122) ||  (ch[i] >=55 && ch[i] <= 90))
				ch[i] = (char)st.pop();
		}
		 
		return String.valueOf(ch);
	}
	public static void main(String[] args) {
		
		ReverseAStringWithoutChangingSpecialCharacter obj = new
				ReverseAStringWithoutChangingSpecialCharacter();
		String s = "a,b$c";
		String s1 = "Ab,c,de!$";
		System.out.println("BEFOR "+s +" After " + obj.reversea(s));
		System.out.println("BEFOR "+s1 +" After " + obj.reversea(s1));
		//System.out.println(b);

	}

}

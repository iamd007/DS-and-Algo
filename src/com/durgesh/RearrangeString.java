package com.durgesh;

import java.util.Comparator;
import java.util.PriorityQueue;

class Key
{
	char ch;
	int freq;
	Key(char ch,int freq)
	{
		this.ch = ch;
		this.freq = freq;
	}
}

class SortByFrequency implements Comparator<Key>
{
	@Override
	public int compare(Key k1, Key k2)
	{
		return -1*(k1.freq-k2.freq);
	}
}
public class RearrangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		
		int count[] = new int[256];
		String s ="bbbaa";
		for(char ch : s.toCharArray())
		{
			count[ch-'a']++;
		}
		
		Comparator<Key> cmp = (k1,k2)-> -1*(k1.freq-k2.freq);
		PriorityQueue<Key> pq = new PriorityQueue<Key>(cmp);
		for(char ch='a' ;ch <='z';ch++)
		{
			int val = ch-'a';
			if(count[val]>0)
			 pq.add(new Key(ch,count[val]));
		}
		System.out.println(pq);
		String res ="";
		Key prev = new Key('#',-1);
		while(!pq.isEmpty())
		{
			Key temp = pq.peek();
			pq.poll();
			res = res+temp.ch;
			if(prev.freq > 0)
				pq.add(prev);
			
			temp.freq--;
			prev=temp;
		}
		
		System.out.println(res);
		
		long stopTime = System.nanoTime();
		System.out.println((stopTime - startTime)/1000000000);
		
	}

}

package com.durgesh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class MotherVertexUtil
{
	int v;
	LinkedList <Integer>[]edges;
	MotherVertexUtil(int v)
	{
		this.v = v;
		edges = new LinkedList[v];
		for(int i=0;i<v;i++)
			edges[i] = new LinkedList<Integer>();
	}
	
	public void add(int u,int v)
	{
	   edges[u].add(v);
	}
	
	public int parentVertexUtil(int source,LinkedList<Integer>[] a,boolean vis[])
	{
		int count = 0;
		
		vis[source] = true;
		Stack<Integer> st = new Stack<Integer>();
		st.push(source);
		count++;
		while(!st.isEmpty())
		{
			int temp = st.peek();
			st.pop();
			Iterator<Integer> it = a[temp].iterator();
			while(it.hasNext())
			{
				int tempNode = it.next();
				if(!vis[tempNode])
				{
					count++;
					vis[tempNode] =true;
					st.add(tempNode);
				}
			}
		}
		System.out.println("Node " +source +" Count " +count);
		return count;
	}
	
	public int parentVertex(LinkedList<Integer> [] a,int v)
	{
		int result = Integer.MAX_VALUE;
		boolean vis[] = new boolean[v];
		Arrays.fill(vis, false);
		for(int i=0;i<v;i++)
		{
			Arrays.fill(vis, false);
			int count = parentVertexUtil(i,a,vis);
			if(count ==v)
			 result = Math.min(result, i);
		}
		
		return result;
	}
}



public class MotherVertex {

	public static void main(String[] args) {
		MotherVertexUtil mm = new MotherVertexUtil(5);
		mm.add(1, 0);
		mm.add(0,2);
		mm.add(2, 1);
		mm.add(0, 3);
		mm.add(3, 4);
		System.out.println(mm.parentVertex(mm.edges, 5));

	}

}

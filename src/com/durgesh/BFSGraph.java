package com.durgesh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Address
{
	 private String  city;
     private int pincode;
     
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + pincode;
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (pincode != other.pincode)
			return false;
		return true;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String city) {
		super();
		this.city = city;
	}
	 
}

class Graph{
	int V;
	List<Integer> edges[];
	Graph(int V)
	{
		this.V = V;
		edges = new LinkedList[V];
		for(int i=0;i<V;i++)
			edges[i] = new LinkedList<Integer>();
	}
	public void addEdges(int a,int b)
	{
		edges[a].add(b);
	}
	public void BFSgraph(Graph graph, int root)
	{
		boolean visited[] = new boolean[graph.V];
		Queue q = new LinkedList<Integer>();
		q.add(root);
		visited[root]=true;
		while(q.size()>0)
		{
			int data =(int)q.poll();
			System.out.print(" "+data);
			Iterator it = edges[data].iterator();
			while(it.hasNext())
			{
				int a=(int)it.next();
				if(visited[a] ==false)
				{
					visited[a]=true;
					q.add(a);
				}
			}
			
		}
		
		
	}
	
}


public class BFSGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(5);
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		//graph.addEdges(0, 3);
		//graph.addEdges(1, 0);
		graph.addEdges(1, 2);
		//graph.addEdges(1, 3);
		graph.addEdges(2, 0);
		//graph.addEdges(2, 1);
		//graph.addEdges(2, 0);
		graph.addEdges(2, 3);
		graph.addEdges(3, 3);
		//graph.addEdges(3, 1);
		//graph.addEdges(3, 2);
		//graph.addEdges(2, 4);
		
		//graph.BFSgraph(graph,2);
		
		String s1 = "f188771";
		//s1 = s1.substring(1);
		int aa = Integer.parseInt(s1);
		System.out.println(aa);
		
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("durga","mishra");
		hm.put("Vinayak", "pawar");
		
	}

}

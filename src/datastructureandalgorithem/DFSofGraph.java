package datastructureandalgorithem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

class DFS
{
	LinkedList<Integer> li [];
	//int edge;
	int vertex;
	
	DFS(int v)
	{
		//this.edge = e;
		this.vertex = v;
		li = new LinkedList[this.vertex];
		for(int i=0;i<v;i++)
		{
			li[i] = new LinkedList<Integer>();
		}
	}
	public void addEdges(int u,int v)
	{
		li[u].add(v);
		li[v].add(u);
		
	}
	
	
	public void usingIteration(int source)
	{
		Vector<Boolean> visited = new Vector<Boolean>(vertex); 
        for (int i = 0; i < vertex; i++) 
            visited.add(false); 
  
        // Create a stack for DFS 
        Stack<Integer> stack = new Stack<>(); 
          
        // Push the current source node 
        stack.push(source); 
          
        while(stack.empty() == false) 
        { 
            // Pop a vertex from stack and print it 
            int s = stack.peek(); 
            stack.pop(); 
              
            // Stack may contain same vertex twice. So 
            // we need to print the popped item only 
            // if it is not visited. 
            if(visited.get(s) == false) 
            { 
                System.out.print(s + " "); 
                visited.set(s, true); 
            } 
              
            // Get all adjacent vertices of the popped vertex s 
            // If a adjacent has not been visited, then push it 
            // to the stack. 
            Iterator<Integer> itr = li[s].iterator(); 
              
            while (itr.hasNext())  
            { 
                int v = itr.next(); 
                if(!visited.get(v)) 
                    stack.push(v); 
            } 
              
        } 
    } 
	
	
	public void DFSOfGraph(int source)
	{
		boolean vis [] = new boolean[vertex];
		for(int i=0;i<vertex;i++)
			 vis[i] = false;
		
		DFSUtil(source,vis);
	}
	public void DFSUtil(int source,boolean vis[])
	{
		
		vis[source] = true;
		
		
		
		
			
			
			System.out.print(source +" ");
	        Iterator<Integer> it = li[source].iterator();
	        while(it.hasNext())
	        {
	        	int a = it.next();
	        	if(!vis[a] )
	        	{
	        		vis[a] = true;
	        		DFSUtil(a,vis);
	        	}
	        }
		}
		
	}
	
	
	





public class DFSofGraph {

	public static void main(String[] args) {
		
	    DFS d = new DFS(5);
	    d.addEdges(0, 1);
	    d.addEdges(0, 2);
	    d.addEdges(0, 3);
	    d.addEdges(2, 4);
	    d.DFSOfGraph(0);
	    
	}

}

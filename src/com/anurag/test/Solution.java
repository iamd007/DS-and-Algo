package com.anurag.test;

import java.util.ArrayList;

public class Solution {

	private int heap[];
	int size;
	int maxSize;
	Solution(int maxSize)
	{
		this.maxSize = maxSize;
		heap = new int[this.maxSize];
		size=0;
		heap[0]=Integer.MAX_VALUE;
	}
	
	
    public int parent(int pos)
    {
    	return pos/2;
    }
	
    public void swap(int pos1,int pos2)
    {
    	int temp= heap[pos1];
    	heap[pos1] = heap[pos2];
    	heap[pos2] = temp;
    }
    
    
    
    
    
	public void insert(int data)
	{
		heap[++size] = data;
		int current = size;
		while(heap[current] > heap[parent(current)])
		{
			swap(current,parent(current));
			current = parent(current);
		}
	}
	public void printHeap(int [] a,int n)
	{
		for(int i=1;i<=n;i++)
		System.out.print(" "+ a[i] );
	}
	
	public boolean isLeaf(int pos)
	{
		if(pos>size/2 && pos <= size)
			return true;
		return false;
	}
	
	public int leftChild(int pos)
	{
	   return 2*pos;	
	}
	public int rightChild(int pos)
	{
	   return 2*pos+1;	
	}
	
	public void maxHeapiFy(int pos)
	{
		if(isLeaf(pos))
			return;
		
		if(heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)])
		{
			if(heap[leftChild(pos)] < heap[rightChild(pos)])
			{
				swap(pos,rightChild(pos));
				maxHeapiFy(rightChild(pos));
			}
			else{
				swap(pos,leftChild(pos));
				maxHeapiFy(leftChild(pos));
			}
		}
		
	}
	
	public int  extract()
	{
		int data  = heap[1];
		heap[1] = heap[size--];
		maxHeapiFy(1);
		return data;
	}
	public int topHeap()
	{
		return heap[1];
	}
	public static void main(String[] args) {
		
		Solution s = new Solution(10);
		s.insert(10);
		s.insert(70);
		s.insert(10);
		s.insert(70);
		s.printHeap(s.heap,s.size);
		System.out.println();
		s.extract();
		s.printHeap(s.heap,s.size);
		System.out.println();
		s.insert(100);
		s.insert(200);
		s.insert(1);
		s.printHeap(s.heap,s.size);
		System.out.println();
		System.out.println("Top data is "+ s.topHeap());
		s.insert(70);
		s.printHeap(s.heap,s.size);
		System.out.println();
		

	}

}

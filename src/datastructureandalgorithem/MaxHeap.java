package datastructureandalgorithem;

public class MaxHeap {

	int []heap;
	int size;
	int maxSize;
	
	
	MaxHeap(int maxSize)
	{
		this.maxSize = maxSize;
		this.size =0;
		heap = new int[maxSize+1];
		heap[0] = Integer.MAX_VALUE;
	}
	public int parent(int pos)
	{
		return pos/2;
	}
	public void swap(int fpos,int spos)
	{
		int temp=heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = temp;
	}
	public void insert(int data)
	{
		heap[++size]=data;
		int current = size;
		while(heap[current] > heap[parent(current)])
		{
			if(heap[current] >heap[parent(current)])
			{
				swap(current,parent(current));
			}
			current = parent(current);
		}
		
	}
	
	public boolean isLeaf(int pos)
	{
		if(pos > size/2 && pos<=size)
		{
			//System.out.println(" true");
			return true;
		}
		return false;
	}
	
	public int leftChild(int pos)
	{
		return 2*pos;
	}
	public int rightChild(int pos)
	{
		return 2*pos +1;
	}
	public void maxHeapyFy(int pos)
	{
		if(isLeaf(pos))
		{
			//System.out.println("parent " + heap[pos]+" lchild " + heap[leftChild(pos)] +"  rchild " +heap[rightChild(pos)]);
			return;

		}
		   		
		//System.out.println("parent " + heap[pos]+" lchild " + heap[leftChild(pos)] +"  rchild " +heap[rightChild(pos)]);
		
		if(heap[pos] < heap[leftChild(pos)]  || heap[pos] < heap[rightChild(pos)]	)
		{
			System.out.println("parent " + heap[pos]+" lchild " + heap[leftChild(pos)] +"  rchild " +heap[rightChild(pos)]);
                    if(heap[leftChild(pos)] < heap[rightChild(pos)])
                    {
                    	swap(pos,rightChild(pos));
                    	maxHeapyFy(rightChild(pos));
                    }
                    else
                    {
                    	swap(pos,leftChild(pos));
                    	maxHeapyFy(leftChild(pos));
                    }
		}
	}
	
	public int extractMax()
	{
		int data =heap[1];
		heap[1] = heap[size--];
		maxHeapyFy(1);
		return data;
	}
	
	public static void main(String[] args) {
		MaxHeap mh = new MaxHeap(10);
        mh.insert(10);
        mh.insert(30);
        mh.insert(40);
        mh.insert(9);
        mh.insert(78);
        mh.insert(100);
        for(int i=1;i<=10;i++)
        	System.out.print(" " +mh.heap[i]);
        
        System.out.println();
        System.out.println(mh.extractMax());
        
        for(int i=1;i<=10;i++)
        	System.out.print(" " +mh.heap[i]);
	}

}

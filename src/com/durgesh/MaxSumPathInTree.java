package com.durgesh;

class tree
{
	int data;
	tree left;
	tree right;
	tree(int data)
	{
          this.data = data;
          this.left = null;
          this.right = null;
          
	}
}


public class MaxSumPathInTree {
	static int  max_sum;
	static int maxsumsofar;
	/*//public static int maximmumSumPath(tree t)
	{
		if(t==null)
			return 0;
		if(t.left == null && t.right ==null)
			return t.data;
		//maxsumsofar=
				
		//return max_sum;		
		
	}
*/
	public static void main(String[] args) {
		
           tree t = new tree(1);
           t.left = new tree(2);
           t.left.left = new tree(4);
           t.left.right = new tree(5);
           t.right = new tree(3);
           t.right.right = new tree(-7);
           t.right.left = new tree(6);
        //   int res = maximmumSumPath(t);
           
	}

}

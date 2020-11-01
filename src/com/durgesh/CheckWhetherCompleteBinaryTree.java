package com.durgesh;



//Java program to check if binay tree is complete or not 

/* Tree node structure */
class Node 
{ 
	int data; 
	Node left, right; 

	Node(int item) { 
		data = item; 
		left = right = null; 
	} 
} 

class CheckWhetherCompleteBinaryTree 
{ 
	Node root; 

	/* This function counts the number of nodes in a binary tree */
	int countNodes(Node root) 
	{ 
		if (root == null) 
			return (0); 
		return (1 + countNodes(root.left) + countNodes(root.right)); 
	} 

	/* This function checks if the binary tree is complete or not */
	boolean isComplete(Node root) 
	{ 
		// An empty tree is complete 
		if (root == null)		 
		return true; 

		if(root.left ==null && root.right==null)
			return true;
		
		// If index assigned to current node is more than 
		// number of nodes in tree, then tree is not complete 
		if(root.left ==null && root.right !=null)
			return false;
		
		if(root.left !=null && root.right ==null)
			return true;

		// Recur for left and right subtrees 
		return (isComplete(root.left) 
			&& isComplete(root.right)); 

	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		CheckWhetherCompleteBinaryTree tree = new CheckWhetherCompleteBinaryTree(); 
		
		// Le us create tree in the last diagram above 
		Node NewRoot = null; 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.right = new Node(5); 
		tree.root.left.left = new Node(4); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 
		tree.root.right.right.left = new Node(8);
		
		
		
		if (tree.isComplete(tree.root )) 
			System.out.print("The binary tree is complete"); 
		else
			System.out.print("The binary tree is not complete"); 
	} 
} 

//This code is contributed by Mayank Jaiswal 

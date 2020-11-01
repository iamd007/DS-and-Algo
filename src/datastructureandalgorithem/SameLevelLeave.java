package datastructureandalgorithem;



class Node 
{ 
	int data; 
	Node left, right; 

	Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class Leaf 
{ 
	int leaflevel=0; 
} 

class SameLevelLeave 
{ 
	Node root; 
	Leaf mylevel = new Leaf(); 
	
	/* Recursive function which checks whether all leaves are at same 
	level */
	boolean checkUtil(Node node, int level, Leaf leafLevel) 
	{ 
		// Base case 
		
		System.out.println(" Leve " +level +" LeafLevel " +leafLevel.leaflevel);
		if (node == null) 
		{  System.out.println("---------------When Node is equal to null---------------");
			return true; 
		}	
		// If a leaf node is encountered 
		if (node.left == null && node.right == null) 
		{ 
			// When a leaf node is found first time 
			
			System.out.println("---------------When left child and right child are equal to null---------------");
			System.out.println("leafleel efor  enterng" +leafLevel.leaflevel );
			System.out.println("node data  " + node.data);
			if (leafLevel.leaflevel == 0) 
			{ 
				System.out.println("***** when leaflevel is equal to zero  ***"); 
				leafLevel.leaflevel = level; 
				System.out.println("LEVE AND LEAFLEVEL " +level);
				return true; 
			} 

			// If this is not first leaf node, compare its level with 
			// first leaf's level
			System.out.println("when leaflevel is not equal to zero   " +level +"  " + leafLevel.leaflevel);
			return (level == leafLevel.leaflevel); 
		} 

		// If this node is not leaf, recursively check left and right 
		// subtrees 
		return checkUtil(node.left, level + 1, leafLevel) 
				&& checkUtil(node.right, level + 1, leafLevel); 
	} 

	/* The main function to check if all leafs are at same level. 
	It mainly uses checkUtil() */
	boolean check(Node node) 
	{ 
		int level = 0; 
		return checkUtil(node, level, mylevel); 
	} 

	public static void main(String args[]) 
	{ 
		// Let us create the tree as shown in the example 
		SameLevelLeave tree = new SameLevelLeave(); 
		tree.root = new Node(12); 
		tree.root.left = new Node(5); 
		tree.root.right = new Node(7);
		tree.root.left.left = new Node(3); 
		tree.root.left.right = new Node(9); 
		tree.root.left.left.left = new Node(1); 
		tree.root.left.right.left = new Node(1); 
		if (tree.check(tree.root)) 
			System.out.println("Leaves are at same level"); 
		else
			System.out.println("Leaves are not at same level"); 
	} 
} 

//This code has been contributed by Mayank Jaiswal 





package compicod;
import java.util.*;


	class Node1
	{
	    int key;
	    Node1 left, right;
	 
	    public Node1(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}
	 
		class binarytry1
	{
	 
	    Node1 root;
	 
	
	    binarytry1(int key)
	    {
	        root = new Node1(key);
	    }
	 
	    binarytry1()
	    {
	        root = null;
	    }
	    void printPostorder(Node1 node)
	    {
	        if (node == null)
	            return;
	 
	        // first recur on left subtree
	        printPostorder(node.left);
	 
	        // then recur on right subtree
	        printPostorder(node.right);
	 
	        // now deal with the node
	        System.out.print(node.key + " ");
	    }
	 
	    void printPostorder()  {     printPostorder(root);  }
	    
	 /*   Node1 input(Node1 root) {
	    	binarytry1 tree = new binarytry1();
	    	if(root==null) {
	    		int p;
	    		Scanner scan=new Scanner(System.in);
	    		root=new Node1(p=scan.nextInt());
	    		if(p==0) {return root;}
	    	}
	    	
	    		System.out.println("enter the left node");
	   	        input(root.left);
	   	        System.out.println("enter the Right node");
	   	        input(root.right);
	    		
	    	
	    	return root;
	    	
	    }
	    void input()  {     input(root);  }*/
	    
	    public static void main(String[] args)
	    {
	    	 binarytry1 tree = new binarytry1();
	    	 binarytry1 tree2 = new binarytry1();

	        
	    	 System.out.println("enter the root node");
		        Scanner scan=new Scanner(System.in);
		       // tree.root=new Node1(scan.nextInt());
		     //   tree.input();
		        tree.root=new Node1(1);
		        tree.root.left=new Node1(2);
		        tree.root.right=new Node1(3);
		        tree.root.left.left=new Node1(4);
		        tree.root.left.right=new Node1(5);
		        
		        tree2.root=new Node1(3);
		        tree2.root.left=new Node1(4);
		        tree2.root.right=new Node1(5);
		        
	        tree.printPostorder();
	        tree2.printPostorder();
	    }
	}


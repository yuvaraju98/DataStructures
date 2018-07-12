package compicod;
import java.util.*;
class Nodec{
	
	int key;
	Nodec left,right;
	
	public Nodec(int item) {
		key=item;
		left=right=null;
		
	}
	
}

public class spiralbtree {

	static Nodec root;
	
	spiralbtree(int item){
		root = new Nodec(item);
		
	}
	spiralbtree(){
		root = null;
		
	}
	void printSpiral(Nodec root){
		Stack<Nodec> s1=new Stack<Nodec>();
		Stack<Nodec> s2=new Stack<Nodec>();
		
		s1.push(root);
		
		while(!s1.empty() || !s2.empty()) {
			
			while(!s1.empty()) {
				
				Nodec temp=s1.peek();
				s1.pop();
				System.out.print(temp.key+ " ");
				if(root.right!=null)
				s2.push(temp.right);
				if(root.left!=null)
					s2.push(temp.left);
				
			}
			
			while(!s2.empty()) {
				
				Nodec temp=s2.peek();
				s2.pop();
				System.out.print(temp.key+ " ");
				if(root.left!=null)
					s1.push(temp.left);
				if(root.right!=null)
				s1.push(temp.right);
				
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		spiralbtree tree=new spiralbtree();
		 	spiralbtree.root = new Nodec(1);
	        spiralbtree.root.left = new Nodec(2);
	        spiralbtree.root.right = new Nodec(3);
	        spiralbtree.root.left.left = new Nodec(7);
	        spiralbtree.root.left.right = new Nodec(6);
	        spiralbtree.root.right.left = new Nodec(5);
	        spiralbtree.root.right.right = new Nodec(4);
	        System.out.println("Spiral Order traversal of Binary Tree is ");
	        tree.printSpiral(root);
		
	}
	
}

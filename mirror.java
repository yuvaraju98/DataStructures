package compicod;
import java.util.*;
class Nodep{
	
	int key;
	Nodep left,right;
	
	public Nodep(int item) {
		key=item;
		left=right=null;
		
	}
	
}
public class mirror {

static Nodep root;
	static Queue<Nodep> sm=new LinkedList<Nodep>();
mirror(int item){
		root = new Nodep(item);
		
	}
	mirror(){
		root = null;
		
	}
	void swap(Nodep temp) {
		if(temp==null)
			return;
		Nodep t;
		t=temp.left;
		temp.left=temp.right;
		temp.right=t;
		

	}
	 void mirror1(Nodep root) {
		 

		
		sm.add(root);
		
		Nodep temp;
		 
	
		while(!sm.isEmpty()) {
		temp=sm.peek();
	
		sm.poll();
		
		swap(temp);
		

		try{
			if(temp.left!=null)
			sm.add(temp.left);
		if(temp.right!=null)
			sm.add(temp.right);
		}
		catch(NullPointerException e){
			
			postorde(root);
			break;
		}
	}}
	void postorde(Nodep node) {
		mirror m=new mirror();
		
		if(node==null) {
			
			return;}
		System.out.print(node.key);
		m.postorde(node.left);
		
		m.postorde(node.right);
	}
	
	
	public static void main(String[] args) {
		mirror tree1=new mirror();
		 	mirror.root = new Nodep(1);
	        mirror.root.left = new Nodep(2);
	        mirror.root.right = new Nodep(3);
	        mirror.root.left.left = new Nodep(7);
	        mirror.root.left.right = new Nodep(6);
	        mirror.root.right.left = new Nodep(5);
	        mirror.root.right.right = new Nodep(4);
	   
	        System.out.println("Spiral Order traversal of Binary Tree is ");
	        
	        tree1.mirror1(root);
	        tree1.postorde(root);
	}
}

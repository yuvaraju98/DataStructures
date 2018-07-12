package compicod;


	class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	class treetry1{
		Node root;
		treetry1(int data){
			root=new Node(data);
			
		}
		treetry1(){
			root=null;
			
		}
		public static void main(String[] args) {
			treetry1 t=new treetry1();
			Node root2;
			
			t.root=new Node(10);
			t.root.left=new Node(20);
			root2=t.root;
			System.out.println(t.root.data);
			System.out.println(root2.left.data);
		while((root2.left !=null) && (root2.right != null)) {
			System.out.println("enteref");
			System.out.println(t.root.data);
		}
		}
	}



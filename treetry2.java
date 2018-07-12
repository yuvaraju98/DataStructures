package compicod;


	class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	class treetry2{
		Node root;
		treetry2(int data){
			root=new Node(data);
			
		}
		treetry2(){
			root=null;
			}
		
		
		void prin(Node root){
			if(root == null) {
				return ;
			}
			prin(root.left);
			
			prin(root.right);
			
			
			System.out.println(root.data);
		}
		public static void main(String[] args) {
			treetry2 t=new treetry2();
			Node root2;
			
			t.root=new Node(10);
			t.root.left=new Node(20);
			root2=t.root;
		
			root2=root2.left;
		
		    t.prin(t.root);
		}
		}
	

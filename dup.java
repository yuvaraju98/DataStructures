package compicod;

import java.util.HashSet;

public class dup {
	Node head,prev;
	
	class Node{
		
		Node next;
		int data;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void push(int d) {
		
		Node temp=new Node(d);
		temp.next=head;
		head=temp;
		
	}
	void p() {
		
		Node cur=head;
		
		
		while(cur != null) {
			System.out.println(cur.data+"");
			cur = cur.next;
		}}
	
	
		void che() {
			HashSet<Integer> hs=new HashSet<Integer>();
			Node cur=head;
			
			prev=null;
			while(cur != null) {
				if(hs.contains(cur.data) ) {
					System.out.println("inside for");
				
					prev.next=cur.next;
				}
				else {
					System.out.println("inside else");
					hs.add(cur.data);
					prev=cur;
					
					
				}cur = cur.next;
			}
		
	}
		
	
	public static void main(String[] args) {
		dup ll=new dup();
		ll.push(45);
		ll.push(50);
		ll.push(50);
		ll.push(40);
		ll.push(40);
		ll.push(40);
		ll.push(40);
		ll.push(35);
		ll.p();
		ll.che();
		System.out.println("after doing");
		
		ll.p();
	}

	
}

package compicod;


public class delmid_ll {
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
	void mid() {
		Node cur=head;
		Node prev=head;
		Node prev2=head;
		while(cur != null && cur.next != null) {
			cur=cur.next.next;
			
			prev2=prev;
			prev=prev.next;
			
		}
		prev2.next=prev.next;
		
		
	}
	
	void p() {
		
		Node cur=head;
		
		
		while(cur != null) {
			System.out.print(cur.data+"  ");
			cur = cur.next;
		}}
	

	public static void main(String[] args) {
		delmid_ll ll=new delmid_ll();
		ll.push(45);
		ll.push(50);
		ll.push(55);
		ll.push(60);
		ll.push(65);
		ll.push(70);
		ll.push(75);
		ll.push(80);
		ll.push(90);
		
		ll.p();
		ll.mid();
		System.out.println("after doing");
		
		ll.p();
	}
}

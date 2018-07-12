package compicod;

public class kthele2 {
	node head;
	class node{
		node next;
		int data;
		node(int d){
			data=d;
			next=null;
			}
					}
	void ty() {
		node cur=head;
		for(int i=0;i<5;i++) {
			System.out.println(cur.next);
			cur=cur.next;
		}
		
	}
	void push(int d) {
		node temp=new node(d);
		temp.next=head;
		head=temp;
		}
	
	void display() {
		node cur=head;
		while(cur != null) {
			System.out.print(cur.data +" ");
			cur=cur.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		kthele2 k=new kthele2();
		
		k.push(20);
		k.push(4);
		k.push(15);
		k.push(35);
		k.display();
		k.k(3);
		k.ty();
	}
	
	void k(int d) {
		node ref=head;
		node main=head;
		System.out.println("e");
		for(int i=0;i<d;i++) {
			System.out.println(i+"e"+d);
			ref=ref.next;
		}
		while(ref != null) {
			main=main.next;
			ref=ref.next;
		}
		System.out.println(main.data);
		
	}

}


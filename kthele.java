package compicod;

public class kthele {
	node head;
	
	public class node{
		node next;
		int data;
		
		node(int d){
			data=d;
			next=null;
		}}
	void kth (int n){
		
		node curl=head;
		node doubl=head;
		node start=head;
		int count=0;
		while(doubl != null) {
			doubl=doubl.next;
			count++;
			curl=curl.next;
			System.out.println("cur is "+curl.data);
			if(doubl != null)
			{
				doubl=doubl.next;
				count++;
			}
			else {
				break;
			}
			
		}
		int c=count/2;
		System.out.println(c+" count");
		if(n>c) {
			int p=n-c;
			for(;p!=0;p--) {
				System.out.println("n"+n+" c --"+p);

				curl=curl.next;
				
			}System.out.println(curl.data);
			
		}
		else {
			System.out.println(start.data);
			while(n != c) {
				System.out.println("n"+n+" c "+c);
				start=start.next;
				c++;
				}
			System.out.println(start.data);
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
				
				System.out.println(cur.data);
				cur=cur.next;
			}
		
		
		}
		
	
	public static void main(String[] args) {
		kthele n = new kthele();
		n.push(10);
		n.push(20);
		n.push(30);
		n.push(50);
		n.push(5);
		n.push(35);
		n.push(25);
		n.display();
		System.out.println("chwcking for nthhe elemets");
		
		n.kth(4);
	
	
}
	
}


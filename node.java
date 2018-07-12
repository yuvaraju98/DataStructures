package compicod;



public class node {
	node next=null;
	int data;
	 public int getData() {
		  return data;
		 }
	 public node getNext() {
		  return next;
		 }	
	}



class myll{
	
	static node head;
	void insert(int a){
		
		node temp=new node();
		temp.data=a;
		temp.next=head;
		head=new node();
	}
	
	
	 public void p() {
		  System.out.println("Printing LinkedList (head --> last) ");
		  node c = head;
		
		  while (c != null) {
		System.out.println(c.getData());
		
		   c=c.getNext();
		   
		  }
	
}

}
class impl{
	
	public static void main(String[] args) {
		 
		myll l=new myll();
		l.insert(5);
		l.insert(6);
		l.insert(5);
		l.p();
	
		
	
}
}


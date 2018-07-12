package compicod;
import java.util.*;

import compicod.delmid_ll.Node;
public class queuetry1 {
	
	NODE head;
	class NODE{
		int data;
		NODE next;
	 NODE(int d) {
		data=d;
		next=null;
	}
	 
	}
	
	void push(int d) {
		NODE temp=new NODE(d);
		temp.next=head;
		head=temp;
	}
void pr() {
		
		NODE cur=head;
		
		
		while(cur != null) {
			System.out.print(cur.data+"  ");
			cur = cur.next;
		}
		
		while(cur != head) {
			System.out.print(cur.data+"  ");
			cur = cur.next;
		}
		}
	
	public static void main(String[] args) {
		queuetry1 q=new queuetry1();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		q.pr();
	}
	
	
}

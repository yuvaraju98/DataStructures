package compicod;
import java.util.*;

class no{
	
	int data;
	no next;
	
	no(int d){
		data=d;
		next=null;
	}
	
}
public class ll_5rev {
	no head;
	
	void push(int d) {
		no temp=new no(d);
		temp.next=head;
		head=temp;
		
	}
	void prin() {
		no cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+"-->");
			cur=cur.next;
			
		}
		
	}
	void rev(int k) {
		
		no cur=head;
		no temp=null;
		no tempf=null;
		Queue<no> s=new LinkedList<no>();
		while(cur!=null) {
			if(cur.data!=k) {
				System.out.println("pushing"+cur.data);
				s.add(cur);
			}
			else {s.add(cur);
				while(!s.isEmpty()) {
					System.out.println("in else"+cur.data);
					no temp2=new no(s.peek().data);
					temp2.next=temp;
					temp=temp2;
					
					System.out.println(s.peek().data);
					s.poll();
					
				
					
				}
				
				
				
				k=k+k;
				System.out.println("k value"+k);
			}
			cur=cur.next;
		}
		
		System.out.println("displaying");
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
			
		}
		
	}
	public static void main(String[] args) {
		ll_5rev r=new ll_5rev();
		r.push(7);
		r.push(6);
		r.push(5);
		r.push(4);
		r.push(3);
		r.push(2);
		r.push(1);
		r.prin();
		r.rev(3);
		
		
	}
	
}

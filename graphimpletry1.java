package compicod;
import java.util.*;



	public class graphimpletry1{
		LinkedList<Integer> arr[];
		graphimpletry1(int v){
			arr=new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				arr[i]=new LinkedList<Integer>();
			}
		}
	
	
	static void addg(graphimpletry1 g,int src,int dec) {
		g.arr[src].addFirst(dec);
		
	}
	
	static boolean check(graphimpletry1 g,int sr,int dr) {
		System.out.println("workinh mian");

		boolean[] vis=new boolean[5];
		LinkedList<Integer> que=new LinkedList<Integer>();
		Iterator<Integer> j;
		vis[sr]=true;
		que.add(sr);
		while(!que.isEmpty()) {
			int cur=que.poll();
			System.out.print(cur+"->");
			j=g.arr[cur].listIterator();
			
			while(j.hasNext()) {
				

				int n=j.next();
				if(n==dr) {
					return true;
				}
				if(!vis[n]) {
					vis[n]=true;
					que.add(n);
				}
		
			}
			
			}

		System.out.println("workinh checek");
		return false;
	}
}
class mai{
	
	public static void main(String[] args) {
		graphimpletry1 g=new graphimpletry1(5);
		
		graphimpletry1.addg(g,0,1);
		graphimpletry1.addg(g,1,3);
		graphimpletry1.addg(g,2,3);
		graphimpletry1.addg(g,3,4);
		graphimpletry1.addg(g,4,2);
		graphimpletry1.addg(g,3,0);

		System.out.println("workinh mian");
		graphimpletry1.check(g,0,2);
	}}



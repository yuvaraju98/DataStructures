package compicod;
import java.util.*;
public class graphpaththere {
	
	
	static class graph{
		
		static LinkedList<Integer> arr[];
		static int v;
		graph(int v){
			graph.v=v;
			arr =new LinkedList[v];
			for(int i=0;i<v;i++) {
				arr[i]=new LinkedList<Integer>();
			}
		}
	
	}
	
	static void adde(graph g,int src,int dest) {
		graph.arr[src].addFirst(dest);
		graph.arr[dest].addFirst(src);	
	}
	
	static void display(graph g) {
		  for(int i = 0; i < graph.v; i++)
	        {
	            System.out.println("Adjacency list of vertex "+ i);
	            System.out.print("head");
	            for(Integer p: graph.arr[i]){
	                System.out.print(" -> "+p);
	            }
	            System.out.println("\n");
	        }
	}
	
	static boolean chech(graph g) {
		  int s=0;
		  int d=4;
		Iterator <Integer> it;
		LinkedList<Integer> queue=new LinkedList<Integer>();
		int[] v=new int[graph.v];
		v[s]=1;
		
		for(int i = 0; i < graph.v; i++)
	        {
			
			it=graph.arr[i].listIterator();
			System.out.println("inswid echeck");
			while(it.hasNext()) {
				int n=it.next();
				if(s==d) {
					return true;
				}
				
				System.out.println(it.next());
			}
	        }  
	}
	
	public static void main(String[] args) {
		
		
		int V = 5;
        graph gr = new graph(V);
        adde(gr, 0, 1);
        
        adde(gr, 1, 2);
        adde(gr, 1, 3);
        
        adde(gr, 2, 3);
        adde(gr, 3, 4);
		display(gr);
		chech(gr);
		
	}
	
}

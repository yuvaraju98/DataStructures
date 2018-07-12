package compicod;
import java.util.*;
public class basicgraph {
	
	
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
	
	
	public static void main(String[] args) {
		
		
		int V = 5;
        graph gr = new graph(V);
        adde(gr, 0, 1);
        adde(gr, 0, 4);
        adde(gr, 1, 2);
        adde(gr, 1, 3);
        adde(gr, 1, 4);
        adde(gr, 2, 3);
        adde(gr, 3, 4);
		display(gr);
		
	}
	
}

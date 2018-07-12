import java.util.*;

class basicgraph2{
	
	LinkedList<Integer> arr[];
	int v;
	class graph{
		
		graph(int v){
			this.v=v;
			for(int i=0;i<v;i++) {
				arr[i]=new LinkedList();
			}
		}
		
		
	}
	void adde(graph gh,int src,int dest)
	{
		gh.arr[src]=dest;
		gh.arr[dest]=src;
	}
	
	void display() {
		
	}
	
}
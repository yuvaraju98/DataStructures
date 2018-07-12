import java.util.*;

public class allcomb{
	
public static void main(String[] args)
 {
        
     int[] a;
     a=new int[] {1,2,3};
	int i,j;
		i=j=0;
   
    	 for(j=0;j<3;j++) {
    		 System.out.println(a[j]);
		System.out.println("{"+a[j]+","+a[(j+1)%3]+"}");
		System.out.println("{"+a[j]+","+a[(j+1)%3]+","+a[(j+2)%3]+"}");
    	 }
    
    }}

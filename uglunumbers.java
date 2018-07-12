package compicod;
import java.util.*;
public class uglunumbers {
public static void main(String[] args) {
	

	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the number");
	int a;
	a=scan.nextInt();
	int[] l=new int[a+1];
	int j=1;
	l[j]=1;
	for(int i=1;j!=a;i++) {
		
		if(i%2==0 || i%3==0 || i%5==0 ) {
			System.out.println(i+"is prine");
			if(any(i)==true) {
			
			l[++j]=i;
		}
			}
		
	}
	System.out.println("output "+l[j]);
	
}
static boolean any(int i) {
	int a=0;
	for(int j=6;j<=i;j++) {
		if(i%j ==0) {
			System.out.println(i+"%"+j);
			a=1;
		}
	}
	if(a==0) {
		return true;
	}
	else return false;
}
}

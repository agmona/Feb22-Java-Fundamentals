//write a method to print fibonacci series
import java.util.Scanner;

public class FibonacciSeriesByMethod {

	public static void main(String[] args) {
		fibonacci();
	}
		
		public static void fibonacci () {
			int n1=0, n2=1, n3=1;
			System.out.print(n1+" "); 
			System.out.print(n2); 
             int count =100;
			do {
				 n3=n1+n2;    
				  System.out.print(" "+n3);    
				  n1=n2;    
				  n2=n3;   
			}
			
			while (n2<=count);
	}

}

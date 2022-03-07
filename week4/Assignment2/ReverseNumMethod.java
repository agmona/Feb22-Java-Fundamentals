//-write a method to Reverse a Number in Java
import java.util.Scanner;

public class ReverseNumMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter NUmber");
		int n = sc.nextInt();
		ReverseNum(n);
	}
		
		public static int ReverseNum (int n) {
			int rev =0;
			while (n!=0) {
				int digit = n%10;
				rev= (rev*10)+digit;
				n= n/10;
			}
			
		System.out.println(rev);
		return rev;

	}

}

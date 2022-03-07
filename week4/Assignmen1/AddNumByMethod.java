//write a method that adds 2 numbers and returns the answer
import java.util.Scanner;

public class AddNumByMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter NUmbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	 sumTwoNum(a,b);
	}
		
		public static int sumTwoNum (int a, int b) {
			
			int sum = a+b;
		System.out.println(sum);
		return sum;
		}
}

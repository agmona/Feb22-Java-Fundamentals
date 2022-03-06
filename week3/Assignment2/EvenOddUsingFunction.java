import java.util.Scanner;

//WAP to creat a fuction that check if no. is odd or even. call this function from main method
public class EvenOddUsingFunction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		boolean bool = EvenOrOdd(n);
		System.out.println("is even?" + bool);
	}
public static boolean EvenOrOdd (int n){
	boolean even=false;
	if (n%2==0)
		{
		even = true;
		}
	return even;
}
}

import java.util.Scanner;

//use while loop to calculate factorial of a number by taking user input
public class FactorialUsinghileLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int fact = 1, i=1;
		while (i<=n) {
	fact= fact*i;
		i++;
		}
System.out.println(fact);
	}

}
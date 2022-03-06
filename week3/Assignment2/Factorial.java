import java.util.Scanner;

//Apply do while loop to calculate factorial of a number such that, program asks  user, if he wants to continue, if yes, program should run again
public class FactorialUsingDoWhile {

	public static void main(String[] args) {
		int i=1;
		int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		do
		{
			fact=fact*i;
			i++;
		}
		while
			(i<=num);
		System.out.println(fact);
	}

}

package feb16;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");

		int num = sc.nextInt(), i = 1, fact = 1;
		do {
			fact = fact * i;
			i++;
		} while (i <= num);
		System.out.println("factorial is: " + fact);

	}

}

package feb16;

import java.util.Scanner;

public class OddEvenUsingFunction {
	public static void main(String[] args) {
		evenNumber();
		oddNumber();
	}

	public static void evenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("even");
		}

	}

	public static void oddNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();

		if (n % 2 != 0) {
			System.out.println("odd");
		}

	}
}

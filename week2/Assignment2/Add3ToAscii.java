package feb15;

import java.util.Scanner;

public class Add3ToAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character:");

		char ch1 = sc.next().charAt(0);
		int asciivalue = ch1 + 3;
		System.out.println(asciivalue);

	}

}
package feb15;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fahrenheit value:");
		double f = sc.nextDouble();
		double c = ((f-32)/1.8);
		System.out.println(c);

	}

}
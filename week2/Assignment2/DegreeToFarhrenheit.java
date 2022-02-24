package feb15;

import java.util.Scanner;

public class DegreeToFarhrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fahrenheit value:");
		double f = sc.nextDouble();
		double c = ((f*1.8)+32);
		System.out.println(c);

	}

}

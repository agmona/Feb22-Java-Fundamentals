package feb15;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter inch value:");
		double inch = sc.nextDouble();
		double meter = (inch*0.025400000025908);
		System.out.println(meter);

	}

}

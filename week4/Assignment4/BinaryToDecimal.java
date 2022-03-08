import java.util.Scanner;

//WAP to convert binary number to decimal
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int d= 0;
		int i=0;
		while (num>0) {
			int r = num%10;
			num=num/10;
			d= d+r*(int)Math.pow(2,i++);
		}
            System.out.println(d);
	}

}

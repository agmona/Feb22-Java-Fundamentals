import java.util.Scanner;

//		"Write a Program to Print Half Diamond Star Pattern.
//
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
public class HalfDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		for (int i=n; i>=1; i--) {
			for (int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1; i<=n; i++) {
			for (int j=n-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

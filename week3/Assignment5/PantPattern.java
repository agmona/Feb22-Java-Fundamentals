import java.util.Scanner;

//Write a Program to Print the Pant's style Star Pattern.
//
//*********
//**** ****
//***   ***
//**     **
//*       *"
public class PantPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			for (int j=1;j<(i*2);j++)
			{
				if (j>1 && j<(i*2)-1)
				System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int j=1; j<=n-i+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}

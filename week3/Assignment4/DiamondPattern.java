import java.util.Scanner;

//Diamond Pattern
public class DiamondPatter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
//			// for spaces
			for (int j=0; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			//for stars
			for (int j=1; j<=(i*2)-1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=n-1; i>=1; i--) {
//			// for spaces
			for (int j=0; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			//for stars
			for (int j=1; j<=(i*2)-1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

import java.util.Scanner;

//Use while loop to calculate sum of numbrs till n, where n is taken from user
public class sumOfNnumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int sum = 0, i=1;
		while (i<=n) {
		sum= sum+i;
		i++;
		}
System.out.println(sum);
	}

}

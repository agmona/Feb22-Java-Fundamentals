import java.util.Scanner;

public class EvenNumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.print("Enter Element of Array");
		for (int i=0; i<arr.length; i++) 
		{
			arr [i] = sc.nextInt();
		}
		System.out.print("Even Elements in Array");
		for (int i=0; i<arr.length; i++) 
		{
			if (arr[i]%2==0) {
				System.out.println(arr[i] +" ");	
			}

		}
	}

}

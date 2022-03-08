import java.util.Scanner;

public class MiddleOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter Element of Array");
		for (int i=0; i<arr.length; i++) 
		{
			arr [i] = sc.nextInt();
		}
				int mid= (size/2);
				System.out.println(arr[mid]);	
	}
}
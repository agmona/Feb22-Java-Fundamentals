import java.util.Scanner;

//  make an array with user inputs of size 10. , then find sum of all elements in array
public class SumOfArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size of array");
	int size = sc.nextInt();
	int arr[] = new int [size];
	for (int i=0; i<arr.length; i++) {
	System.out.println("Enter Element of Array");
	arr [i] = sc.nextInt();
	}
	int sum=0;
	for (int i=0; i<arr.length; i++) {
		sum = sum + arr[i];
		}
		System.out.println("sum of Array:"+ sum);
	
	}

}

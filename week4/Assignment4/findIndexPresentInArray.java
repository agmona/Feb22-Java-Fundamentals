//WAP to find first index at which element is present in array
import java.util.Scanner;

public class findIndexPresentInArray {

	public static void main(String[] args) {
		int arr[]= {16,15,1,19,10};
		// find 10 index in array
		Scanner sc = new Scanner (System.in);
		System.out.println("enter element to find Index:");
		int element = sc.nextInt();
		int index = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]== element) {
				index =i;
			}
		}
		System.out.println(index);

	}
}
import java.util.Scanner;

//WAP to find last index at which element is present in array
public class FindLastIndexInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size of Array:");
		int size = sc.nextInt();
		System.out.println("enter elements of Array:");
		int arr[]= new int [size];
		int index=0;
		for (int i=0;i<size;i++) {
			arr [i] = sc.nextInt();
			}
			// find last element index in array
		for (int i=0;i<size;i++) {
			if (arr[i]== arr[size-1]) {
				index =i;
			}
		}
		System.out.println(index);
			
		}

	}


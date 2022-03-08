import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
int [] marks = new int [size];
System.out.println("Enter marks");
for (int i=0; i<size; i++) {
	marks [i] = sc.nextInt();
}
System.out.println("marks are:");
	for (int i =0; i<size; i++) {
		System.out.print(marks[i]+" ");	
	}
	
 	}

}

//WAP to find difference in 2 arrays
public class DifferenceInTwoArray {

	public static void main(String[] args) {
		int a[] = {11,12,3,4,5};
		int b[] = {10,9,1,2,4};
		int size=b.length<a.length?b.length:a.length;
		int c[] = new int [size];
		System.out.println("after diff array are:");
		for (int i=0;i<size; i++) {
			c[i]=a[i]-b[i];
			System.out.println(c[i]);
			
		}

	}

}

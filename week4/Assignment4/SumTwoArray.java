
public class SumTwoArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,9,10,11,12};
		int size=b.length<a.length?b.length:a.length;
		int c[] = new int [size];
		System.out.println("after sum array are:");
		for (int i=0;i<size; i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
			
		}
			

	}

}

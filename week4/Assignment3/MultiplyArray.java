import java.util.Scanner;

//make an array with user inputs of size 10. then take multiplyng factor as 'd' from user.
//print the array, with all numbers, multiplied by multiplying factor"
public class MultiplyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter multiplication factor : ");
	    int d= sc.nextInt();
		System.out.print(" Please Enter Number of elements in an array :\n ");
		int Size = sc.nextInt();	
		int [] a = new int[Size];
		int [] b = new int[Size];
		
		System.out.print("\n Please Enter " + Size + " elements of an Array: \n");
		for (int i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		System.out.print("\n After multiplying by d Array are :"); 
		for(int i = 0; i < Size; i++)
		{
			b[i]= a[i]*d;
			{
				System.out.print(b[i] +" ");
			}
		}		
	}

}

import java.util.Scanner;

//write a method to Swap Two Numbers without using third variable
public class SwapNumbersMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter NUmbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		SwapNum(x,y);
	}
      public static void SwapNum (int x, int y) {
    	  x = x + y;   
          y = x - y;   
          x = x - y; 
          System.out.println(x);
          System.out.println(y);
          return;
      }
}

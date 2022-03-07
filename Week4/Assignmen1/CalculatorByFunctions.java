import java.util.Scanner;

//Write Calculator program including add, diff, multiply, divide, average and modulo. Include menu driven logic for above operations 
//and ask if user want to continue using do while
public class CalculatorByFunctions {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Choice: 1:add 2:diff 3:multiply 4:divide 5:average 6:modulo");
		int choice = sc.nextInt();
		
		if(choice >=1 && choice <=6) {
			System.out.println("enter num1");
			int a= sc.nextInt();
			System.out.println("enter num2");
			int b = sc.nextInt();
			
			switch (choice) {
			case 1:
				int result = add(a,b);
				System.out.println(result);
				break;
			case 2:
				int result1 = diff(a,b);
				System.out.println(result1);
				break;
			case 3:
				int result2 = multiply(a,b);
				System.out.println(result2);
				break;
			case 4:
				int result3 = divide(a,b);
				System.out.println(result3);
				break;
			case 5:
				int result4 = average(a,b);
				System.out.println(result4);
				break;
			case 6:
				int result5 = modulo(a,b);
				System.out.println(result5);
				break;
			}
		}
		
		else 
			{
			System.out.println("invalid choice");
			}
	
	}
	
	public static int  add (int a, int b) {
		int sum = a+b;
		return sum;
	}
	public static int  diff (int a, int b) {
		int subtraction = a-b;
		return subtraction;
	}
	public static int  multiply (int a, int b) {
		int product = a*b;
		return product;
	}
	public static int divide (int a, int b) {
		int Quotient = a/b;
		return Quotient;
	}
	public static int  average (int a, int b) {
		int average = (a+b)/2;
		return average;
	}
	public static int  modulo (int a, int b) {
		int modulo = a%b;
		return modulo;
	}

}

import java.util.Scanner;

public class GcdLcmByFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		GCD(a,b);
		LCM(a,b);
	}
	public static void GCD(int a, int b) {
		int gcd=1;
		int len= (a>b?a:b);
		for (int i=1; i<=len;i++){
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		{
			System.out.println(gcd);
		}
	}
	
	public static void LCM(int a, int b) {
		int gcd=1, lcm=1;
		int len= (a>b?a:b);
		for (int i=1; i<=len;i++){
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		lcm = (a*b)/gcd;
	    {
	   	 System.out.println(lcm);
	   	 }
}
}
    
   
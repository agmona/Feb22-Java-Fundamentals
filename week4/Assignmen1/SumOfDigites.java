
public class SumOfDigites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n= 1233;
 int sum=0;
 for (sum=0; n>0; sum +=n%10, n/=10);
 System.out.println(sum);
	}

}

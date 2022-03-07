//write 3 different mathods each takes int, float, long numbers as input and returns its multiplication value
public class MultiplicationByMethods {

	public static void main(String[] args) {
		multiplyInt (7,9);
		multiplyDouble(555.88,987.055565);
		multiplyFloat (9.5f,6.5f);
	}
	
	public static int multiplyInt (int a, int b) {
		
		int product = a*b;
	System.out.println(product);
	return product;
	}
	
	public static float multiplyFloat (float a, float b) {
		
		float product = a*b;
		System.out.println(product);
		return product;
	}
	
	public static double multiplyDouble (double a, double b) {
		
		double product = a*b;
		System.out.println(product);
		return product;
	}

}

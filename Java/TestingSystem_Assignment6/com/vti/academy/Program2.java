
public class Program2 {
	public static void main(String[] args) {
		try {
			float result = divide(7, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide 0");
		}
	}
	
	// question 1
	public static float divide(int a, int b) { 
		return a / b;
	}
}

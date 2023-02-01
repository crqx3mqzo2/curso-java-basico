
public class MainMathOperations {
	
	public static void main(String[] arg) {
		short a = 1, b = 5;
		int c = multiply(a, b);
		int d = add(a, b);
		int f = sub(b, a);
		System.out.println("Suma: " + d);
		System.out.println("Resta: " + f);
		System.out.println("multiplicación: " + c);

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multiply(short a, short b) {
		return a * b;
	}

}

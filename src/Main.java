
public class Main {

	public static void main(String[] arg) {
//		short a = 1, b = 5;
//		int c = multiply(a, b);
//		System.out.println("multiplicación: " + c);

		immutability();
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

	// inmutability y garbage collector
	public static String immutability() {
		String a = "hola cursero ";
		String b = "Carlos ";
		a = a + b;
		System.out.println(a);
		return a;
	}

}

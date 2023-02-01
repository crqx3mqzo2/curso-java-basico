public class Sumar {
	public static void main(String... args) {
		
		String[] argss = {"2","4"};
		int sum = 0;
		// invoquemos la función 
		sum = suma(Integer.parseInt(argss[0]), Integer.parseInt(argss[1]));
		System.out.println(sum);
	}
	
	public static int suma(int a, int b) {
		return a+b;
	}
	
}
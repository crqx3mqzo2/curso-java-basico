
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
		String b = "hola de nuevo ";
		a = b; // a y b tiene la misma referencia de memoria
		// en este momento queda la posición de memoria que tenía a sin referencia
		// System.out.println(a);

		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		System.out.println(persona1);
		System.out.println(persona2);
		persona1.setNombre("Luis");
		persona1.setEdad(32);
		persona1.setSexo('M');

		persona1.setNombre("Carlos");
		persona1.setEdad(35);
		persona1.setSexo('M');

		persona2 = persona1;

		System.out.println(persona1);
		System.out.println(persona2);

		return a;
	}

}

class Persona {

	private String nombre;
	private int edad;
	private char sexo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}

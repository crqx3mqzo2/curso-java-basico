public class Students {
	public static void main(String args[]) {
		//llamaremos en método
		studentAge();
		//age = 30; // no se pueden invocar variables locales de otroa parte diferente al método
	}
	
	public static void studentAge() {
		// Ejemplos de variables locales
		int age = 0;
		float heigth = 1.7f;
		//le damos un valor nuevo a la variable
		age = age +25;
		System.out.println("La edad del estudiante es " + age + " y mide " + heigth);
	}
}
public class Constantes {
	public static void main(String[] args) {
		//variables
		//float altura = 1.7f;
		
		//constantes
		final byte EDAD1 =30;  //DECIMAL
		final byte EDAD2 =036; //OCTAL
		final byte EDAD3 =0X1E;  //HEX
		
		System.out.println(EDAD1);
		System.out.println(EDAD2);
		System.out.println(EDAD3);
		
		//reales: double, float
		final float altura = (float)1.7;
		System.out.println("casting de double a float: " + altura);
		
	}
}

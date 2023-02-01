public class TypesOfdata { // DEFINICIÓN DE CLASE
	//CONSTANTES
	private final static byte PORCENTAJE = 20; //correcto
	final static String MENSAJE_PESO_PROMEDIO = "Se encuentra en el peso promedio";

	//CONSTANTES DE TIPO PRIMITIVO
	final static byte EDAD = 30;
	final static short SALARIO = 10000;
	final static int SALARIO_ANUAL = 120000;
	final static long METROS_DISTANCIA = 3425783742l;
	final static boolean VALIDO = true;
	final static boolean NO_VALIDO = false;
	final static char NEGACION = 'N';
	final static char NAFIRMACION = 'S';
	final static char SISTEMA_OPERATIVO_WINDOWS = 'W';
	
	//VARIABLES DE TIPO PRIMITIVO
	static byte var_edad = 22;
	short var_salario = 3000;
	
	public static void main(String args[]) {
		//arranque
		final byte PORCENTAJE = 25; //correcto
		System.out.println("El valor de la constante es: " + PORCENTAJE);
		
		otraPruebaProcentaje();
	}
	
	public static void otraPruebaProcentaje() {
		if(PORCENTAJE==20) System.out.println("El valor de la constante es igual a: "+PORCENTAJE);
	}
	
	
}


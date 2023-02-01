public class Employees {
	public static void main(String args[]) {
		// acceder a variables de tipo campos
		EmployeesVariables.salario = 5000;
		//EmployeesVariables.nombre // no se debe hacer, no es correcto
		
		// instanciasr clase
		EmployeesVariables empl1 = new EmployeesVariables(); // creamos un objeto
		empl1.nombre = "alfonso";
		System.out.println("El emplado " + empl1.nombre + ", tiene un salario de " 
		+ EmployeesVariables.salario);
		
		// instanciamos otra vez la clase
		EmployeesVariables empl2 = new EmployeesVariables(); // creamos un objeto
		empl2.nombre = "Juan";
		System.out.println("El emplado " + empl2.nombre + ", tiene un salario de " 
		+ empl2.nombre);
		
		
	}
	
}

class EmployeesVariables {
	// variable estaticas
	public static float salario = 4000;
	// variable no estaticas
	public String nombre;	
}
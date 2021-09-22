package Laboral;

public class CalculaNominas {
	public static void main(String[] args) {
		Empleado emp1 = null;
		try {
			emp1 = new Empleado("James Cosling", "32000032G", "M", 4, 7);			
		}
		catch(DatosNoCorrectosException dnce) {
			System.out.println(dnce.getMessage());
			System.exit(1);
		}
		Empleado emp2 = new Empleado("Ada Lovelace", "32000031R", "F");
		Nomina nom = new Nomina();
		escribe(emp1, nom);
		escribe(emp2, nom);
		emp2.incrAnyo();
		try {
			emp1.setCategoria(9);
		} catch (DatosNoCorrectosException dnce) {
			System.out.println(dnce.getMessage());
			System.exit(1);
		}

		escribe(emp1, nom);
		escribe(emp2, nom);
	}

	private static void escribe(Empleado emp, Nomina nom) {
		System.out.print("Sueldo: " + nom.sueldo(emp) + ", ");
		emp.imprime();
	}
}

import java.util.Scanner;

class Persona {
	String nombre;
	int edad;
	
		public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
}

public class ProgramaPersona {
	public static void ejecutar() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa tu nombre ");
		String Name = scanner.nextLine();
		System.out.println("Ingresa tu edad: ");
		int Edad = scanner.nextInt();

		Persona p = new Persona(Name, Edad);
		p.mostrarInfo();
	}
}
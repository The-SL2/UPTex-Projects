import java.util.Scanner;

public class RegistroEstudiantes {
	public static void ejecutar() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa su nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingresa su promedio: ");
		double promedio = scanner.nextDouble();
		
		Registro numEv = new Registro(promedio, nombre);
		numEv.mostrarInfo();
	}
}

class Registro {
	private double promedio;
	private String nombre;

	public Registro(double promedio, String nombre) {
		this.promedio = promedio;
		this.nombre = nombre;
	}

	public void mostrarInfo() {
		if (promedio >= 7) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Estado: Aprobado");
		} else {
			System.out.println("Nombre: " + nombre);
			System.out.println("Estado: Reprobado");
		}
	}
}

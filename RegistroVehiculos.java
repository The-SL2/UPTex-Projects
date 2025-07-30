import java.util.Scanner;

public class RegistroVehiculos {
	public static void ejecutar() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa la marca de su vehículo: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese el modelo del vehículo: ");
		int anio = scanner.nextInt();
		
		Vehiculo Nvehiculo = new Vehiculo(nombre, anio);
		Nvehiculo.mostrarInfo();
	}
}

class Vehiculo {
	private int anio;
	private String nombre;

	public Vehiculo(String nombre, int anio) {
		this.nombre = nombre;
		this.anio = anio;
	}

	public void mostrarInfo() {
		if (anio >= 1995) {
			System.out.println("Marca del vehículo: " + nombre);
			System.out.println("Modelo: " + anio);
			System.out.println("Puede circular con este vehículo.");
		} else {
			System.out.println("Marca del vehículo: " + nombre);
			System.out.println("Modelo: " + anio);
			System.out.println("Ya no puede circular con este vehículo.");

		}
	}
}
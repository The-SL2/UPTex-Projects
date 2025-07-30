import java.util.Scanner;

public class RegistroProductos {
	public static void ejecutar() {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("=== MENU CHISTOSO === ");
		System.out.println("1. Coca ");
		System.out.println("2. Sabritas ");
		System.out.println("3. Chokis");
		System.out.println("");
		System.out.println("Seleccione una opción");
		int opcion = scanner.nextInt();
		
		Producto Prod = new Producto(opcion);
		Prod.revisar();
	}
}

class Producto {
	private int opcion;

	public Producto(int opcion) {
		this.opcion = opcion;
	}

	public void revisar() {

		if(opcion == 1){
			System.out.println("Seleccionaste Coca");
			System.out.println("Tiene 10 unidades en stock");
		}

		else if(opcion == 2){
			System.out.println("Seleccionaste Sabritas");
			System.out.println("Sin unidades en stock");
		}

		else if(opcion == 3){
			System.out.println("Seleccionaste Chokis");
			System.out.println("Tiene 6 unidades en stock");
		}



	}
}
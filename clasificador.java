import java.util.Scanner;

public class clasificador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa tu número: ");
		int numero = scanner.nextInt();

		Evaluacion numEv = new Evaluacion(numero);
		numEv.mostrarInfo();
	}
}

class Evaluacion {
	private int numero;

	public Evaluacion(int numero) {
		this.numero = numero;
	}

	public void mostrarInfo() {
		if (numero < 0) {
			System.out.println("El número es negativo");
		} else if (numero > 0) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("El número es cero");
		}
	}
}

import java.util.Scanner;

class Rectangulo {
double base;
double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return base * altura;
	}

	public double calcularPerimetro() {
	return 2 * (base + altura);
	}
}

public class ProgramaRectangulo {
	public static void ejecutar() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa la base de tu triángulo ");
		int Base = scanner.nextInt();
		System.out.println("Ingresa la altura de tu triángulo: ");
		int Altura = scanner.nextInt();

		Rectangulo rect = new Rectangulo(Base, Altura);
		System.out.println("Área: " + rect.calcularArea());
		System.out.println("Perímetro: " + rect.calcularPerimetro());
	}
}
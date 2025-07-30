import java.util.Scanner;

public class clasecalculadora1 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese su valor 2: ");
        int valor2 = scanner.nextInt();

        calculadora calc = new calculadora();
        System.out.println("Suma: " + calc.sumar(valor1, valor2));
        System.out.println("Resta: " + calc.restar(valor1, valor2));
        System.out.println("Multiplicación: " + calc.multiplicar(valor1, valor2));
        System.out.println("División: " + calc.dividir(valor1, valor2));
    }
}

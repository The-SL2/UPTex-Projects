import java.util.Scanner;

public class RestaBasica {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        int resta = numero1 - numero2;
        System.out.println("La resta es: " + resta);

    }
}



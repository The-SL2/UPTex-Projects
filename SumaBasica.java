import java.util.Scanner;

public class SumaBasica {
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);

    }
}

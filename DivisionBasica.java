import java.util.Scanner;
public class DivisionBasica {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        float numero1 = scanner.nextFloat();

        System.out.println("Ingresa el segundo número: ");
        float numero2 = scanner.nextFloat();

        if (numero2 == 0) {
            System.out.println("No puede dividir entre 0");
        }

        else {
            float division = numero1 / numero2;
            System.out.println("La division es: " + division);
        }
    }

}

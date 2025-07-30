import java.util.Scanner;

public class DibujarTrianguloAsteriscosFOR {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de su triángulo: ");
        
        int num = scanner.nextInt();
        String asterisco = "*";

        for (int i = 1; i <= num; i++) {
            System.out.println(asterisco);
            asterisco += "*";
        }
    }
}

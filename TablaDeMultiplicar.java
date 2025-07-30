import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu numero: ");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int j = i * numero;
        System.out.println(i + " * " + numero + " = " + j);
        }
    }
}

import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu número: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("El número es positivo.");
        }
        else{
            if (numero == 0) {
                System.out.println("El número es cero.");
            }
            else {
                System.out.println("El número es negativo");
            }
        }
    }

}

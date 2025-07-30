import java.util.Scanner;

public class NumeroParImpar {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu número");
        int numero = scanner.nextInt();

        int residuo = numero % 2;

        if (residuo ==0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
}

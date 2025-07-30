import java.util.Scanner;

public class NumeroSecretoFORIF {
     public static void ejecutar() {
        int secreto = 25;
        int intentos = 5;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Intentos restantes: " + intentos);
            intentos--;
            
            if (intentos >= 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingresa tu número: ");
                int numero = scanner.nextInt();

                if (numero < secreto){
                    System.out.println("Pista: El número es mayor.");
                    System.out.println("");

                }

                else {
                    if (numero > secreto) {
                        System.out.println("Pista: El número es menor.");
                        System.out.println("");
                    }

                    else{
                        System.out.println("¡Adivinaste!");
                        break;
                    }           
                }
            }

            else {
                System.out.println("Has perdido.");
            }
        }
   }
}

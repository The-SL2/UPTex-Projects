import java.util.Scanner;

public class ContarParesImpares {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su número máximo: ");
        
        int numero = scanner.nextInt();
        int impares = 0;
        int pares = 0;
        
        for (int i = 1; i <= numero; i++) {
            int residuo = i % 2;
            
            if (residuo == 0) {
                pares += 1;
            }
            
            else{
            impares += 1;
            }
        }
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}

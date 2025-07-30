import java.util.Scanner;

public class SumaNumerosNaturales {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu número: ");
        
        int num = scanner.nextInt();
        int j = 1;
        
        for (int i = 1; i <= num; i++) {
            j += i;
            System.out.println(j);
        }
    }
}

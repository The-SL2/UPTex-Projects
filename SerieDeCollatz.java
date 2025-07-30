import java.util.Scanner;

public class SerieDeCollatz {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su numero máximo: "); 
        int numero  = scanner.nextInt();
        
        for (int i = 0; numero  != 1; i++) {
            System.out.println(numero + " ");
            if((numero % 2) == 0){ 
                numero = numero  / 2;
            }
            else{
                numero = 3 * numero + 1;
            }
        }
        System.out.println(1);
    }
}

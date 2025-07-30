import java.util.Scanner;

public class TrianguloDePascal {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();

        if (filas>0) {
            for(int i = 0; i < filas; i++){
                int valor = 1; 

                for (int j = 0; j <= i; j++) { 
                    System.out.print(valor + " "); 
                    valor = valor * (i-j) / (j+1);
                }
                System.out.println();
            }
        } 
        else {
            System.out.println("El número debe ser mayor a 0.");
            
        }
        
    }
}

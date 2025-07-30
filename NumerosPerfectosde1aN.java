import java.util.Scanner;

public class NumerosPerfectosde1aN {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su número máximo: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
                int suma = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0){
                        suma += j; 
                    }
                }

            if (suma == i){
                System.out.println(i + " es un numero perfecto.");
            }
            else{
            }

        }
    }

}

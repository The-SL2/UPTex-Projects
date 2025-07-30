import java.util.Scanner;

public class NumerosPrimosGemelos {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número máximo: ");
        int numero = scanner.nextInt();

        if (numero > 3) { 
            for (int i = 2; i < numero - 1; i++) {
                int valor1 = 1;

                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        valor1 = 0;
                        break;
                    }
                }

                if (valor1 == 1) {
                    int primo2 = i + 2;
                    if (primo2 <= numero) {
                        int valor2 = 1;

                        for (int k = 2; k * k <= primo2; k++) {
                            if (primo2 % k == 0) {
                                valor2 = 0;
                                break;
                            }
                        }

                        if (valor2 == 1) {
                            System.out.println("Par gemelo: " + i + " y " + primo2);
                        }
                    }
                }
            }
        } else {
            System.out.println("No tiene pares de primos gemelos.");
        }
    }
}

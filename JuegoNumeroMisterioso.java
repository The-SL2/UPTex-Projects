import java.util.Scanner;

public class JuegoNumeroMisterioso {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int secreto = 59; 
        int intento = 7;
 
        System.out.println("Adivina el número secreto (entre 1 y 100):");

        while (intento >= 0 ) {
	    intento--;
            System.out.println("intento numero: " + (intento + 1));
            int numero = scanner.nextInt();
 
            if (numero == secreto){
                System.out.println("lo adivinaste");
                break;
            }
        
            if ((numero <= 69) & (numero >= 60)) {
                System.out.println("Estas cerca");
            }
            if ((numero <= 58) & (numero >= 49)) {
                System.out.println("Estas cerca");
            }
        
            if (secreto > numero ){
                System.out.println("el numero es mayor al secreto");
            }
        
            if (secreto < numero ) {
                System.out.println("el numero es menor al secreto");
            }
        }
        
        System.out.println("El número secreto era " + secreto);
    }
}

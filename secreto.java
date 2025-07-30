import java.util.Scanner; 
public class secreto {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		int secreto = (int)(Math.random() * 101);
		int numero; 
		do { 
			System.out.println(secreto); 
			System.out.print("Intenta adivinar un número secreto entre 0 y 100: "); 
			numero = scanner.nextInt(); 
			
			if (numero < secreto){
                		System.out.println("Pista: El número es mayor.");
                		System.out.println("");
                	}

                        if (numero > secreto) {
                            System.out.println("Pista: El número es menor.");
                            System.out.println("");
                        } 
			
		} while (numero != secreto); 
		System.out.println("¡Felicidades, lo has adivinado!");
		}
	}
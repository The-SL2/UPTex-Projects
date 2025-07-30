import java.util.Scanner; 
public class promedio { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		int numero; 
		int suma = 0;
		int contador = 0;
		do { 
			System.out.print("Captura tus calificaciones en una escala de 1 a 10: "); 
			numero = scanner.nextInt(); 
			
			if ((numero >= 0) & (numero <= 10)){
				suma += numero;
				contador++;
				continue;
			}

			else {
			System.out.print("Número no valido ");
			}

		} while (numero >= 0); 
		
		int promedio = suma / contador;
		
		System.out.println("Tu promedio es de " + promedio);
		}
	}
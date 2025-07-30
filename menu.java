import java.util.Scanner;

public class menu {		
	public static void main(String[] args) {
		float valor1 = 0;
		float valor2 = 0;
		int opcion = 0;

		do{
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== MENU CHISTOSO === ");
		System.out.println("1. Suma ");
		System.out.println("2. Resta ");
		System.out.println("3. Multiplicación ");
		System.out.println("4. División ");
		System.out.println("5. Salir");
		System.out.println("");
		System.out.println("Seleccione una opción");
		opcion = scanner.nextInt();
		
		if(opcion == 1){
			System.out.println("Seleccionaste suma. ");
			System.out.println("Ingrese su valor 1: ");
			valor1 = scanner.nextInt();
			System.out.println("Ingrese su valor 2: ");
			valor2 = scanner.nextInt();
			
			float suma = valor1 + valor2;
			System.out.println("Resultado: " + suma);

		}

		if(opcion == 2){
			System.out.println("Seleccionaste resta");
			System.out.println("Ingrese su valor 1: ");
			valor1 = scanner.nextInt();
			System.out.println("Ingrese su valor 2: ");
			valor2 = scanner.nextInt();
			
			float resta = valor1 - valor2;
			System.out.println("Resultado: " + resta);

		}

		if(opcion == 3){
			System.out.println("Seleccionaste muliplicación");
			System.out.println("Ingrese su valor 1: ");
			valor1 = scanner.nextInt();
			System.out.println("Ingrese su valor 2: ");
			valor2 = scanner.nextInt();
			
			float multiplicacion = valor1 * valor2;
			System.out.println("Resultado: " + multiplicacion);

		}

		if(opcion == 4){
			System.out.println("Seleccionaste division");
			System.out.println("Ingrese su valor 1: ");
			valor1 = scanner.nextInt();
			System.out.println("Ingrese su valor 2 diferente a 0: ");
			valor2 = scanner.nextInt();
			
			if (valor2 == 0) {
            			System.out.println("No puede dividir entre 0");
        		}

        		else {
      				float division = valor1 / valor2;
				System.out.println("Resultado: " + division);
			}
		}

		}while(opcion != 5);
	
		System.out.println("Vuelve pronto");

    }
}

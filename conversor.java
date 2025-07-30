import java.util.Scanner; 
public class conversor { 
	public static void ejecutar() { 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Conversor de grados Celsius a Farenheit "); 

		double numero; 
		do { 
			System.out.println("Introduce la temperatura en grados Celsius. Presione 0 para salir"); 
			numero = scanner.nextInt(); 
			if(numero == 0){
				break;
			}

			double farenheit = (numero * 1.8) + 32;
			System.out.println(numero + "°C   ==>   " + farenheit + "°F");
		} while (numero != 0); 
		System.out.println("Vuelva pronto");
	}
}
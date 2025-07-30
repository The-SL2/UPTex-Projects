import java.util.Scanner; 
public class contrasena { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		String contrasena; 
		do { 
			System.out.print("Introduce una contrasena segura: "); 
			contrasena = scanner.nextLine(); 
			
			if (!contrasena.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}")) {
                		System.out.println("Contraseña inválida. Debe tener al menos 8 caracteres, una mayúscula, una minúscula y un número.");
           		}

		} while (!contrasena.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}")); 

		System.out.println("Contraseña generada correctamente");
		}
	}
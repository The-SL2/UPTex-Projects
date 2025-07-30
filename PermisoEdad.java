import java.util.Scanner;

public class PermisoEdad {
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad>= 18){
            System.out.println("Puedes ingresar a la fiesta.");
        }
        else{
            if ((edad >= 16)){
                System.out.println("Puedes entrar con permiso.");
            }
            else{
                System.out.println("Eres menor de edad, no puedes ingresar.");
            }
            
        }
    }
}

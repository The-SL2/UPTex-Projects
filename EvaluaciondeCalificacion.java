import java.util.Scanner;

public class EvaluaciondeCalificacion {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu calificación en una escala de 0 a 100: ");
        int calificacion = scanner.nextInt();

        if ((calificacion <= 100) & (calificacion >=60 )) {
            System.out.println("Haz aprobado.");
        }
        else if ((calificacion <= 59) & (calificacion >= 0 )) {
            System.out.println("Haz reprobado");
        } 
        else{
            System.out.println("Ingresa un número entre el 0 y el 100");
        }
    }
}

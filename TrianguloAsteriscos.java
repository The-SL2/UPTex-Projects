public class TrianguloAsteriscos {
    public static void ejecutar() {
        int filas = 5;

        for (int i = 1; i <= filas; i++) {  
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
	    }
            System.out.println();
        }
    }
}

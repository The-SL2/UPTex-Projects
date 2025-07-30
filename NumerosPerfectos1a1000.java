public class NumerosPerfectos1a1000 {
        public static void ejecutar() {
            for (int i = 1; i <= 1000; i++) {
                int suma = 0;
                
                for (int j = 1; j < i; j++) {
                    if (i % j == 0){
                    suma += j;
                    }
                }

            if (suma == i){
                System.out.print(i + " es un numero perfecto.");
            }
            else{
            }
        }
    }
}

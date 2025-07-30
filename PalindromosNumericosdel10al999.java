public class PalindromosNumericosdel10al999 {
    public static void ejecutar() {
        for(int i = 10; i <= 999; i++){
            int k = i;
            int j = 0;

        for(j = 0; k > 0; k = k/10) {
            int anterior = k % 10;
            j = j * 10 + anterior;
            } 
 
            if(i == j) {
                System.out.println(i);
            }
        }
    }
}


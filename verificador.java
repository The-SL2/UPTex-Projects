
import java.util.Scanner;

public class verificador {
   public static void ejecutar() {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Ingrese el número donde quiere iniciar: ");
      int var2 = var1.nextInt();
      System.out.println("Ingrese el número hasta donde quiere parar: ");

      for(int var3 = var1.nextInt(); var2 <= var3; ++var2) {
         int var4 = var2;
         boolean var5 = false;

         int var7;
         for(var7 = 0; var4 > 0; var4 /= 10) {
            int var6 = var4 % 10;
            var7 = var7 * 10 + var6;
         }

         if (var2 == var7) {
            System.out.println(var2);
         }
      }

   }
}
public class ControlDeAcceso {
    public static void ejecutar() {
        int edad = 17;
        boolean tienePermiso = false;

        if ((edad >= 18) || (tienePermiso = true)) {  
            System.out.println("Acceso permitido");
        } 
	else{
            System.out.println("Acceso denegado");
        }

        for (int i = 0; i <= 10; i++){  //
            if(i % 2 == 0) {
                System.out.println(i + " es par");
	    }
            else{
                System.out.println(i + " es impar");
	    }
	}
    }
}


public class ControlAccesoMain {
    public static void ejecutar(){
        ControlAcceso acceso1 = ControlAcceso.getInstancia();
        acceso1.iniciarSesion("Carnal Pulpo");
        //La instancia espera un argumento de tipo String de nombre "usuario"
        ControlAcceso acceso2 = ControlAcceso.getInstancia();
        acceso2.mostrarUsuarioActivo();
        //Esta instancia no espera un argumento porque la clase
        //toma el nombre ingresado en la anterior instancia y su 
        //función es meramente de impresión
        System.out.println("¿Es la misma instancia? " + (acceso1 == acceso2));
        //Verifica que los argumentos sean iguales y regresa un valor booleano
    }
}

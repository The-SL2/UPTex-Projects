public class ContadorGlobalMain {
    public static void ejecutar() {
    ContadorGlobal c1 = ContadorGlobal.getInstancia(); 
    c1.incrementar();
    c1.incrementar();
    ContadorGlobal c2 = ContadorGlobal.getInstancia(); 
    c2.incrementar();

    //Arriba de este comentario, se instancia el método incrementar para, pues,
    //aumentar por 1 al contador. A pesar de que son dos "etiquetas" diferentes (c1 y c2)
    //en realidad el contador es el mismo para todos

    c1.mostrarContador(); // Debe mostrar 3 c2.mostrarContador(); // También debe mostrar 3

    System.out.println("¿Es la misma instancia? " + (c1 == c2));
    //Verifica que los argumentos sean iguales y regresa un valor booleano
    }
}

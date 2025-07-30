public class ContadorGlobal {
    private static ContadorGlobal instancia; 
    private int contador;
    //Declaración de variables

    private ContadorGlobal() { 
        contador = 0;
        //Inicia el contador
    }

    public static ContadorGlobal getInstancia() { 
        if (instancia == null) {
            instancia = new ContadorGlobal();
        }
        return instancia;
        //Si hay un espacio en instancia que espera un dato o valor (null)...
        //Genera una nueva instancia
    }
    
    public void incrementar() { 
        contador++;
        //Suma 1 a la variable contador
    }

    public void mostrarContador() { 
        System.out.println("Contador: " + contador);
        //Muestra el contador 
        }
    }


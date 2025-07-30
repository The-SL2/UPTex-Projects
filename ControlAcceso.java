
public class ControlAcceso {
    private static ControlAcceso instancia;
    private String usuarioActivo; 
    //Declaración de las variables
    private ControlAcceso() {
        this.usuarioActivo = "ninguno";
        //"Activa" la variable de la clase, por así decirlo
    }
 
    public static ControlAcceso getInstancia() {
        if (instancia == null) {
        instancia = new ControlAcceso();
        }
        return instancia;
        //Si hay un espacio en instancia que espera un dato o valor (null)...
        //Genera una nueva instancia
    }
 
    public void iniciarSesion(String usuario) {
        this.usuarioActivo = usuario;
        //Asigna el nombre insertado como el usuario activo
        System.out.println("Sesión iniciada por: " + usuario);
        //xtrae e imprime quién ha iniciado sesión respecto
        }
    
    public void mostrarUsuarioActivo() {
        System.out.println("Usuario actual: " + usuarioActivo);
        //Este método muestra el elemento reemplazado en usuarioActivo
        }
    }



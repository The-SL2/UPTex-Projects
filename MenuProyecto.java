import java.util.Scanner;

public class MenuProyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 1000;

        do {
            System.out.println("=== MENÚ CHISTOSO ===");
            System.out.println("0. Salir");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma Básica");
            System.out.println("3. Resta Básica");
            System.out.println("4. Division Básica");
            System.out.println("5. Multiplicación Básica");

            //IF
            System.out.println("6. Verificar si un número es positivo o negativo");
            System.out.println("7. Evaluar la calificación de un estudiante");
            System.out.println("8. Verificar si un número es par o impar");
            System.out.println("9. Verificar si una persona es mayor o menor de edad");

            //BUCLE FOR
            System.out.println("10. Tabla de Multiplicar");
            System.out.println("11. Suma de los primeros números naturales");
            System.out.println("12. Contar números pares e impares");
            System.out.println("13. Dibujar Triángulo con Asteriscos BUCLE FOR");
            System.out.println("14. Numeros primos del 1 al 100");

            //FOR IF Avanzado
            System.out.println("15. Numeros Perfectos del 1 al 1000");
            System.out.println("16. Palíndromos numéricos entre 10 y 999");
            System.out.println("17. Piramide Numérica");
            System.out.println("18. Adivinar número secreto con intentos limitados");
            System.out.println("19. Suma de dígitos de números del 100 al 110");

            //FOR IF 2 + Scanner
            System.out.println("20. Numeros Perfectos hasta N");
            System.out.println("21. Triangulo de Pascal");
            System.out.println("22. Numeros Primos Gemelos");
            System.out.println("23. Serie de Collatz");
            System.out.println("24. Numeros Primos del 1 al 100 con FOR");

            //IF, FOR, WHILE Avanzado
            System.out.println("25. Verificador de Numeros Capicúa dentro de un rango");
            System.out.println("26. Juego de Número Misterioso con Vidas y Pistas");

            //DO WHILE
            System.out.println("27. Validador de contraseña segura");
            System.out.println("28. Calculadora de promedio de calificaciones");
            System.out.println("29. Juego de adivinanza (Numero Secreto)");
            System.out.println("30. Conversor de Temperaturas interactivo");

            //Menu Interactivo 
            System.out.println("31. Menú interactivo con operaciones matemáticas");
            
            //Correción de Código IF y FOR
            System.out.println("32. Control de Acceso");
            System.out.println("33. Contador de Números -, +, 0");
            System.out.println("34. Calcular el promedio de tus materias aprobadas");
            System.out.println("35. Imprimir un triángulo de Asteriscos");

            //Clases
            System.out.println("36. Ejecutar Calculadora Múltiple");
            System.out.println("37. Impresión de la información de una persona");
            System.out.println("38. Depositar y retirar de una cuenta bancaria");
            System.out.println("39. Area y Perímetro de un Rectángulo");

            //Clases 2
            System.out.println("40. Clasificador de números");
            System.out.println("41. Registro de estudiantes");
            System.out.println("42. Registro de Productos en una Tienda");
            System.out.println("43. Registro de Vehículos");
            
            //Singleton
            System.out.println("44. Control de Acceso al sistema");
            System.out.println("45. Contador Global");

            System.out.print("Seleccione una opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 0: 
                    break;
                case 1: 
                    HolaMundo.ejecutar();
                    break;
                case 2: 
                    SumaBasica.ejecutar();
                    break;
                case 3: 
                    RestaBasica.ejecutar();
                    break;
                case 4: 
                    DivisionBasica.ejecutar();
                    break; 
                case 5: 
                    MultiplicacionBasica.ejecutar();
                    break;

                case 6: 
                    NumeroPositivoNegativo.ejecutar();
                    break;
                case 7: 
                    EvaluaciondeCalificacion.ejecutar();
                    break;
                case 8: 
                    NumeroParImpar.ejecutar();
                    break;
                case 9: 
                    PermisoEdad.ejecutar();
                    break;  

                case 10: 
                    TablaDeMultiplicar.ejecutar();
                    break;
                case 11: 
                    SumaNumerosNaturales.ejecutar();
                    break; 
                case 12: 
                    ContarParesImpares.ejecutar();
                    break; 
                case 13: 
                    DibujarTrianguloAsteriscosFOR.ejecutar();
                    break; 
                case 14: 
                    NumeroPrimo1a100FOR.ejecutar();
                    break; 

                case 15: 
                    NumerosPerfectos1a1000.ejecutar();
                    break;
                case 16: 
                    PalindromosNumericosdel10al999.ejecutar();
                    break; 
                case 17: 
                    PiramideNumerica.ejecutar();
                    break; 
                case 18: 
                    NumeroSecretoFORIF.ejecutar();
                    break; 
                case 19: 
                    NumeroPrimo1a100FOR.ejecutar();
                    break;

                case 20: 
                    NumerosPerfectosde1aN.ejecutar();
                    break;
                case 21: 
                    TrianguloDePascal.ejecutar();
                    break; 
                case 22: 
                    NumerosPrimosGemelos.ejecutar();
                    break; 
                case 23: 
                    SerieDeCollatz.ejecutar();
                    break; 
                case 24: 
                    NumeroPrimo1a100FOR.ejecutar();
                    break;

                case 25: 
                    VerificadorNumerosCapicua.ejecutar();
                    break;
                case 26: 
                    JuegoNumeroMisterioso.ejecutar();
                    break;

                case 27: 
                    ValidadorContraseñaSegura.ejecutar();
                    break;
                case 28: 
                    CalculadoraPromedioCalificaciones.ejecutar();
                    break; 
                case 29: 
                    JuegoAdivinanza.ejecutar();
                    break; 
                case 30: 
                    ConversorTemperaturaInteractivo.ejecutar();
                    break; 

                case 31: 
                    MenuInteractivoOperaciones.ejecutar();
                    break;

                case 32: 
                    ControlDeAcceso.ejecutar();
                    break;
                case 33: 
                    ContadorNumeros.ejecutar();
                    break;
                case 34: 
                    PromedioAprobados.ejecutar();
                    break;
                case 35: 
                    TrianguloAsteriscos.ejecutar();
                    break;

                case 36: 
                    clasecalculadora1.ejecutar();
                    break; 
                case 37: 
                    ProgramaPersona.ejecutar();
                    break; 
                case 38: 
                    ProgramaCuenta.ejecutar();
                    break; 
                case 39: 
                    ProgramaRectangulo.ejecutar();
                    break; 

                case 40: 
                    ClasificadorNumeros.ejecutar();
                    break; 
                case 41: 
                    RegistroEstudiantes.ejecutar();
                    break; 
                case 42: 
                    RegistroProductos.ejecutar();
                    break; 
                case 43: 
                    RegistroVehiculos.ejecutar();
                    break; 

                case 44: 
                    ControlAccesoMain.ejecutar();
                    break; 
                case 45: 
                    ContadorGlobalMain.ejecutar();
                    break;
                default: 
                    System.out.println("Opción inválida. Intente de nuevo.");
        }
        } while (opcion !=0);
        
        System.out.println("Saliendo del programa");
    }
}

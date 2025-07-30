class Calculadora {
// Método para sumar dos números enteros
public int sumar(int a, int b) {
return a + b;
}
// Método para restar dos números enteros
public int restar(int a, int b) {
return a - b;
}
// Método para multiplicar dos números enteros
public int multiplicar(int a, int b) {
return a * b;
}
// Método para dividir dos números enteros con control de división por cero
public double dividir(int a, int b) {
if (b == 0) {
System.out.println("Error: División por cero no permitida.");
return 0;
}
return (double) a / b;
}
}
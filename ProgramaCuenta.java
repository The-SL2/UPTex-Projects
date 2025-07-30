import java.util.Scanner;

class CuentaBancaria {
	private double saldo; 

	public CuentaBancaria(double saldoInicial) { 
		saldo = saldoInicial;
	}

	public void depositar(double cantidad) { 
		saldo += cantidad;
	}

	public void retirar(double cantidad) { 
		if (cantidad <= saldo) {
		saldo -= cantidad;
	} 
		else {
		System.out.println("Saldo insuficiente para retirar.");
		}
}

	public void mostrarSaldo() {
	System.out.println("Saldo actual: $" + saldo);
	}
}

public class ProgramaCuenta {
	public static void ejecutar() {
		Scanner scanner = new Scanner(System.in);

		CuentaBancaria cuenta = new CuentaBancaria(1000);

		int depo = 0;
		int ret = 0;
		int opcion = 10;
		System.out.println("=== MAQUINA PARA DEPOSITAR A TU CUENTA === ");
		cuenta.mostrarSaldo();
	
		System.out.println("¿Qué desea hacer?");
		System.out.println("1. Depositar");
		System.out.println("2. Retirar");
		System.out.println("0. *No hace nada*");

		opcion = scanner.nextInt();

		if(opcion == 1){
			System.out.println("¿Cuánto desea depositar? ");
			depo = scanner.nextInt();
			cuenta.depositar(depo);
			cuenta.mostrarSaldo();
		}

		else if(opcion == 2){
			System.out.println("¿Cuánto desea retirar? ");
			ret = scanner.nextInt();
			cuenta.retirar(ret);
			cuenta.mostrarSaldo();

		}

	}
}

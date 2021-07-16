package escribetunombre;

import java.util.Scanner;

public class TuNombre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Por favor, escriba su nombre por teclado:");
		Scanner entradaEscaner = new Scanner(System.in);
		String entradaTeclado = entradaEscaner.nextLine();
		System.out.println("Su nombre es" + entradaTeclado);
	}

}

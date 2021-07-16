package tabla;

import java.util.Scanner;

public class Ejercicio4 {

	public static void hola1() {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecucion del programa terminara cuando los numeros ingresados sean 
		 * iguales
		 * 
		 * Nota:utilizar el ciclo while
		 * 
		 */
		 
	Scanner numero = new Scanner (System.in);
	float a = 1;
	float b = 2;
	
	while(a !=b) {
		System.out.println("inicio de programa");
		System.out.println("ingrese el primer número");
		a = numero.nextFloat();
		System.out.println("ingrese el segundo numero");
		b = numero.nextFloat();
	}
	System.out.println("Fin del programa");	
		
	}

}

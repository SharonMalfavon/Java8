import java.util.Scanner;

public class Ejercicio2Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Crear un programa donde se introduzcan los tres ángulos internos de un
		//triángulo y se determine si el triángulo es válido o no.
		
		
		System.out.println("Introduce el primer angulo de tu triangulo");
		Scanner angulo1 = new Scanner (System.in);
		float anguloingresado1 = angulo1.nextFloat();
		
		System.out.println("Introduce el segundo angulo de tu triangulo");
		Scanner angulo2 = new Scanner (System.in);
		float anguloingresado2 = angulo2.nextFloat();
		
		System.out.println("Introduce el tercer angulo de tu triangulo");
		Scanner angulo3 = new Scanner (System.in);
		float anguloingresado3 = angulo3.nextFloat();
	
	
		float sumadeangulos = anguloingresado1 + anguloingresado2 + anguloingresado3;
	
	    if (sumadeangulos == 180) {
		  System.out.println ("La suma de los angulos internos es " + sumadeangulos + "la suma de los angulos corresponde a un triangulo");
		  
	} else {
		System.out.println ("La suma de los angulos internos es" + sumadeangulos + "la suma no corresponde a las medidas de un triangulo");
		
	        }
	   }
}



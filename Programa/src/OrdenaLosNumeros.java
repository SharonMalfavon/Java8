
public class OrdenaLosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/*
		 * Debe dise�ar un programa que reciba 3 n�meros por consola y determine cual de los 3 n�meros es el mayor.
Plus: Imprimir los n�meros ordenados de mayor a menor.
Plus: Imprimir los n�meros ordenados de menor a mayor.

		 */
		
        public static void ordenNumeros(float num1, float num2, float num3) {
        	if (num1 > num2) {
        		if(num1<num2) {
        			System.out.println("El numero mayor es: +num3");
        		}
        		else {
        			System.out.println("El numero mayor es: " +num1);
        		}
        	}
        	else {
        		if(num2<num3) {
        			System.out.println("El numero mayor es: +num2");
        		}
        		else {
        			System.out.println("El numero mayor es: " +num2);
        		}
        	}
        }
	}
	



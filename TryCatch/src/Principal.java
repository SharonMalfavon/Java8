
public class Principal {
	
	int numerador = 10;
	int Integer denominador = null;
	float division;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.println("Antes de la division");
		try {
			division = numerador / denominador;
		}catch (ArithmeticException error) {
			division = 0;
			System.out.println("Error: " + error.getMessagge());
			
		}catch (NullpointerException ex) {
			division = 0;
			System.out.println("Error: " + ex.getMessagge());
            System.out.println("Segundo catch");
			
		}finally {
			System.out.prinln("Despues de la division");
		}
		*/
		
		String frutas[] = {"Mango", "Pera", "Manzana", "Uva"};
		// foreach en Java
		for(String fruta:frutas ) {
			System.out.pprintln(fruta);
		}
	}

}

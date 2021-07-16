import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner oper= new Scanner(System.in);
	System.out.println("1-Suma");
	System.out.println("2-Resta");
	System.out.println("3-Multiplicacion");
	System.out.println("4-Division");
	System.out.println("¿que operacion desea realizar?");
	int operacion=oper.nextInt();
	
	Scanner LeerNum1= new Scanner(System.in);
	System.out.println("Ingresa el primer numero");
	int num1=LeerNum1.nextInt();
	
	Scanner LeerNum2= new Scanner(System.in);
	System.out.println("Ingresa el segundo numero");
	int num2=LeerNum2.nextInt();
	
	switch(operacion) {
	case 1:
		System.out.println("el resultado es: " + (num1 + num2));
		break;
	case 2:
		System.out.println("el resultado es: " + (num1 - num2));
		break;
	case 3:
		System.out.println("el resultado es: " + (num1 * num2));
		break;
	case 4:
		System.out.println("el resultado es: " + (num1 / num2));
		break;
	default:
		System.out.println("existe un error");
		break;

	}
	
			
	}

}

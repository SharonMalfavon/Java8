package tabla;

import java.util.Scanner;

public class CicloDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		
		    do
		    {
		    	System.out.print("intrudusca el num1: ");
		    	num1 = sc.nextInt();
		    	System.out.print("introdusca el num2");
		    	num2 = sc.nextInt();
		  
		    } while (num1 != num2);
		    
		    
	}

}

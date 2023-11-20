package ejercios_bucles_anidados;

import java.util.Scanner;
/**
 * 
 * 
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		 
		System.out.println("ingresa el primer números");
		
		n1 = entrada.nextInt();
		
        System.out.println("ingresa el segundo números");
		
		n2 = entrada.nextInt();
		
        System.out.println("ingresa el tercer números");
		
		n3 = entrada.nextInt();
		
		if ( n1 < n2 && n1 < n3 && n2 < n3) {
			
			System.out.println(" los números estan en orden creciente");
		}
		
		else if ( n1 > n2 && n1 > n3 && n2 > n3) {
			
			System.out.println(" los númeron estan en orden decreciente");
		}
		else {
			 System.out.println(" los números no estan en orden creciente n1 decreciente");
		}
		
		
		

	}

}

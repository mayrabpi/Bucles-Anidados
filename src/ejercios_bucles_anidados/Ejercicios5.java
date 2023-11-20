package ejercios_bucles_anidados;

import java.util.Scanner;

/**
 * 
 */

public class Ejercicios5 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		
		System.out.println("ingresa el primer número:");
		
		n1 = entrada.nextInt();
		
		System.out.println("ingresa el segundo número");
	
		n2 = entrada.nextInt();
		
		System.out.println("ingresa el tercer número");
		
		n3 = entrada.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("el maximo número es "+ n1);}
			
			if (n2 > n1 && n2 > n3) {
				System.out.println("el maximo número es " + n2);}
				
				if (n3 > n2 && n3 > n1) {
					System.out.println("el maximo número es " + n3);}
				
			
		}
		
		
		
		
		

	

}

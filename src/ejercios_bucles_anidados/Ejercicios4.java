package ejercios_bucles_anidados;

import java.util.Scanner;
/**
 * p
 */

public class Ejercicios4 {
	/**
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int l1;
		int l2;
		int l3;
		
		
		System.out.println("meta el numero del primer lado");
		
		l1 = entrada.nextInt();
		
		System.out.println("meta el numero del segundo lado");
		
		l2 = entrada.nextInt();
		
		System.out.println("meta el numero del tercer lado");
		
		l3 = entrada.nextInt();
		
		if (l1 == l2 && l2 == l3) {
			
			System.out.println("el tirangulo es equilatero");
			
			}
			
		else if ((l1 == l2 && l2 != l3) || (l1 == l3 && l3 != l2 ) || (l1 != l2 && l2 == l3)) {
				
			System.out.println("el triangulo es isósceles");
			
			
			
			}
			
		else {
				System.out.println("el triangulo es escaleno");
			}
			

	}

}

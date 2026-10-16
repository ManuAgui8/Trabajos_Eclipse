import java.util.Scanner;

/**
 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
que introducimos por teclado.
 */

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int aux = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número y te digo los multiplos de 3 hasta ese número");
		num = teclado.nextInt();
		
		for (int i = 3; i<= num; i += 3 ) {
			aux = aux + 1;
		}
		
		System.out.println("La cantidad de multiplos de 3 hasta "+ num +" = "+aux);
		
		System.out.println("Esto es una prueba");
		
		teclado.close();
	}
	

}

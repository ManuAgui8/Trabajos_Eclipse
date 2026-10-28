import java.util.Scanner;
/**
 * Escribe un programa que lee dos números y nos dice cuál es el mayor o si son
	iguales.
 */

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime dos número y te digo cual de ellos es el mayor o si son iguales");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El numero "+ num1 +" es el mayor");
		} if (num1 < num2) {
			System.out.println("El numero "+ num2 +" es el mayor");
		} if (num2 == num1) {
			System.out.println("Los números son iguales");
		}
		
		teclado.close();
	}
}

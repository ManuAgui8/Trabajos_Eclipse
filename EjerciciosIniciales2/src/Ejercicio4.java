import java.util.Scanner;
/**
 * Escribe un programa que lee dos números y los visualiza en orden ascendente
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime dos números y te los leo en orden ascendente (de menor a mayor");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		if (num1 < num2 ) {
			System.out.println("El orden ascendente de estos números es "+ num1 +" y "+ num2);
		} 
		
		if (num1 > num2) {
			System.out.println("El orden ascendente de estos números es "+ num2 +" y "+ num1);
		} 
		
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		}
		
		teclado.close();
	}
}

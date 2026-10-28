import java.util.Scanner;
/**
 * Escribe un programa que lee 2 números y muestra el mayor.
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime dos números y te digo cuál es el mayor");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número mayor es "+ num1);
		} if (num1 < num2) {
			System.out.println("El número mayor es "+ num2);
		}
		teclado.close();
	}
}

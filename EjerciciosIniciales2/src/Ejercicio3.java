import java.util.Scanner;
/**
 *Escribe un programa que lee un número y me dice si es positivo o negativo,
	consideraremos el cero como positivo.
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		
		int num = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número y te digo si es positivo o negativo");
		num = teclado.nextInt();
		
		if (num >= 0) {
			System.out.println("El número "+ num +" es positivo");
		} else {
			System.out.println("El número "+ num +" es negativo");
		}
		
		teclado.close();
	}
}

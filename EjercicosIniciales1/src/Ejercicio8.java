import java.util.Scanner;
/**
 * Escribe un programa que pide la edad por teclado y nos muestra el
	mensaje de “Eres mayor de edad” solo si lo somos.
 */

public class Ejercicio8 {
	public static void main(String[] args) {
		
		int edad = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} 
		teclado.close();
	}
}

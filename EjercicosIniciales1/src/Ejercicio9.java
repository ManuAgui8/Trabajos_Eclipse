import java.util.Scanner;
/**
 * Escribe un programa que pide la edad por teclado y nos muestra el
	mensaje de “eres mayor de edad” o el mensaje de “eres menor de
	edad”
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		
		int edad = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		if (edad < 0) {
			System.out.println("Como puedes tener años negativos");
		} 
		
		teclado.close();
	}
}

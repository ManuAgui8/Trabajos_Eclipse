import java.util.Scanner;
/**
 *  Realiza un programa que lea una secuencia de notas (con valores que van de 0 a
	10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		
		int nota = 0;
		boolean hubo10 = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tus notas (del 0 al 10) y (-1 para salir), y te digo si ha habido algún 10 o no");
		
		do {
			nota = teclado.nextInt();
			if (nota == 10) {
				hubo10 = true;
			}
			
			if (nota < 0 || nota > 10) {
				System.out.println("Escribe la nota dentro del rango");
			}
		} while (nota != -1);
		
		if (hubo10) {
			System.out.println("Ha habido algún 10");
		} else {
			System.out.println("No ha habido ningún 10");
		}
		
		teclado.close();
	}
}

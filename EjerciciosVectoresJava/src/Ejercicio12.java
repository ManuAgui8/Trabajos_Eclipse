import java.util.Scanner;
/**
 *Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
	distintas opciones:
	a. Mostrar valores.
	b. Introducir valor.
	c. Salir.
	La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
	posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
	hasta que el usuario elija la opción ‘c’ que terminará el programa. 
 */

public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] v = new int[10];
		String respuesta;
		
		boolean a = false, b = false, c = false;
		
		do {
			System.out.println("Menu array");
			System.out.println("-----------------");
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Introducir valor");
			System.out.println("c. Salir");
			respuesta = teclado.nextLine();
			
			if (respuesta == "c") {
				c = true;
			}
			
			if (respuesta == "b") {
				System.out.println("Hola");
			}
		} while (c);
		
		
		
		
		
		
		
		teclado.close();
	}
}

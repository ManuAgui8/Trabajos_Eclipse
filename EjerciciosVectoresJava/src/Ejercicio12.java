import java.util.Arrays;
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
		int valor_vector = 0, posicion_vector = 0;
		
		
		do {
			System.out.println("Menu array");
			System.out.println("-----------------");
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Introducir valor");
			System.out.println("c. Salir");
			System.out.println("------------------");
			respuesta = teclado.nextLine();
			
			if (respuesta.equalsIgnoreCase("a")) {
				System.out.println("------------------");
				System.out.println(Arrays.toString(v));
				System.out.println("------------------");
			}
			
			if (respuesta.equalsIgnoreCase("b")) {
				System.out.println("-------------------------------------------------");
				System.out.println("Dime el valor que quieras introducir al vector");
				valor_vector = teclado.nextInt();
				System.out.println("Dime la posición del vector en la que quieres introducir el valor");
				posicion_vector = teclado.nextInt();
				v[posicion_vector - 1] = valor_vector;
			}
			
		} while (!respuesta.equalsIgnoreCase("c"));
		
		
		
		
		
		
		
		teclado.close();
	}
}

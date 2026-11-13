import java.util.Scanner;
/**
 * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
	positivo, negativo o cero. Implementa y utiliza la función:
		int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Dime un número y te digo si es positivo(1), negativo(-1), o cero(0)");
		num = teclado.nextInt();
		teclado.nextLine();
		
		switch (dimeSigno(num)) {
			case 1:
				System.out.println("El número "+ num + " es positivo");
				break;
			case -1:
				System.out.println("El número" + num + " es negativo");
				break;
			case 0:
				System.out.println("El número" + num + " es 0");
				break;
		}
		
		teclado.close();
	}
	
	public static int dimeSigno (int a) {
		if (a > 0) {
			return 1;
		}
		if (a < 0) {
			return -1;
		}
		return 0;
	}
}

import java.util.Scanner;
/**
 * Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
	elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
	tres) y nos devuelva el máximo de los dos valores.
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Dime un número");
		num1 = teclado.nextInt();
		
		System.out.println("Dime otro número");
		num2 = teclado.nextInt();
		
		System.out.println("Dime el último número");
		num3 = teclado.nextInt();
		
		
		System.out.println("El mayor de estos tres número es: "+ maximo(maximo(num1, num2), num3));
		
		
		teclado.close();
	}
	
	public static int maximo (int a, int b) {
		
		if (a > b) {
			return a;
		}
		
		return b;
	}
}

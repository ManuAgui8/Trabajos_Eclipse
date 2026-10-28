import java.util.Scanner;
/**
 *Escribe un programa que lea tres números distintos y nos diga cuál es el mayor. 
 */

public class Ejercicio6 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, num3 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tres números y te digo cúal es el mayor de ellos");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El número mayor es el "+ num1);
			} else {
				System.out.println("El número mayor es el "+ num3);
			}
		} else {
			if (num2 < num3) {
				System.out.println("El número mayor es el "+ num3);
			} else {
				System.out.println("El número mayor es el "+ num2);
			}
		}
		
		teclado.close();
	}
}

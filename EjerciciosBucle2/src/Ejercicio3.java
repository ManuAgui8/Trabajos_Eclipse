import java.util.Scanner;

/**
 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores
que el último dado. La introducción de números finaliza con la introducción de
un 0. Al final se mostrará:
i. El total de números introducidos, excluido el 0.
ii. El total de números fallados.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num2 = 0;
		int aux1 = 0;
		int aux2 = -1;
		int num1 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número inicial");
		num1 = teclado.nextInt();
		do {
			System.out.println("Dime un número mayor o igual");
			num2 = teclado.nextInt();
			
			if (num1 <= num2) {
				aux1 = aux1 + 1;
				num1 = num2;
			} else {
				System.out.println("fallo, es menor");
				num1 = num2;
				aux2 += 1;
				aux1 = aux1 + 1;
			}
		} while (num2 != 0);
		
		
		System.out.println("Total de números introducidos = "+ aux1);
		System.out.println("Total de fallos = "+ aux2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();
	}
}

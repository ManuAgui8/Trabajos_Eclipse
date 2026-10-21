import java.util.Scanner;
/**
 * Escribe un programa que lea dos números, calcule y muestre el valor de
	sus suma, resta, producto y división.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int suma;
		int resta;
		int mult;
		int div;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime dos número y te diré su suma, su resta, su multiplicación y su división");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("La suma de "+ num1 + " + "+ num2 + " = "+ suma);
		System.out.println("La resta de "+ num1 + " - "+ num2 + " = "+ resta);
		System.out.println("La multiplicacióm de "+ num1 + " x "+ num2 + " = "+ mult);
		System.out.println("La división de "+ num1 + " / "+ num2 + " = "+ div);
		
		teclado.close();
		
		
	}

}

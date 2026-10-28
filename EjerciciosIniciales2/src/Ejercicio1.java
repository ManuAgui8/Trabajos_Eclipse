import java.util.Scanner;
/**
 * Escribe un programa que lee dos números, calcula y muestra el valor de su suma,
	resta, producto y división. (Ten en cuenta la división por cero).
 */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		int suma = 0, resta = 0, mult = 0, div = 0;
		boolean comprobante = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número");
		num1 = teclado.nextInt();
		System.out.println("Dime otro número y te dire la suma, la resta, la multiplicación,"
				+ " y la división (si se puede hacer");
		num2 = teclado.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		
		if (num2 > 0) {
			div = num1 / num2;
			comprobante = true;
		} 
		
		System.out.println("La suma de "+ num1 +" + "+ num2 +" = "+ suma);
		System.out.println("La resta de "+ num1 +" - "+ num2 +" = "+ resta);
		System.out.println("La multiplicación de "+ num1 +" x "+ num2 +" = "+ mult);
		if (comprobante) {
			System.out.println("La división de "+ num1 +" / "+ num2 +" = "+ div);
		} else {
			System.out.println("No se puede dividir entre 0");
		}
		
		teclado.close();
	}
}

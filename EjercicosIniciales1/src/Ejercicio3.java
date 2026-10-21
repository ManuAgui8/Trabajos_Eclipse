import java.util.Scanner;
/**
 * Escribe un programa que calcule el área de un cuadrado cuyo lado se
	introduce por teclado
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int lado = 0;
		int area = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime cuanto mide el lado de un cuadrado y te digo su área");
		lado = teclado.nextInt();
		
		area = lado * lado;
		
		System.out.println("El área de un cuadrado de lado "+ lado +" = "+ area);
		
		teclado.close();
		
	}

}

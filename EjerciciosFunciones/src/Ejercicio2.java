import java.util.Scanner;
public class Ejercicio2 {
	
	public static boolean esMayorEdad(int a) {
		boolean mayor = false;
		
		if (a >= 18) {
			mayor = true;
		} else {
			mayor = false;
		}
		return mayor;
	}
	public static void main(String[] args) {
		int edad;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad y te digo si eres mayor de edad");
		edad = teclado.nextInt();
		
		if (esMayorEdad(edad)) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}
		
		teclado.close();
	}
}

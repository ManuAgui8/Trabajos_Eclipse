import java.util.Scanner;
public class Ejercicio3 {
	
	public static int minimo(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Dime dos números enteros y te digo el mínimo");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		System.out.println("El mínimo de estos dos números es: "+ minimo(num1, num2));
		
		teclado.close();
	}
}

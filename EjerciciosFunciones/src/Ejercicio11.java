import java.util.Scanner;
public class Ejercicio11 {

	public static void tablaMultiplicar (int a) {
	
		int resultado = 0;
		
		for (int i = 1; i <= 10; i++) {
			resultado = a * i;
			System.out.println(a +" x "+ i +" = "+ resultado);
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Dime un número y te creo su tabla de multiplicar (del 1 al 10");
		num = teclado.nextInt();
		
		tablaMultiplicar(num);
		
		teclado.close();
	}
}

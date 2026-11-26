import java.util.Scanner;
public class Ejercicio1 {
	
	public static double multiplicacion(double a, double b) {
		return a * b;
	}
	
	
	public static void main(String[] args) {
		double num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime dos numero cualesquiera y te los multiplico con una funcion");
		num1 = teclado.nextDouble();
		num2 = teclado.nextDouble();
		
		System.out.println("El resultado de la multiplicación de estos números es: "+ multiplicacion(num1, num2));
		
		teclado.close();
	}
}

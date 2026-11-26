import java.util.Scanner;
public class EjercicioMaximo {
	
	
	//TODO: Generar funcion que calcula el maximo entre dos numeros reales
	public static double maximo (double a, double b) {
		if (a > b) {
			return a;
		}
		return b;
	}
	
	//TODO 2: Generar funcion que calcule el maximo entre 3 numeros reales
	public static double maximo (double a, double b, double c) {
		return maximo(maximo(a, b), c);
	}
	/**
	 * Declaracion metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		double a, b, c, maximo, maximoDe3;
		Scanner teclado = new Scanner(System.in);
		
		//TODO: Pedir valores a, b y c
		
		System.out.println("Dime un valor a cualquiera");
		a = teclado.nextDouble();
		System.out.println("Dime otro valor b cualquiera");
		b = teclado.nextDouble();
		
		//TODO: Asignar a maximo el valor maximo entre a y b
		
		maximo = maximo(a, b);
		System.out.println("El máximo valor entre a y b = "+ maximo);
		
		//TODO 2: Mostrar el valor maximo de a, b y c (utilizando la funcion creada)
		
		System.out.println("Dime un tercer valor c cualquiera y te digo el maximo de los 3 valores");
		c = teclado.nextDouble();
		
		maximoDe3 = maximo(a, b, c);
		System.out.println("El valor máximo entre a, b y c = "+ maximoDe3);
		
		teclado.close();
	}	
}

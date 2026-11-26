import java.util.Scanner;
public class Ejercicio12 {

	public static double millas (double a) {
		return a * 0.6211	;
	}
	
	public static void main(String[] args) {
		double kilometros;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime una distancia en kilometros y te la devuelvo en millas con una funcion");
		kilometros = teclado.nextDouble();
		
		System.out.println(kilometros + "km, son en millas: "+ millas(kilometros) +" millas");
		
		teclado.close();
	}
}

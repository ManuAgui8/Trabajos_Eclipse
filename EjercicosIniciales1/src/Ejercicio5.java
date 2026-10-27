import java.util.Scanner;
/**
 * Escribe un programa que toma como dato de entrada un número que
	corresponde a la longitud de un radio y nos escribe la longitud de la
	circunferencia, el área del círculo y el volumen de la esfera que
	corresponden con dicho radio.
 */

public class Ejercicio5 {
	public static void main(String[] args) {
		
		double radio = 0.0, longitud = 0.0, area = 0.0, volumen = 0.0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la longitud de un radio y te diré la longitud de la circunferencia, "
				+ "su área y el volumen de la esfera que la contiene");
		
		radio = teclado.nextDouble();
		
		
		if (radio > 0) {
			longitud = (2*Math.PI) * radio;
			area = Math.pow(radio, 2) * Math.PI;
			volumen = (4 * Math.PI * Math.pow(radio, 3))/3;
			
			System.out.println("La longitud de la circunferencia de radio "+ radio + " = "+ longitud);
			System.out.println("El área de la circunferencia de radio "+ radio + " = "+ area);
			System.out.println("El volumen de la esfera que contiene a la circunferencia de radio "+ radio + " = "+ volumen);
		} else {
			System.out.println("El radio de una circunferencia es positivo");
		}
		
		teclado.close();
		
	}
}

import java.util.Scanner;
/**
 * Escribe un programa que lea una calificación numérica entre 0 y 10 y la
	transforma en calificación alfabética, escribiendo el resultado.
		de 0 a <3 Muy Deficiente.
	 	de 3 a <5 Insuficiente.
		de 5 a <6 Bien.
		de 6 a <9 Notable
		de 9 a 10 Sobresaliente
 */

public class Ejercicio7 {
	public static void main(String[] args) {
		
		double nota = 0.0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la nota y te la digo en calificación alfabética");
		nota = teclado.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			if (nota >= 0 && nota < 3) {
				System.out.println("La nota es muy deficiente");
			}
			
			if (nota >= 3 && nota < 5) {
				System.out.println("La nota es insuficiente");
			}
			
			if (nota >= 5 && nota < 6) {
				System.out.println("La nota es un bien");
			}
			
			if (nota >= 6 && nota < 9) {
				System.out.println("La nota es un notable");
			}
			
			if (nota >= 9 && nota <= 10) {
				System.out.println("La nota es un sobresaliente");
			}
		} else {
			System.out.println("La nota tiene que estar entre 0 y 10");
		}
		
		teclado.close();
	}
}

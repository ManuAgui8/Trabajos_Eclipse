import java.util.Scanner;
/**
 * Escribe un programa que recibe como datos de entrada una hora expresada en
	horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos
	que serán, transcurrido un segundo.
 */

public class Ejercicio8 {
	public static void main(String[] args) {
		int hora=0, minuto=0, segundo=0, segundo_final=0, minuto_final=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime que hora es en horas, minutos y segundos (hora del dia en 24horas");
		System.out.println("-------------------------------------------");
		System.out.println("Dime la hora");
		hora = teclado.nextInt();
		System.out.println("Dime el minuto");
		minuto = teclado.nextInt();
		System.out.println("Dime el segundo");
		segundo = teclado.nextInt();
		

		
		segundo_final = segundo + 1;
		
		if (segundo_final > 60 || minuto > 59 || hora > 24) {
			System.out.println("Dime la hora dentro de los rangos");
		} else {
			if (segundo_final == 60) {
				minuto_final = minuto + 1;
				segundo_final = 0;
				if (minuto_final == 60) {
					hora = hora + 1;
					minuto_final = 0;
					if (hora == 24) {
						hora = 0;
					}
				}
			} else {
				minuto_final = minuto;
				
			}
			System.out.println("Ahora te digo la hora si transcurre un segundo");
			System.out.println("--------------------------------------------");
			System.out.println("La hora tras sumarle un segundo se queda tal que asi:");
			System.out.println(hora + " horas, "+ minuto_final +" minutos, y "+ segundo_final +" segundos");
		}
	
		teclado.close();
		
	}
}

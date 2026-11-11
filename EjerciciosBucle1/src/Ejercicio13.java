import java.util.Scanner;

/**
 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
	ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
	una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es
	mayor, menor o igual al número que ha pensado).
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		
		boolean solucionado = false;
		int respuesta_num, adivino, min = 1, max = 100;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Pinesate un número y lo intento adivinar.");
		System.out.println("========================================");
		
		do {
			adivino = (max + min) / 2;
			System.out.println("El numero es mayor a "+ adivino +"?, (1) = si, (-1) = no, (0) = es ese número");
			respuesta_num = teclado.nextInt();
			switch (respuesta_num) {
				case 1:
					min = adivino;
					break;
				case -1:
					max = adivino;
					break;
				case 0:
					solucionado = true;
					break;
			}
		} while (!solucionado);
		
		System.out.println("El número que has pensado es: "+ adivino);

		teclado.close();
	}
}

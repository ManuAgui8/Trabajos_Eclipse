import java.util.Scanner;

/**
 * Crea un programa que pida veinte números reales por teclado, los almacene en un array y
	luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores. 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int v[] = new int[20];
		int num = 0;
		int contador = 0;
		int aux = 0;
		
		System.out.println("Dime 20 números y te digo su media");
		
		for (int i=0; i < v.length; i++) {
			num = teclado.nextInt();
			v[i] = num;
			contador++;
			aux = aux + num;
		}
		
				
		int media = aux/contador;
		
		System.out.println("La media de esos números es "+ media);
		
		teclado.close();
	}

}

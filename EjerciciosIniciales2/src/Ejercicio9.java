import java.util.Scanner;
/**
 *  Escribe un programa que calcula el salario neto semanal de un trabajador en
	función del número de horas trabajadas y la tasa de impuestos de acuerdo a las
	siguientes hipótesis:
	 - Las primeras 35 horas se pagan a tarifa normal.
	 - Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
	 - Las tasas de impuestos son:
	 - Los primeros 500 euros son libres de impuestos.
	 - Los siguientes 400 tienen un 25% de impuestos.
	 - Los restantes un 45% de impuestos.
	Escribir nombre, salario bruto, tasas y salario neto.
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		int salario_bruto = 0;
		String trabajador;
		int horas_semanales = 0;
		int salario_neto = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime quién es el trabajador");
		trabajador = teclado.nextLine();
		System.out.println("Dime las horas que trabaja a la semana");
		horas_semanales = teclado.nextInt();
		System.out.println("Por último, dime su salario bruto y te diré el neto despúes de todas las tasas");
		salario_bruto = teclado.nextInt();
	}
}

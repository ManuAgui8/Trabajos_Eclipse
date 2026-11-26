import java.util.Scanner;

public class Ejercicio10 {

	public static boolean fechaCorrecta (int a, int b, int c) {
		boolean fechacorrecta = false;
		
		if ((a <= 30 && a > 0) && (b <= 12 && b > 0) && c > 0) {
			fechacorrecta = true;
		} else {
			fechacorrecta = false;
		}
		
		return fechacorrecta;
	}
	
	public static void main(String[] args) {
		int dia, mes, año;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime una fecha (dia, mes, año)");
		System.out.println("Dime el dia en número");
		dia = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Dime el mes en número");
		mes = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Dime el año");
		año = teclado.nextInt();
		teclado.nextLine();
		
		if (fechaCorrecta(dia, mes, año)) {
			System.out.println("La fecha introducida es correcta");
		} else {
			System.out.println("La fecha introducida no es correcta");
		}
		
		teclado.close();
	}
}

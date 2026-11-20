import java.util.Scanner;

public class DibujoCuadrado {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Introduce el numero de columnas: ");
        int columnas = teclado.nextInt();

        // TODO 1: Si filas o columnas es menor o igual que cero,
        //         muestra el mensaje de error indicado y no dibujes nada.
        // TODO 2: Si ambas dimensiones son válidas, dibuja el rectángulo
        //         con '*' en los bordes y espacios en el interior.
        //         Comprueba también los casos de una sola fila o columna.
        
        
        	for (int i = 0; i < filas; i++) {
        		for (int j = 0; j < columnas; j++) {
        			if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
        				System.out.print("*");
        			} else {
        				System.out.print(" ");
        			}
        		}
    			System.out.println();
        	}
      
        
        teclado.close();
	}
}

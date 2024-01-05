package practica;

import java.util.Scanner;

public class FormacionRomana {
	public enum TipoFormacion {
		LINEA, CUADRADO, TRIANGULO
	};

	public static void main(String[] args) {
		// Declaración de variables.
		int numSoldados = 0;// Numero de soldados indicado por el usuario.
		String formacionSeleccionada = "";
		// Creamos objeto Scanner.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Formación romana a partir del número de soldados");
		
		do {
			System.out.println("Introduce el número de elementos de la formación (debe ser mayor a cero)");
			numSoldados = teclado.nextInt();
		} while (numSoldados < 1);
		
		//Una vez que el número es correcto, solicitamos el tipo de formación.
		System.out.println("Introduce el tipo de formación");
		
		formacionSeleccionada = teclado.next().toUpperCase();
		switch(formacionSeleccionada) {
			case "LINEA":
				for(int n=0;n<numSoldados;n++) {
					System.out.print("*");
				}
				break;
			case "CUADRADO":
				break;
			case "TRIANGULO":
				break;
			default:
				System.out.println("Opción NO CORRECTA");
		
		}
	}

}

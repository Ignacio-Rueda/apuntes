package practica;

import java.util.Scanner;

public class FormacionRomana {
	public enum TipoFormacion {
		LINEA, CUADRADO, TRIANGULO
	};

	public static void main(String[] args) {
		// Declaración de variables.
		int numSoldados = 0;// Numero de soldados indicado por el usuario.
		int numSoldadosPosibles = 0;// Soldados obtenidos tras hacer la raíz cuadrada.
		String formacionSeleccionada = "";
		int restoSoldados = 0;
		String espaciosFormacion = "";// Incialmente 0.

		// Creamos objeto Scanner.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Formación romana a partir del número de soldados");

		do {
			System.out.println("Introduce el número de elementos de la formación (debe ser mayor a cero)");
			numSoldados = teclado.nextInt();
		} while (numSoldados < 1);

		// Una vez que el número es correcto, solicitamos el tipo de formación.
		System.out.println("Introduce el tipo de formación");

		formacionSeleccionada = teclado.next().toUpperCase();
		switch (formacionSeleccionada) {
		case "LINEA":
			for (int n = 0; n < numSoldados; n++) {
				System.out.print("*");
			}
			break;
		case "CUADRADO":
			// Ahora realizar los cálculos para la formación en cuadrado
			// 1- Uso de la raíz cuadrada, utilizando el método estático Math.sqrt
			numSoldadosPosibles = (int) Math.sqrt(numSoldados);

			for (int n = 0; n < numSoldadosPosibles; n++) {
				for (int l = 0; l < numSoldadosPosibles; l++) {
					System.out.print("*");
				}
				// Por cada fila que pintemos, saltamos de línea
				System.out.println("");
			}
			// Calcular cuántos soldados sobran.
			restoSoldados = numSoldados - (numSoldadosPosibles * numSoldadosPosibles);
			if (restoSoldados > 0) {
				System.out.printf(
						"De los %d soldados asignados, una vez hecha la mayor formación posible del tipo indicado, sobran %d soldados.",
						numSoldados, restoSoldados);
			}
			break;
		case "TRIANGULO":
			// Triángulo perfecto invertido (terminando en la última fila con un soldado).

			// Calcular el número máximo de filas que podemos representar.
			numSoldadosPosibles = (int) ((Math.sqrt(1 + 8 * numSoldados) - 1) / 2);
			for (int n = 0; n < numSoldadosPosibles; n++) {
				for (int l = 0; l < numSoldadosPosibles - n; l++) {
					if (l == 0) {
						System.out.print(espaciosFormacion);
					}

					System.out.print("* ");
					restoSoldados++;
				}
				// Una vez terminada la fila, salto de línea.
				System.out.println("");
				// Incrementamos espacios formacion.
				espaciosFormacion += " ";
			}
			// Calcular cuántos soldados sobran.
			restoSoldados = (numSoldados - restoSoldados);
			if (restoSoldados > 0) {
				System.out.printf(
						"De los %d soldados asignados, una vez hecha la mayor formación posible del tipo indicado, sobran %d soldados.",
						numSoldados, restoSoldados);
			}
			break;
		default:
			System.out.println("Opción NO CORRECTA");

		}
	}

}

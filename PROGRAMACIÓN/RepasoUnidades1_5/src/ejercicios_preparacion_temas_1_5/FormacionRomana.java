package ejercicios_preparacion_temas_1_5;

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
		String forma = "";

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
				forma += "*";
			}
			break;
		case "CUADRADO":
			// Ahora realizar los cálculos para la formación en cuadrado
			// 1- Uso de la raíz cuadrada, utilizando el método estático Math.sqrt
			numSoldadosPosibles = (int) Math.sqrt(numSoldados);

			for (int n = 0; n < numSoldadosPosibles; n++) {
				for (int l = 0; l < numSoldadosPosibles; l++) {
					forma += "*";
				}
				// Por cada fila que pintemos, saltamos de línea
				forma += "\n";
			}
			// Calcular cuántos soldados sobran.
			restoSoldados = numSoldados - (numSoldadosPosibles * numSoldadosPosibles);
			break;
		case "TRIANGULO":
			// Triángulo perfecto invertido (terminando en la última fila con un soldado).

			// Calcular el número máximo de filas que podemos representar.
			numSoldadosPosibles = (int) ((Math.sqrt(1 + 8 * numSoldados) - 1) / 2);
			for (int n = 0; n < numSoldadosPosibles; n++) {
				for (int l = 0; l < numSoldadosPosibles - n; l++) {
					if (l == 0) {
						forma += espaciosFormacion;
					}
					forma += "* ";
					restoSoldados++;// Soldados que sobran.
				}
				// Una vez terminada la fila, salto de línea.
				forma += "\n";
				// Incrementamos espacios formacion.
				espaciosFormacion += " ";
			}
			// Calcular cuántos soldados sobran.
			restoSoldados = (numSoldados - restoSoldados);
			break;
		default:
			System.out.print("Opción NO CORRECTA");

		}
		//--------------------------
		// Salida de los resultados.
		//-------------------------
		
		System.out.println(forma);
		if (restoSoldados > 0) {
			System.out.printf(
					"De los %d soldados asignados, una vez hecha la mayor formación posible del tipo indicado, sobran %d soldados.",
					numSoldados, restoSoldados);
		}
	}

}

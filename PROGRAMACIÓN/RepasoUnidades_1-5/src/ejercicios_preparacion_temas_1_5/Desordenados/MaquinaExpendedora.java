package ejercicios_preparacion_temas_1_5.Desordenados;

import java.util.Scanner;

public class MaquinaExpendedora {
	// Utiliza un tipo enumerado para definir los tipos de bebidas.
	public enum BEBIDAS {
		COCACOLA, PEPSI, AGUA, ZUMO, OTRO
	};

	public static void main(String[] args) {
		// Declaración de variables.
		int posBebida = 0;
		double precioBebida = 0;
		boolean entradaValida = false;
		BEBIDAS bebidaSeleccionada = null;
		double dineroIngresado = 0;
		double diferenciaPrecio = 0;

		// Entrada de datos.
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Máquina expendedora de bebidas");
			System.out.println("Bienvenido a la máquina expendedora de Bebidas");
			System.out.println("Seleccione una bebida");
			System.out.println("1. " + BEBIDAS.COCACOLA + " 1.50€");
			System.out.println("2. " + BEBIDAS.PEPSI + " 1.50€");
			System.out.println("3. " + BEBIDAS.AGUA + " 1.00€");
			System.out.println("4. " + BEBIDAS.ZUMO + " 2.00€");
			System.out.println("0. " + "Salir");
			// Solicitamos datos
			System.out.println("Seleccione una opción:");
			posBebida = teclado.nextInt();
			// Comprobamos si la entrada es válida.
			if (posBebida >= 0 && posBebida <= 4) {
				entradaValida = true;
			} else {
				System.out.println("Opción no válida. Seleccione una bebida válida");
			}
		} while (!entradaValida);

		// Comprobamos la posición de la bebida y damos una respuesta.
		switch (posBebida) {
		case 0:
			System.out.println("Gracias por usar la Máquina Expendedora. ¡Hasta luego!");
			break;
		case 1:
			precioBebida = 1.50;
			bebidaSeleccionada = BEBIDAS.COCACOLA;
			break;
		case 2:
			precioBebida = 1.50;
			bebidaSeleccionada = BEBIDAS.PEPSI;
			break;
		case 3:
			precioBebida = 1.00;
			bebidaSeleccionada = BEBIDAS.AGUA;
			break;
		case 4:
			precioBebida = 2.00;
			bebidaSeleccionada = BEBIDAS.ZUMO;
			break;

		}// Fin switch.

		if (entradaValida) {
			System.out.printf("Ha seleccionado una %s. El precio es %.2f€ %n", bebidaSeleccionada, precioBebida );
			// Una vez que sabemos la bebida seleccionada junto con su precio, solicitamos
			// dinero.
			System.out.print("Ingrese la cantidad de dinero en euros:");
			dineroIngresado = teclado.nextDouble();
			// Si el dinero es insuficiente, el programa finalizará.
			if (dineroIngresado < precioBebida) {
				System.out.println("Dinero insuficiente. Su dinero será devuelto.");
			} else {
				diferenciaPrecio = dineroIngresado - precioBebida;
				System.out.printf("Compra exitosa. Su cambio es: %.2f € %n Disfrute de su %s", diferenciaPrecio,bebidaSeleccionada);
			}
		}
	}

}

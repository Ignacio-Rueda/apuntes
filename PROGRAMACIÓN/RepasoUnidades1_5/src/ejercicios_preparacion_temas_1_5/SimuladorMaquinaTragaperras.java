package ejercicios_preparacion_temas_1_5;
public class SimuladorMaquinaTragaperras {

	public static void main(String[] args) {
		// Declaración de variables:
		String frutas = "PFMNC";// Plátano | Fresa | Manzana | Naranja | Cereza.
		int numFrutaAleatorio = 0;
		final int secuencia = 3; // Secuencia de 3 números.
		// Declaración de premios.
		final String premio1 = "PPP";
		final String premio2 = "FFF";
		final String premio3 = "MMM";
		final String premio4 = "NNN";
		final String premio5 = "CCC";
		int posPremio=0;//Almacena la posición del premio.
		String combinacionObtenida = "";// Combinación elementos obtenida
		String resultado = "";
		int contadorIntentos = 0;
		boolean premio = false;

		while (!premio) {
			// Incremento contador.
			contadorIntentos++;
			// En cada tirada se genera un secuencia de tres elementos ( letras o frutas ).
			for (int n = 0; n < secuencia; n++) {
				numFrutaAleatorio = (int) (Math.random() * 5);
				combinacionObtenida += frutas.charAt(numFrutaAleatorio);
			}
			// Asignamos combinación al resultado final para posteriormente mostrarlo por
			// pantalla.
			resultado += contadorIntentos + "-" + combinacionObtenida + "\n";
			// Comprobar la combinación obtenida con los posibles premios.
			switch (combinacionObtenida) {
			case premio1:
				premio = true;
				posPremio = 1;
				break;
			case premio2:
				premio = true;
				posPremio = 2;
				break;
			case premio3:
				premio = true;
				posPremio = 3;
				break;
			case premio4:
				premio = true;
				posPremio = 4;
				break;
			case premio5:
				premio = true;
				posPremio = 5;
				break;
			default:
				combinacionObtenida="";
				contadorIntentos ++;
				premio = false;
			}
		}
		// ------------------
		// Mostrar resultados
		// ------------------
		System.out.printf("%sHas conseguido el premio %d en el intento %d con la secuencia:%s",resultado,posPremio,contadorIntentos,combinacionObtenida);
		
	
	}
}


package ejercicios_preparacion_temas_1_5;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;

public class ClaseSystem {

	public static void main(String args[]){
		
		/**
		 * En java, la entrada por teclado y la salida de la información por pantalla se hace mediante la clase System del paquete java.lang.
		 * System.in es una instancia de la clase InputStream
		 * InputStream: nos permite leer en bytes
		 */
		
		try {
			System.out.println("Introduce unos bytes por aquí....");
			int valor = System.in.read();
			System.out.println(valor);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//System.in = Flujo de entrada de bytes.
		 InputStreamReader isr = new InputStreamReader(System.in);//Convierte los bytes leídos en caracteres. Permite convertir el objeto System.in en otro tipo de objeto que nos permita leer caracteres.
		 BufferedReader br = new BufferedReader(isr);//Lee hasta el final de una línea.

		 
		 try {
			 BufferedReader lec = new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("Introduce un número entero");
			 int numEntero = (lec.read());//Inconveniente de tener que convertir todos los datos que no sean del tipo String.
			 System.out.println(numEntero);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 //-----------------------------------
		 //SOLUCIÓN CONTRA LA OPCIÓN ANTERIOR
		 //-----------------------------------
		 
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Introduce un número entero");
		 int numeroEntero = teclado.nextInt();
		 //O bien para leer una línea completa, incluido texto, números o lo que sea.
		 //String cadena = teclado.nextLine();
		 System.out.println(numeroEntero);
		 
		 
		 //------------------------------------
		 //SALIDA POR PANTALLA
		 //------------------------------------
		 /**
		  * La salida por pantalla en Java se hace con el objeto System.out. Este objeto es una instancia de la clase PrintStream del paquete java.lang.
		  * Algunos métodos de PrintStream:
		  * 	-print
		  * 	-println
		  * 	-printf
		  * 		%c Escribe un caracter.
		  * 		%s Escribe una cadena de texto.
		  * 		%.2f Escribe un número en coma flotante, en este caso con dos decimales.
		  * 		%e	Escribe un número en punto flotante en notación científica.
		  */
		 
	}
}

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
		//System.in = Flujo de entrada de bytes.
		 InputStreamReader isr = new InputStreamReader(System.in);//Convierte los bytes leídos en caracteres. Permite convertir el objeto System.in en otro tipo de objeto que nos permita leer caracteres.
		 BufferedReader br = new BufferedReader(isr);//Lee hasta el final de una línea.

		 
		 try {
			 BufferedReader lec = new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("Introduce un número entero");
			 int numEntero = Integer.parseInt(lec.readLine());//Inconveniente de tener que convertir todos los datos que no sean del tipo String.
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
		 System.out.println(numeroEntero);
	}
}

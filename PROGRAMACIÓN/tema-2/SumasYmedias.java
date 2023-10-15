import java.util.Scanner;
public class SumasYmedias{
	
	
	public static void main(String args[]){
		//Calcular la suma y la media aritmética para una serie de números enteros no negativos
		
		int numerosAleer =0;
		boolean aprobadaLectura = false;
		int numerosIntro;
		int contador = 0;
		int contadorDescartes = 0;
		int suma = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("SUMA Y MEDIA DE NUMEROS INTRODUCIDOS POR TECLADO");
		System.out.println("Leeremos varios numeros positivos introducidos por teclado para clacular su suma y su media aritmética");
		System.out.print("¿Cuántos numeros no negativos quieres leer?");
		numerosAleer = teclado.nextInt();
		
		//Controlamos numerosAleer
		if(numerosAleer < 0)
			System.out.println("No es posible leer una cantidad negativa de numeros");
		else if(numerosAleer==0)
			System.out.println("No se ha leído ningún número");
		else
			aprobadaLectura = true;
		
		while(aprobadaLectura && contador <numerosAleer){
			
			System.out.print("Introduzca el numero "+(contador+1));
			numerosIntro = teclado.nextInt();
			if(numerosIntro >= 0){
				suma+=numerosIntro;
				contador++;
			}
			else{
				System.out.println("El numero "+numerosIntro+" es negativo y se descarta");
				contadorDescartes++;
			}
			if(contador == numerosAleer){
				System.out.println("Se han realizado un total de "+(contador + contadorDescartes)+" intentos de lecturas de números");
				System.out.println("De ellos "+contador+" han sido correctos");
				System.out.println("Suma total "+suma+". Media: "+suma/contador);
			}
		}
		
	}
	
	
	
	
}
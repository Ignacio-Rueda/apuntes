package ejercicios_preparacion_temas_1_5;
import java.util.Random;
public class ClaseMath {

	public static void main(String[]args) {
		
		
		System.out.printf("Devuelve un número aleatorio entre 0.0 y menor que 1.0 = '%.2f' %n",Math.random());
		System.out.printf("Devuelve un número aleatorio entre 0.0 y el número que deseamos, en este caso INFERIOR A 25 = '%.2f' %n",Math.random()*25);
		System.out.printf("Devuelve un número aleatorio ENTERO 0 y el número que deseamos, en este caso INFERIOR A 25 = '%d' %n",(int)(Math.random()*25));
		
		System.out.println("Queremos alcanzar también el número 25");
		System.out.printf("Devuelve un número aleatorio ENTERO 0 y el número que deseamos, en este caso INFERIOR O IGUAL 25 = '%d' %n",(int)(Math.random()*26));
		System.out.printf("Devolver un número aleatorio ENTERO entre 1 y 25 %d%n",1+(int)(Math.random()*26));//Sumamos al origen, la cantidad de desplazamiento.
		System.out.println(65+(int)(Math.random()*25));

		//---------------------------//
		//UTILIZAMOS LA CLASE RANDOM//
		//-------------------------//
		System.out.println("Utilizamos la clase Random para generar un número aleatorio entre 0 y 25");
		//Creamos el objeto/instancia de la clase random usando el constructor sin parámetros.
		Random numAleatorio = new Random();
		System.out.println(numAleatorio.nextInt(26));//Devuelve número aleatorio entre 0 (inclusivo) y el número que le pasamos como parámetro (exclusivo).
		System.out.println(65 + numAleatorio.nextInt(26));

		
		//Crea un número entre 10 y 20 incluidos
		Random miNumeroAleatorio = new Random();
		
		System.out.println(10 +(int) (Math.random()*11));
		System.out.println(10 + miNumeroAleatorio.nextInt(11));



	
	}
}

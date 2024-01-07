package ejercicios_preparacion_temas_1_5;
import java.awt.Rectangle;
public class EjemploRectangle {

	public static void main(String[] args) {
		Rectangle r1,r2;
		r1 = new Rectangle(0,0,10,5);//Vértice inferior izquierdo en ubicado en coordenadas 0,0. Base longitud 10 y altura longitud 5.
		r2 = r1;
		Rectangle r3 = new Rectangle(0,0,10,5);

		int edad = -34;
	
		System.out.println(Math.PI);
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("user.language"));
		System.out.println(System.getProperty("java.version"));
		System.out.println("GENERACIÓN NÚMEROS ALEATORIOS CLASE MATH");
		
		System.out.println((int)Math.random());
	}

}

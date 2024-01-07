package ejercicios_preparacion_temas_1_5;
import static java.lang.Math.round;;
public class ClasesEnvoltorioYsentenciaImport {

	public static void main(String args[]) {
		
		Integer numeroEntero = new Integer(5); //De primitivo a objeto boxing.
		int numero = numeroEntero.intValue(); //De objeto a primitivo unboxing.
		//A partir de J2SE 5.0 se introdujo la conversión automática.
		//El autoboxing es la conversión automática que el compilador de Java hace entre los tipos primitivos y sus claes de objetos.
		//LAS CLASES ENVOLTORIO SON INMUTABLES. Cuando instanciamos un objeto de estas clases y le damos un valor ya no podrá cambiar su estado.
		System.out.println(numeroEntero);
		
		//--------------------------------
		//USO DE UNA CLASE SIN IMPORTARLA
		//--------------------------------
		
		java.awt.Rectangle rect = new java.awt.Rectangle(0,0,10,10);
		System.out.println(rect);
		
		//---------------------------------------
		//USO DE UN MÉTODO DIRECTAMENTE IMPORTADO
		//---------------------------------------
		
		double numeroFlotante = 5.52689;
		System.out.println(round(numeroFlotante));
	}
}

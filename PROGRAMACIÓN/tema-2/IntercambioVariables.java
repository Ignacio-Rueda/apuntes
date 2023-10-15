import java.util.Scanner;
public class IntercambioVariables{
	
	public static void main(String []args){
		double valorA;
		double valorB;
		double aux;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Intercambio de Valores");
		System.out.println("Introduce un valor real para la variable a: ");
		valorA = teclado.nextDouble();
		System.out.println("Introduce un valor real para la variable b: ");
		valorB = teclado.nextDouble();
		if(valorA>valorB){
			aux = valorA;
			valorA = valorB;
			valorB = aux;
			System.out.println("Los valores actualmente son: Para a "+valorA+" Para b "+valorB);
		}
		
	}
	
}
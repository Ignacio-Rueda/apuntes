import java.util.Scanner;

public class SumaDeNumeros{
	
	public static void main(String []args){
		
		Scanner teclado = new Scanner (System.in);
		double numIntroducido;
		double suma=0;
		double contador=0;
		//Calcular la suma de varios números reales no negativos
		System.out.println("SUMA DE NÚMEROS INTRODUCIDOS POR TECLADO");
		do{
			System.out.println("Introduce un número real no negativo");
			numIntroducido = teclado.nextDouble();
			if (numIntroducido >=0){
				contador++;
				suma+=numIntroducido;
			}
		}while(numIntroducido>0);
		
		System.out.println("Se han leido "+contador);
		System.out.println("Su suma es: "+suma);
		
	}
	
	
}
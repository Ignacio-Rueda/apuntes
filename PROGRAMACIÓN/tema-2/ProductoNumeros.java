import java.util.Scanner;
public class ProductoNumeros{
	
	public static void main(String []args){
		int num;
		int producto=1;
		int contador=0;
		//Calcular el producto de varios números enteros positivos
		Scanner teclado = new Scanner(System.in);
		
		
		do{
			System.out.println("Introduce un número entero positivo");
			num = teclado.nextInt();
			if(num>0){
				producto*=num;
				contador++;
			}
			
		}while(num>0);
		
		System.out.println("Se han leído "+contador+" enteros no negativos");
		System.out.println("El producto es: "+producto);
		
		
	}
	
	
	
}
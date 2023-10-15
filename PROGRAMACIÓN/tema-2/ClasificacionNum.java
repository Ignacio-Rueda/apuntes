import java.util.Scanner;
public class ClasificacionNum{
	
	public static void main(String []args){
		int contadorNumerosPositivos = 0;
		int contadorNumerosNegativos = 0;
		int contadorNumerosCero = 0;
		int numero;
		int sumaNegativos = 0;
		int sumaPositivos = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int n=0;n<10;n++){
			System.out.println("Introduce el numero"+(n+1));
			numero = teclado.nextInt();
			if(numero==0)
				contadorNumerosCero++;
			else if(numero > 0){
				contadorNumerosPositivos++;
				sumaPositivos+=numero;
			}
			else{ 
				contadorNumerosNegativos++;
				sumaNegativos-=numero;
			}	
		}
		
		System.out.println("En total se han leido:");
		System.out.println(contadorNumerosPositivos+" numeros positivos "+contadorNumerosNegativos+" numeros negativos "+contadorNumerosCero+" ceros");
		System.out.println("Los positivos suman "+sumaPositivos+" y su media es:"+((double)sumaPositivos/contadorNumerosPositivos));
		System.out.println("Los negativos suman "+ -sumaNegativos+" y su media es:"+((double)sumaNegativos/contadorNumerosNegativos));
		System.out.println("La suma de los 10 números leidos es " + (sumaPositivos-sumaNegativos) + " y su media es "+ ((double)(sumaPositivos-sumaNegativos)/10));
	}
	
	
}
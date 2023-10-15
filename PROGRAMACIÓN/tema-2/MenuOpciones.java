import java.util.Scanner;

public class MenuOpciones{
	
	public static void main(String []args){
		int eleccion;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("DIBUJO DE FIGURAS");
		System.out.println("1. Dibujar Punto.");
		System.out.println("2. Dibujar Recta.");
		System.out.println("3. Dibujar Rectángulo.");
		System.out.println("0. Terminar y salir.");
		
		eleccion = teclado.nextInt();
		
		switch (eleccion){
			case 1:
				//Imprimo un punto
				System.out.print("*");
				break;
			case 2:
				//Imprimo una recta
				for (int n=0;n<5;n++)
					System.out.print("*");
				break;
			case 3:
				//Imprimo rectánculo
				for(int n=0; n<3;n++){
					for(int l=0;l<5;l++){
						if(!(n==1 && l==1 || n==1 && l==2 || n==1 &&l==3))
							System.out.print("*");
						else 
							System.out.print(" ");
					}
					System.out.println();
				}
				break;
			case 0:
				System.out.println("Has seleccionado terminar y salir");
				break;
			default:
				System.out.println("No has seleccionado ninguna de las posibilidades");
		}
		
		
	
		
		
	
	
	
	
	}
}
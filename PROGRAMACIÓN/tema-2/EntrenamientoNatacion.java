import java.util.Scanner;
public class EntrenamientoNatacion{
	
	
	public static void main(String[]args){
		final int RANGO_MINIMO = 0;
		final int RANGO_MAXIMO = 50;
		final int INTENTOS = 3;
		
		int contador = 0;
		int numLargos = 0;
		boolean rangoAceptado = false;
		String estilos ="{ ";
		boolean vuelta = false;
		int contadorVueltas = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		while (contador < INTENTOS && rangoAceptado==false){
			contador++;
			System.out.println("Introduce numero de largos");
			numLargos = teclado.nextInt();
			if(numLargos <= RANGO_MAXIMO && numLargos >= RANGO_MINIMO)
				rangoAceptado=true;
			if(contador == INTENTOS && rangoAceptado ==false)
				System.out.println("Has superado el nùmero máximo de intentos erróneos");
			
		}
		if (rangoAceptado){
			if(numLargos==0)
				estilos+=" }";
			else{
				for(int n=0;n<numLargos;n++){
					
						if((n+1)%2==0){
							estilos += "espalda ";
							contadorVueltas++;
							if(contadorVueltas %2 == 0)
								vuelta = false;
							else
								vuelta = true;
						}
						else if(vuelta && (n+1)%2!=0){
							estilos += "braza ";
						}
						else{
							estilos += "crol ";
						}
						
						if(n==numLargos-1)
							estilos+="}";			
				}
			}
			System.out.println(estilos);
		}
	}
	
	
	
}
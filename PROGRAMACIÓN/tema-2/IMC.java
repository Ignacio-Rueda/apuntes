import java.util.Scanner;
public class IMC{
	
	public static void main(String []args){
		Scanner teclado = new Scanner(System.in);
		double pesoKg;
		double alturaCm;
		double imc;
		String resultado="";
		System.out.println("CaCULO DEL iNDICE DE MASA CORPORAL");
		System.out.println("Introduce el peso en kg:");
		pesoKg = teclado.nextDouble();
		System.out.println("Introduce la altura en cm:");
		alturaCm = teclado.nextDouble();
		//Cálculo imc
		imc = pesoKg/((alturaCm/100)*(alturaCm/100));
		
		if (imc < 16)
			resultado = "Criterio de ingreso en hospital";
		else if(imc < 17)
			resultado = "Infrapeso";
		else if(imc < 18)
			resultado = "Bajo peso";
		else if(imc < 26)
			resultado = "pESO NORMAL (saludable)";
		else if(imc < 30)
			resultado = "Sobrepeso (obesidad de grado I)";
		else if(imc < 35)
			resultado = "Sobrepeso crónico (Obesidad de grado II)";
		else if(imc < 40)
			resultado = "Obesidad premórbida(Obesidad grado III)";
		else
			resultado = "Obesida mórbida (obesidad de grado IV)";
		System.out.println("Para el peso de "+pesoKg+" Kilogramos y una altura de "+alturaCm/100+" metros");
		System.out.println("El índice de masa corporal es de: "+imc);
		System.out.println("Tiene "+resultado);
		
	}
	
	
}
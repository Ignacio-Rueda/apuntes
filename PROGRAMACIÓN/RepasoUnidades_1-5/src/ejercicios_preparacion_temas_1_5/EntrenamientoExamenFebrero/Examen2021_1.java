package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class Examen2021_1 {

    public static void main(String[] args) {
        final int NUMEROS_A_LERR =7;
        final int NEGATIVO_MIN = -50;
        final int NEGATIVO_MAX = -100;
        final int POSITIVO_MIN = 60;
        final int POSITIVO_MAX = 200;
        Scanner teclado = new Scanner(System.in);
        double numeroIntroducido = 0;
        int numContabilizados = 0;
        int numValidos =0;
        System.out.println("Leer 7 n�meros reales y comprobar que est�n en el intervalo [-100, -50] o bien en el [60, 200]");
        System.out.println("----------------------------------------------------------------------------------------------");
        while(numContabilizados<NUMEROS_A_LERR){
        try {
            System.out.printf("Introduzca un n�mero real que est� en el intervalo [%d, %d] o bien en el [%d, %d]%n", NEGATIVO_MAX, NEGATIVO_MIN, POSITIVO_MIN, POSITIVO_MAX);
            numeroIntroducido = teclado.nextDouble();
            if(numeroIntroducido>= NEGATIVO_MAX && numeroIntroducido<= NEGATIVO_MIN || numeroIntroducido>=POSITIVO_MIN && numeroIntroducido<=POSITIVO_MAX){
                numContabilizados++;
                numValidos ++;
                System.out.printf("Correcto. Total de n�meros reales v�lidos hasta ahora: %d%n",numValidos);
                System.out.printf("El �ltimo n�mero que acabamos de leer es el: %.2f%n",numeroIntroducido);
            }else{
                System.out.printf("Incorrecto. N�mero descartado. Total de n�meros reales v�lidos hasta ahora: %d%n",numValidos);
                numContabilizados++;
            }
        } catch (Exception ex) {
            System.out.println("N�mero no v�lido");
            System.out.printf("Incorrecto. N�mero descartado. Total de n�meros reales v�lidos hasta ahora: %d%n",numValidos);
            numContabilizados++;
            teclado.nextLine();
        }
        }
        System.out.printf("Total de n�meros v�lidos le�dos %d%n",numValidos);
        
    }//Fina main

}

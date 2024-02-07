package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class Examen2020_1 {

    public static void main(String[] args) {
        final int numRealesAleer = 5;
        final double MIN = 100.0;
        final double MAX = 200.0;
        double sumaTotal = 0.0;
        int contador = 0;//Contador n�meros v�lidos.
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Leer n�meros reales hasta que se hayan le�do 5 en el rango [%.2f a %.2f]%n", MIN, MAX);
        while (contador < numRealesAleer) {
            try {
                System.out.printf("Introduzca un n�mero real comprendido entre [%.2f a %.2f]", MIN, MAX);
                double num = teclado.nextDouble();
                if (num >= MIN && num <= MAX) {
                    contador++;//Incrementamos el contador si el n�mero introducido est� en el rango.
                    System.out.printf("Correcto. Total de n�meros reales v�lidos hasta ahora: %d%n", contador);
                    System.out.printf("El �ltimo n�mero que acabamos de leer es el: %.2f%n", num);
                    sumaTotal+=num;
                } else {
                    System.out.printf("N�mero no v�lido.%nIncorrecto. N�mero descartado.Total de n�meros reales v�lidos hasta ahora:%d%n", contador);
                }
            } catch (Exception ex) {
                System.out.printf("N�mero no v�lido.%nIncorrecto. N�mero descartado.Total de n�meros reales v�lidos hasta ahora:%d%n", contador);
                teclado.nextLine();//Limpiamos.
            }
        }
        System.out.printf("Suma total: %.2f%n", sumaTotal);

    }

}

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
        int contador = 0;//Contador números válidos.
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Leer números reales hasta que se hayan leído 5 en el rango [%.2f a %.2f]%n", MIN, MAX);
        while (contador < numRealesAleer) {
            try {
                System.out.printf("Introduzca un número real comprendido entre [%.2f a %.2f]", MIN, MAX);
                double num = teclado.nextDouble();
                if (num >= MIN && num <= MAX) {
                    contador++;//Incrementamos el contador si el número introducido está en el rango.
                    System.out.printf("Correcto. Total de números reales válidos hasta ahora: %d%n", contador);
                    System.out.printf("El último número que acabamos de leer es el: %.2f%n", num);
                    sumaTotal+=num;
                } else {
                    System.out.printf("Número no válido.%nIncorrecto. Número descartado.Total de números reales válidos hasta ahora:%d%n", contador);
                }
            } catch (Exception ex) {
                System.out.printf("Número no válido.%nIncorrecto. Número descartado.Total de números reales válidos hasta ahora:%d%n", contador);
                teclado.nextLine();//Limpiamos.
            }
        }
        System.out.printf("Suma total: %.2f%n", sumaTotal);

    }

}

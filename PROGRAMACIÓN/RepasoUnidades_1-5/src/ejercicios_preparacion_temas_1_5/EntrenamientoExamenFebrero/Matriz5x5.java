package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Escribe un programa en Java que pida por teclado una cadena de, al menos 25
 * n�meros como m�nimo. Esta cadena s�lo podr� contener n�meros (como m�nimo
 * 25), en otro caso deber� volver a solicitarse la cadena de entrada.
 *
 * El programa deber� implementar la siguiente funcionalidad:
 *
 * 1. Si el total de n�meros excede la cantidad de 25, nos quedaremos con los 25
 * primeros n�meros de la cadena.
 *
 * 2. Estos 25 n�meros se distribuir�n en una matriz de enteros de tama�o 5x5,
 * rellenando su contenido por filas.
 *
 * 3. Se imprimir� el contenido de la matriz generada.
 *
 * 4. Se recorrer� cada fila y se almacenar� la suma de sus valores.
 *
 * 5. Se recorrer� cada columna y se almacenar� la suma de sus valores.
 *
 * 6. Por �ltimo, se comparar� para cada fila y columna cu�l de los dos sumas de
 * valores es mayor y se mostrar� por pantalla.
 *
 * @author Ignacio Rueda
 */
public class Matriz5x5 {
//1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26

    public static void main(String[] args) {
        int contadorDatos = 0;//Para iterar sobre datosEntrada
        int[] sumaFila = new int[5];
        int[] sumaColumna = new int[5];
        final int CANTIDAD_NUMEROS = 25;
        String textoIntroducido = "";
        Scanner teclado = new Scanner(System.in);
        int[][] matrizEnteros = new int[5][5];
        String[] datosEntrada;

        boolean datosCorrectos = false;

        while (!datosCorrectos) {
            System.out.println("Introduce una cadena de al menos 25 n�meros,separados por una coma.");
            //Expresi�n regular para controlar que son n�meros.
            String patron = "([0-9]{1,},?){25,}";
            //Guardamos texto entrada
            textoIntroducido = teclado.nextLine();

            if (textoIntroducido.matches(patron)) {
                datosCorrectos = true;
            }
        }//Final while.
        datosEntrada = textoIntroducido.split(",");
        //RELLENAMOS LA MATRIZ 5 X 5

        for (int n = 0; n < matrizEnteros.length; n++) {
            int sumaFilas = 0;
            int sumaColumnas = 0;
            for (int i = 0; i < matrizEnteros[n].length; i++) {
                matrizEnteros[n][i] = Integer.valueOf(datosEntrada[contadorDatos]);
                contadorDatos++;
                sumaFilas += matrizEnteros[n][i];
                sumaColumna[i] += matrizEnteros[n][i];
            }
            sumaFila[n] = sumaFilas;

        }
        //MOSTRAR DATOS MATRIZ
        System.out.println("MOSTRAR DATOS MATRIZ");
        System.out.println("--------------------");
        for (int n = 0; n < matrizEnteros.length; n++) {
            for (int i = 0; i < matrizEnteros[n].length; i++) {
                System.out.print(matrizEnteros[n][i]);
            }
            System.out.println("");
        }
        //MOSTRAR SUMA FILAS
        System.out.println("MOSTRAR DATOS DE LAS SUMAS DE FILAS Y COLUMNAS:");
        System.out.println("-----------------------------------------------");
        System.out.println(Arrays.toString(sumaFila));
        System.out.println(Arrays.toString(sumaColumna));
        
        //COMPARAR DATOS DE FILAS Y COLUMNAS
        for(int n=0;n<sumaFila.length;n++){
            if(sumaFila[n]>sumaColumna[n]){
                System.out.printf("La suma de mayor valor corresponde a la Fila con un valor de %d%n",sumaFila[n]);
            }else{
            System.out.printf("La suma de mayor valor corresponde a la Columna con un valor de %d%n",sumaColumna[n]);
            }
        }
        

    }//Fin m�todo.

}//Fin clase.

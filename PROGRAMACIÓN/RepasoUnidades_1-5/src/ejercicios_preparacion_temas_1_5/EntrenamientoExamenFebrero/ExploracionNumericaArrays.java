package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
/**
 * Dados dos arrays de 10 elementos que se os proporcionan, escribir un programa
 * en Java que cree un tercer array de tama�o el doble de los anteriores y con
 * el siguiente contenido para su primera mitad: En cada posici�n impar se
 * almacenar� la suma de todos los elementos del primer array hasta esa
 * posici�n. En cada posici�n par se almacenar� la suma de todos los elementos
 * del segundo array hasta esa posici�n. Para la segunda mitad: En cada posici�n
 * impar se almacenar� el doble de la posici�n impar anterior de ese mismo
 * array. En cada posici�n par se almacenar� la suma de las dos posiciones pares
 * anteriores de ese mismo array
 *
 * NOTA: consideramos la posici�n 0 como par . * Por �ltimo, debe proporcionarse
 * la suma de todos los n�meros impares del array resultado.
 *
 * @author Ignacio Rueda
 */
public class ExploracionNumericaArrays {

    public static void main(String[] args) {
        int[] Array1 = {1, 8, 3, 1, 3, 7, 5, 2, 4, 6};
        int[] Array2 = {3, 4, 5, 6, 2, 5, 1, 7, 5, 5};
        int[] Array3 = new int[Array1.length * 2];
        for (int n = 0; n < Array3.length; n++) {
            //PARA LA PRIMERA MITAD

            // En cada posici�n IMPAR se almacenar� la suma de todos los elementos del PRIMER ARRAY hasta esa posici�n.
            if (n > 0 && n % 2 == 1 && n < Array1.length) {
                int suma = 0;
                for (int l = 0; l <= n; l++) {
                    suma += Array1[l];
                    Array3[n] = suma;
                }
            }
            // En cada posici�n PAR se almacenar� la suma de todos los elementos del SEGUNDO ARRAY hasta esa posici�n.
            if (n % 2 == 0 && n < Array2.length) {
                int suma = 0;
                for (int l = 0; l <= n; l++) {
                    suma += Array2[l];
                    Array3[n] = suma;
                }
            }

            //PARA LA SEGUNDA MITAD
            if (n >= Array3.length / 2) {
                int posAnteriorImpar = Array3[n - 2];
                int posAteriorPar = Array3[n - 4];
                //En cada posici�n IMPAR se almacenar� el doble de la posici�n impar anterior de ese mismo array.
                if (n % 2 == 1) {
                    Array3[n] = posAnteriorImpar * 2;
                }
                //n cada posici�n PAR se almacenar� la suma de las dos posiciones PARES anteriores de ese mismo array
                if (n % 2 == 0) {
                    Array3[n] = posAnteriorImpar + posAteriorPar;
                }

            }

        }//Bucle array3

        //Una vez que tenemos creado el ARRAY3, sumamos todos los n�meros impares del array.
        int suma = 0;
        for (int i = 0; i < Array3.length; i++) {
            if (Array3[i] % 2 == 1) {
                suma += Array3[i];
            }
        }

        System.out.println(Arrays.toString(Array3));
        System.out.printf("Suma de todos los n�meros impares del array resultado: %d%n", suma);
    }//Final m�todo main.

}//Final clase.

package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class Examen2022_2 {

    public static void main(String[] args) {
        int array1[] = {1, 8, 3, 1, 3, 7, 5, 2, 4, 6};
        int array2[] = {3, 4, 5, 6, 2, 5, 1, 7, 5, 5};
        int array3[] = new int[array1.length];
        int suma=0;
        System.out.println("EJERCICIO DE ARRAYS");
        System.out.println("-------------------");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("");
        System.out.println("");

        /**
         * En la primera y última posición se almacenarán, respectivamente, el
         * menor y el mayor elemento que se encuentre entre los dos arrays.
         */
        int menorElmentoArray = array1[0];
        int mayorElementoArray = array1[0];
        for (int n = 0; n < array1.length; n++) {
            //Cálculo valores mínimos
            if (array1[n] <= menorElmentoArray) {
                menorElmentoArray = array1[n];
            }
            if (array2[n] <= menorElmentoArray) {
                menorElmentoArray = array2[n];
            }
            //Cálculo valores máximos.
            if (array1[n] >= mayorElementoArray) {
                mayorElementoArray = array1[n];
            }
            if (array2[n] >= mayorElementoArray) {
                mayorElementoArray = array2[n];
            }
            if(n>0 && n<array1.length-1){
                array3[n] = array1[n]+array2[n];
                suma= suma<array3[n]?array3[n]:suma; 
            }
            
            //Almacenamos los valores mínimo y máximo, una vez recorrido el bucle.
            if(n==array1.length-1){
                array3[0] = menorElmentoArray;
                array3[n] = mayorElementoArray;
                suma= suma<array3[n]?array3[n]:suma; 
            }

        }
        
        
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.printf("ARRAY RESULTADO : %s%n", Arrays.toString(array3));
        System.out.printf("MÁXIMO DEL ARRAY RESULTADO %d%n", suma);
    }//Final main
}//Final clase


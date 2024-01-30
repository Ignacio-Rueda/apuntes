package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;
import java.util.Arrays;
/**
 * Escribir un programa en Java que cree un array de enteros de tamaño 10 y
 * llene el array con valores enteros aleatorios entre 0 y 100.
 *
 * Posteriormente, recorre el array y suma, por un lado, los números pares que
 * contenga el array y por otro lado los números impares que contenga el array.
 *
 * Al final, muestra el contenido del array completo y el resultado de las sumas
 * parciales de pares y de impares.
 *
 * @author Ignacio Rueda
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        final int TAMANIOARRAY = 10;
        int sumaPares = 0;
        int sumaImpares = 0;
        int [] arrayEnteros = new int[TAMANIOARRAY];
        //1
        for(int n=0;n<arrayEnteros.length;n++){
            arrayEnteros[n] = (int)(Math.random()*101);
        }
        //2
        for(int n=0;n<arrayEnteros.length;n++){
            //Sumar números pares.
            if(arrayEnteros[n]%2==0){
                sumaPares+=arrayEnteros[n];
            }else{
                sumaImpares+=arrayEnteros[n];
            }
        }
        //3
        System.out.println(Arrays.toString(arrayEnteros));
        System.out.printf("Suma de números pares -> %d Suma de números impares -> %d%n",sumaPares,sumaImpares);
    }

}

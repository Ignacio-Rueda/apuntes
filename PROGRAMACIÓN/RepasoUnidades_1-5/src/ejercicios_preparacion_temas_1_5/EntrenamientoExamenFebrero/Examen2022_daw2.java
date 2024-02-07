package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;
import java.util.Arrays;


/**
 *
 * @author Ignacio Rueda
 */
public class Examen2022_daw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array1[]={1, 8, 3, 1, 3, 7, 5, 2, 4, 6};
        int array2[] = {3, 4, 5, 6, 2, 5, 1, 7, 5, 5};
        int array3[] = new int[array1.length];
        int sumaArray3 = 0;
        System.out.println("EJERCICIO DE ARRAYS");
        System.out.println("-------------------");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        
        for(int n=0;n<array1.length;n++){
            array3[0]+=array1[n]; 
            array3[array3.length-1]+=array2[n];
            
            if(n>0 && n<array1.length-1){
                array3[n]=array1[n]>array2[n]?array1[n]:array2[n];
                sumaArray3+=array3[n];
            }
        }
        
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.printf("Array resultado: %s%n",Arrays.toString(array3));
        System.out.printf("Suma del array resultado: %d%n",sumaArray3 += array3[0]+array3[array3.length-1]);
    }
    
}

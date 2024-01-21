
package ejercicios_preparacion_temas_1_5.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class ArrayBidimensional {

    public static void main(String[] args) {
        //Array irregular.Primera dimensión:5.
        int[][] arrayBi = {{1},{2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15}};
        
        for(int n=0;n<arrayBi.length;n++){
            for (int i = 0; i < arrayBi[n].length; i++) {
                System.out.print(arrayBi[n][i]);
            }
            System.out.println("");
        }
        
    }
    
}

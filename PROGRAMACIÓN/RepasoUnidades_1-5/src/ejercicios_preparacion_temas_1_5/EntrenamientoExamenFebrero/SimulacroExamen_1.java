
package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;
import java.util.Arrays;
/**
 *
 * @author Ignacio Rueda
 */
public class SimulacroExamen_1 {

    public static void main(String[] args) {
        int[]miArray = new int[20];
        
        for(int n=0;n<miArray.length;n++){
            //Si estamos en la primera posici�n. Rellenar con un n�mero aleatorio.
            if(n==0){
                miArray[n] = (int)(Math.random()*10);
            }else{//se rellenar�n con un n�mero aleatorio mayor o igual al de la posici�n anterior
              int valorAnterior = miArray[n-1];       
              //Solo habr� una excepci�n a esta regla, si el n�mero justo anterior es 9, situaci�n en la cual el n�mero podr� ser cualquiera entre 0 y 9.
              if(valorAnterior == 9){
                  miArray[n]=(int)(Math.random()*10);
              }else{
                     miArray[n]=(int)(valorAnterior+Math.random()*(10-valorAnterior));
              }
            }//Final else
        }//Final for
        System.out.printf(Arrays.toString(miArray));
    }
    
}
//"{8 9 5 8 9 0 6 6 7 8 8 8 9 5 9 1 3 8 9 7}"
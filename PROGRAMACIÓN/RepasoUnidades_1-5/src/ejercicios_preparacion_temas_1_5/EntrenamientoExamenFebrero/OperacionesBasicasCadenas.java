
package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;
import java.util.Scanner;
/**
 *
 * @author Ignacio Rueda
 */
public class OperacionesBasicasCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resultado = "";
        boolean noValido = true;
        Scanner teclado = new Scanner (System.in);
       do{
        System.out.println("Introduca el nombre (máximo diez caracteres y mínimo uno):");
        resultado = teclado.nextLine();
        boolean mayusMin = false;
        for(int n=0;n<resultado.length()&&!mayusMin;n++){
            if(n>0 && Character.isUpperCase(resultado.charAt(n))){
                mayusMin = true;
            }
        }
        if((resultado.length()<1 || resultado.length()>10) || Character.isLowerCase(resultado.charAt(0)) || mayusMin){
            System.out.println("ERROR:El nombre debe tener como como mínimo un carácter y como máximo diez, debe comenzar por letra mayúscula y el resto deben ser minúsculas..");
            noValido = true;
        }else{
            noValido =false;
        }
        } while(resultado.length()<1 || resultado.length()>10 || noValido);
      
    }
    
}

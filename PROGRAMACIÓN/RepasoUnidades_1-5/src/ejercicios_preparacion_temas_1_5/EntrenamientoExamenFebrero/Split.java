
package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 *
 * @author Ignacio Rueda
 */
public class Split {

    public void saludar(String...nombres){
        int cantidad = nombres.length;
    }
    public static void main(String[] args) {
        String texto = "Nacho|Rueda|delgado|34";
        StringTokenizer token = new StringTokenizer(texto, "|");
        int cantidad = token.countTokens();
            for(int n=0;n<cantidad;n++){
                System.out.println(token.nextToken());
            }
    }
    
}

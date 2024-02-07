package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;
import java.util.Scanner;
/**
 *
 * @author Ignacio Rueda
 */
public class OperacionesAvanzadasCadenas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el texto");
        String texto = teclado.nextLine();
        
        String textoBuscado = "mal";
        
        if(texto.trim().toLowerCase().startsWith("mal")){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        System.out.println(texto.replace("mal", "-*-"));
    }
    
}

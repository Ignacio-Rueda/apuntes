package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class OperacionesAvanzadasCadenas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String texto = "malsolmaldadmalmmmmmm";
        int contador = 0;
        int pos = -1;
        do {
            pos = texto.indexOf("mal", pos + 1);
            if(pos!=-1){
                contador ++;
            }

        } while (pos >= 0);
        System.out.println(contador);
    }

}

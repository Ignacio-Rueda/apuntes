package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class ObtencionSubcadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String textoIntr = "";
        Scanner teclado = new Scanner(System.in);
        boolean espaciosIniFin = false;
        boolean hayEpacio = false;
        do {
            espaciosIniFin = false;
            hayEpacio = false;
            System.out.println("Introduzca un nombre formado por dos palabras en minúscula separadas por un espacio:");
            textoIntr = teclado.nextLine();
            if (textoIntr.charAt(0)==' ' || textoIntr.charAt(textoIntr.length()-1)==' '){
                espaciosIniFin = true;
            }
            textoIntr = textoIntr.trim();

            for (int n = 0; n < textoIntr.length(); n++) {
                if (textoIntr.charAt(n) == ' ') {
                    hayEpacio = true;
                }
            }
          
        } while (!hayEpacio || espaciosIniFin);
    }

}

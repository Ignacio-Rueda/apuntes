package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio Rueda
 */
public class Examen2021_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("VALIDADOR DE NÚMEROS DE SERIE");
        System.out.println("-----------------------------");

        String[] entradaDatos = {"ZA-2000", "XAZ2000", "XA2000", "XA-1969", "YH-1969", "XQ-1970", "XJ-2002", "YV-2021", "XB-2022", "YV-2022", "YA-1970", "YH-2002", "XB-2021"};
        String[] saldiaDatos = new String[entradaDatos.length];

        String patron = "[XY][A-Z]-(19[7-9][0-9]|20([0-1][0-9]|2[0-1]))";
        for (int n = 0; n < entradaDatos.length; n++) {
            if (entradaDatos[n].matches(patron)) {
                StringTokenizer token = new StringTokenizer(entradaDatos[n], "-");
                String codigo = token.nextToken();
                int anio = Integer.parseInt(token.nextToken());
                if (anio % 2 == 0 && codigo.charAt(0) == 'Y' || anio % 2 != 0 && codigo.charAt(0) == 'X') {
                    System.out.println(entradaDatos[n]);
                    System.out.println(anio);
                    System.out.println(codigo);
                    saldiaDatos[n] = "válido";
                } else {
                    saldiaDatos[n] = "inválido";
                }
            } else {
                saldiaDatos[n] = "inválido";
            }
        }
        
        System.out.println(Arrays.toString(saldiaDatos));
    }

}

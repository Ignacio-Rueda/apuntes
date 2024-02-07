package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio Rueda
 */
public class Examen2020_2 {

    public static void main(String[] args) {
        String entradaDatos[] = {"234/24", "24/234", "31/531", "ABCD/ABCD", "ABC/CBA", "23456/65432", "23/23", "32/23", "23/32", "32/32", "0/0", "122/122", "3301/1033"};
        String arraySalida[] = new String[entradaDatos.length];

        String patron = "[0-9]+/[0-9]+";
        StringTokenizer separador;
        for (int n = 0; n < entradaDatos.length; n++) {
            if (entradaDatos[n].matches(patron)) {
                separador = new StringTokenizer(entradaDatos[n], "/");
                StringBuilder strIzq = new StringBuilder(separador.nextToken());
                StringBuilder strDer = new StringBuilder(separador.nextToken());
                int izq = Integer.valueOf(strIzq.toString());
                int der = Integer.valueOf(strDer.toString());
                //Si la primera parte es un número par, entonces la segunda parte tiene que ser exactamente igual que la primera.
                if (izq % 2 == 0 && izq == der) {
                    arraySalida[n] = "Sí";
                } else if (izq % 2 !=0 && strDer.reverse().toString().equals(strIzq.toString())) {//Si la primera parte es un número impar, entonces la segunda parte tiene que ser exactamente el inverso de la primera (?capicúa?).
                    arraySalida[n] = "Sí";
                } else {
                    arraySalida[n] = "No";
                }

            } else {
                arraySalida[n] = "No";
            }

        }
        System.out.println(Arrays.toString(arraySalida));
        
      

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class CalculoPuntuaciones {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        String anotaciones[] = {
            "a",
            "a-b",
            "X-A",
            "O-O-B",
            "X--X",
            "O-X-",
            "-X-X",
            "O-X-O-X-O",
            "o",
            "O-o",
            "X",
            "o-x-o",
            "x",
            "x-x",
            "O-x-X",
            "X-X-X",
            "x-X-X-x"
        };
        System.out.println(Arrays.toString(anotaciones));
        //Anotación válida.
        //[XxOo]
        String patron = "[XxOo](-[XxOo]){0,3}";
        int puntos;
        int puntuaciones[] = new int[anotaciones.length];
        int anotacionesValidas = 0;
        int anotacionesInvalidas = 0;

        for (int n = 0; n < anotaciones.length; n++) {
            if (anotaciones[n].matches(patron)) {
                anotacionesValidas++;
                String[] linea = anotaciones[n].split("-");
                puntos = 0;
                for (int x = 0; x < linea.length; x++) {
                    if (linea[x].equals("X") || linea[x].equals("x")) {
                        puntos++;
                    }
                }
            } else {
                anotacionesInvalidas++;
                puntos = -1;
            }
            puntuaciones[n] = puntos;
        }
        System.out.println(Arrays.toString(puntuaciones));
        System.out.println("Anotaciones válidas: " + anotacionesValidas);
        System.out.println("Anotaciones inválidas: " + anotacionesInvalidas);

    }

}

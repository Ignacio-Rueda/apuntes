/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class PalabrasInvertidas {

    public static void main(String[] args) {

        String palabras[] = {
            "Reconocer",
            "AMANECER",
            "Esto no es un palindromo",
            "Dabale arroz a la zorra el abad.",
            "A man, a plan, a canal: Panama.",
            "A man a plan and a canal, Panama.",
            "No deseo ese don..."
        };
        String palabrasEliminarEspacios[] = new String[palabras.length];
        StringBuilder invertidas[] = new StringBuilder[palabras.length];

        System.out.println("RECONOCIMIENTO DE PALÍNDROMOS");
        System.out.println("-----------------------------");
        System.out.println("Los textos que vamos a analizar son:");

        //Recorrer array.
        for (int n = 0; n < palabras.length; n++) {
            System.out.printf("%s%d%s%s%n", "-Texto ", n, ": ", palabras[n]);
        }

        //Eliminar espacios y signos de puntuación.
        String linea[];

        for (int n = 0; n < palabras.length; n++) {
            String p = palabras[n];/*.replace(",", " ").replace(":", "").replace(".", "")*/;
            linea = p.split("[' ',.;:]+");
            StringBuilder add = new StringBuilder("");
            for (int l = 0; l < linea.length; l++) {
                StringBuilder str = new StringBuilder(linea[l]).reverse();
                add.append(str.append(" "));
            }

            invertidas[n] = add;
        }

        System.out.println("RESULTADOS OBTENIDOS");
        System.out.println("--------------------");
        for (int i = 0; i < invertidas.length; i++) {
            System.out.printf("%s%d%s%s%s%n", "Texto ", i + 1, ":\"", palabras[i], "\"");
            System.out.printf("%s%s%s%n", "Palabras invertidas: \"", invertidas[i], "\"");
        }

    }

}

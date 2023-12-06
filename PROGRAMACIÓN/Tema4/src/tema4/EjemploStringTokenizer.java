/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class EjemploStringTokenizer {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una serie de palabras separadas por una ,");
        String texto = teclado.nextLine();

        StringTokenizer tokens = new StringTokenizer(texto, ",");
        do {
            System.out.println(tokens.nextToken().trim());
        }while(tokens.hasMoreTokens());
        
    }

}

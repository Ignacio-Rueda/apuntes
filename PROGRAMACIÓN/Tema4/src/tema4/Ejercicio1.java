/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        /*Escribe un programa que solicite por teclado un nombre cuya longitud 
    debe ser como mínimo de una letra y como máximo de diez. Si el nombre introducido no cumple
    esos criterios, debe mostrarse un mensaje de error y volver a solicitarse hasta que en efecto se cumpla esa regla.
        Además la primera letra del nombre debe ser en mayúscula.
        El resto de caracteres deben estar en minúscula.
         */

        //Declaración de variables
        String nombre;
        boolean apto=false;
        boolean minus = true;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Inserta un nombre con un mínimo de un carácter y un máximo de diez.");
            nombre = teclado.nextLine();
            for(int n=1;n<nombre.length();n++){
                if(nombre.charAt(n)<'a' || nombre.charAt(n)>'z'){
                    minus=false;
                }
                
            }
            if ((nombre.length() > 0 && nombre.length() <= 10) && (nombre.charAt(0)>='A' && nombre.charAt(0)<='Z') && minus ) {
                apto = true;
                
            } else {
                System.out.println("Error: nombre no válido");
            }
        }while(!apto);
 
        
    
    
    }
}

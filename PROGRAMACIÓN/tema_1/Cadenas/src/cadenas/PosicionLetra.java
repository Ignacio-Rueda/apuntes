/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenas;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class PosicionLetra {
    public static void main(String [] args){
        System.out.println("Bienvenido, introduce una palabra");
        
        Scanner teclado = new Scanner (System.in);
        String palabra;
        palabra = teclado.nextLine();
        
        char ultimaLetra = palabra.charAt(palabra.length()-1);
        System.out.println("La última letra es: "+ultimaLetra);
        char primeraLetra = palabra.charAt(0);
        System.out.println("La primera letra es: "+primeraLetra);
    
    
    }
    
}

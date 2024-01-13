/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Ignacio Rueda
 */
public class Pruebas {

    public static void main(String[] args) {
        StringBuilder miCadena = new StringBuilder ("Nacho");
        miCadena.append(" Rueda");
        miCadena.replace(5,6,"-");
        miCadena.delete(2, 140);
        System.out.println(miCadena);
        
    }
    
}

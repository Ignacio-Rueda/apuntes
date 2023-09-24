/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

/**
 *
 * @author Ignacio
 */
public class Operadores {

    /**
     *Una factoría papelera confecciona cuadernos en los que se van alternando hojas de color rojo y verde. 
     * Siempre se comienza por el color rojo, siguiéndole el verde y comenzando nuevamente con el rojo.
        Implementar un programa en Java que calcule, para un cuaderno de 20 hojas, cuántas hojas contiene de cada color.
        Implementar un programa en Java que calcule, para un cuaderno de 61 hojas, cuántas hojas contiene de cada color.
     */
    public static void main(String[] args) {
     int numHojas = 61;
     int hojaVerde = numHojas/2;
     int hojasRojas = numHojas/2 + (numHojas%2);
     
        System.out.println(hojaVerde);
        System.out.println(hojasRojas);
    }
    
}

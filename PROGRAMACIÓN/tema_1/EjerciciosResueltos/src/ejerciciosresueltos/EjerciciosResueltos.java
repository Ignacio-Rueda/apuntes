/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosresueltos;

/**
 *
 * @author Ignacio
 */
public class EjerciciosResueltos {

    /**
     * @param args the command line arguments
     */
    public enum Baraja{OROS,COPAS,ESPADAS,BASTOS};
    public static void main(String[] args) {
        System.out.println("PALOS DE LA BARAJA ESPAÑOLA");
        System.out.println("---------------------------");
        System.out.println("Palo 1: "+Baraja.OROS);
        System.out.println("Palo 2: "+Baraja.COPAS);
        System.out.println("Palo 3: "+Baraja.ESPADAS);
        System.out.println("Palo 4: "+Baraja.BASTOS);
    }
    
}

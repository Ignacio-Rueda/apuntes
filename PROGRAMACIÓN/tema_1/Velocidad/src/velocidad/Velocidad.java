/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package velocidad;
import java.util.Scanner;
/**
 *
 * @author Ignacio
 */
public class Velocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velocidad en kilometros por hora");
        double velocidad = scanner.nextDouble();
        System.out.println("Tiempo en segundos");
        int segundos = scanner.nextInt();
        
        double distanciaKM = velocidad*(segundos/3600.0);
        double distanciaM = distanciaKM*1000;
        
        System.out.println("Distancia recorrida en kilomeros: "+distanciaKM);
        System.out.println("Distancia recorrida en metros: "+distanciaM);
    }
    
}

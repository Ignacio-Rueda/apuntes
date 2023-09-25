/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class CondicionalParImpar {
    
    public static void main(String [] args){
        /*
        Sabemos si un número es par o impar (divisible entre dos) si el resto de la división entera de ese número entre dos es cero o uno.
        Escribe un programa en Java que pida un número entero al usuario e indique si ese número es par o impar.
        */
    
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número enter por favor");
        int num = teclado.nextInt();
        
        String parImpar;
        parImpar = (num % 2 == 0)?"El número introducido es par":"El número introducido es impar";
        
        System.out.println(parImpar);
    }
    
}

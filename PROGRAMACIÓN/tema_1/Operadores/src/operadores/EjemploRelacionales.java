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
public class EjemploRelacionales {
    public static void main(String[]args){
    
    Scanner teclado = new Scanner (System.in);
    
    int x,y;
    String cadena;
    boolean resultado;
    
    System.out.println("Intoducir el primer número");
    x = teclado.nextInt();
    
    System.out.println("Introducir el segundo número");
    y = teclado.nextInt();
    
    //Realizamos las comparaciones y las mostramos por pantalla
    
    cadena=(x==y)?"iguales":"distintos";
    
    System.out.printf("Los números %d y %d son %s\n",x,y,cadena);//%d Marcador de posición para un número entero %s Maracador de posición para un String \n Salto de línea  
    
    //Realizamos las comparaciones y las mostramos por pantalla
    
    resultado = (x!=y);
    System.out.println("x != y es "+resultado);
    
    resultado = (x < y);
    System.out.println("x < y es "+resultado);
            
    
    resultado = (x > y);
    System.out.println("x > y es "+resultado);
            
    
    resultado = (x <= y);
    System.out.println("x <= y es "+resultado);
    
    resultado = (x >= y);
    System.out.println("x >= y es "+resultado);
            
            
    
    }
}

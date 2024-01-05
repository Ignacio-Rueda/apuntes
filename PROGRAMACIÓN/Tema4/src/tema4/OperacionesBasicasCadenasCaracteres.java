/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

/**
 *
 * @author Ignacio Rueda
 */
public class OperacionesBasicasCadenasCaracteres {

   
    public static void main(String[] args) {
        String cad = "¡Bienvenido!";
        
        //Contiene la longitud de una cadena.
        System.out.println(cad.length());
        
        //Devuele el carácter ubicado en la posición indicada.
        System.out.println(cad.charAt(1));
        
        //Extraer una subacadena de otra de mayor tamaño.
        System.out.println(cad.substring(3));
        System.out.println(cad.substring(1,3));
        
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas;

/**
 *
 * @author Ignacio
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cadenas de ejemplo con las que trabajar
        String cadena1 = "CICLO DAM-DAW";
        String cadena2 = "ciclo dam-daw";
        
        System.out.println("EJEMPLOS DE OPERACIONES CON CADENAS");
        System.out.println("-----------------------------------");
        
        //Mostramos las cadenas originales
        System.out.println("La cadena cadena1 es "+cadena1);
        System.out.println("La cadena cadena2 es "+cadena2);
        System.out.println();
        
        //Mostramos el tamaño de cada cadena
        System.out.println("Longitud cadena1 "+cadena1.length());
        System.out.println("Longitud cadena2 "+cadena2.length());
        
        //Concatenar cadenas (concat o bien operador +)
        System.out.println("Concatenación cadena1 y cadena2 "+ cadena1.concat(cadena2));
        System.out.println("Concatenación cadena2 y cadena1 "+cadena2+cadena1);
        
        //Comparaciñon de cadenas
        System.out.println("cadena1.equals(cadena2) es"+cadena1.equals(cadena2));
        System.out.println("cadena1.equalsIgnoreCase(cadena2) es "+cadena1.equalsIgnoreCase(cadena2));
    
        //Obtención de subcadenas
        System.out.println("cadena1.substring(0,5) es "+cadena1.substring(0,5));
        
        //Pasar a minúscula
        System.out.println("cadena1.toLowerCase() es "+cadena1.toLowerCase());
        System.out.println();
        
        //Conversiones
        int valorNum = 30;
        String valorCadena = String.valueOf(valorNum);
        valorCadena = valorCadena.concat("Valor en cadena");
        System.out.println(valorCadena);
        
        //Obtención del caracter
        String palabra = "Ejemplo";
        char ultimaLetra = palabra.charAt(palabra.length()-1);
        System.out.println(ultimaLetra);
        
    
    
    
    
    }   
    
}

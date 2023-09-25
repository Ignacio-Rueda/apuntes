/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritemeticas;

/**
 *
 * @author Ignacio
 */
public class OperacionesAritemeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dada la variable d1 tipo double inicializada a 10 y la variable d2 también tipo double inicializada a 20, realiza las siguientes operaciones aritméticas y muestra el resultado por pantalla:

        Restamos 4 al doble de d1.
        Restamos 4 a d1 y calculamos el doble.
        Sumamos 2 a d1 y dividimos por 12, a todo ello sumamos d2.
        Dividimos d2 entre d1, y todo ello dividido entre 2.
        Dividimos d2 entre la mitad de d1.
        Restamos a d2 un cuarto de d1.
        Restamos d1 a d2, y todo ello lo dividimos entre 4.
        Dividimos d2 entre d1, y todo ello lo multiplicamos por 2.
        Dividimos d2 entre el doble de d1.
        Restamos al doble de d2 un cuarto de d1.
        Multiplicamos d2 por 100 menos d1.
        Multiplicamos d2 por 50 mas d1, y todo ello lo dividimos por 10.
        En este ejercicio es importante que intentes minimizar el uso de paréntesis, usándolos solo cuando sean necesarios
        */
        
        
        double d1 = 10;
        double d2 = 20;
        //Restamos 4 al doble de d1.
        double resultado = d1*2 - 4;
        System.out.println(resultado);
        
        //Restamos 4 a d1 y calculamos el doble.
        resultado = (d1-4) *2;
        System.out.println(resultado);
        
        //Sumamos 2 a d1 y dividimos por 12, a todo ello sumamos d2.
        resultado = (2+d1)/12 +d2;
        System.out.println(resultado);
        
        //Dividimos d2 entre d1, y todo ello dividido entre 2.
        resultado = d2/d1/2;
        System.out.println(resultado);
        
        //Dividimos d2 entre la mitad de d1.
        resultado = d2/(d1/2);
        System.out.println(resultado);
        
        // Restamos a d2 un cuarto de d1.
        resultado = d2-d1/4;
        System.out.println(resultado);
        
        // Dividimos d2 entre d1, y todo ello lo multiplicamos por 2.
        resultado = d2/d1 *2;
        System.out.println(resultado);
        
        //Dividimos d2 entre el doble de d1.
        resultado = d2/(2*d1);
        System.out.println(resultado);
        
        //Restamos al doble de d2 un cuarto de d1.
        resultado = 2*d2 - d1/4;
        System.out.println(resultado);
        
        //Multiplicamos d2 por 100 menos d1.
        resultado=d2*(100 -d1);
        System.out.println(resultado);
        
        //Multiplicamos d2 por 50 mas d1, y todo ello lo dividimos por 10.
        resultado = d2*(50+d1)/10;
        System.out.println(resultado);
        
        
        
        
        
        
        
    }
    
}

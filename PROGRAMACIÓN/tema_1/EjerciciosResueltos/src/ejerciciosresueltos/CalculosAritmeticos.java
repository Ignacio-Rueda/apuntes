/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosresueltos;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
/**
 *Escribe un programa en Java que solicite dos números reales y lleve a cabo los siguientes cálculos:
    el doble del primer número,
    la mitad del segundo número,
    el cuadrado de la suma de ambos números,
    La décima parte de la suma los cuadrados de ambos números.
    Para ello tendrás que utilizar operadores aritméticos tales como la suma, 
    el producto o la división. Además, es posible que en algunos casos necesites hacer uso de los paréntesis.
 * 
 */
public class CalculosAritmeticos {
    
    public static void main(String[]args){
        //---------------------------
        //    DECLARACIÓN DE VARIABLES
        //----------------------------
        //Constantes
        
        //Variables de entrada
        double numA, numB;
        //Variables de salida
        double resultadoA,resultadoB,resultadoC,resultadoD;
        
        //Variables auxiliares
        
        //Clase Scanner para petición de datos
        Scanner teclado = new Scanner (System.in);
        
        //---------------------------------
        //    ENTRADA DE DATOS
        //---------------------------------
        
        System.out.println("Introduce el primer número real");
        numA = teclado.nextDouble();
        
        System.out.println("Introduce el segundo número real");
        numB = teclado.nextDouble();
       
        //--------------------------
        //   PROCESAMIENTO
        //--------------------------
        
        //El doble del primer número.
        resultadoA = numA*2;
        //La mitad del segundo número
        resultadoB = numB/2;
        //El cuadrado de la suma de ambos números
        resultadoC = (numA+numB)*(numA+numB);
        // La décima parte de la suma los cuadrados de ambos números.
        resultadoD = (numA*numA + numB*numB)/10;
        
        //-----------------------------
        //       SALIDA DE RESULTADOS
        //-----------------------------
        System.out.println("Resultados");
        System.out.println("----------");
        System.out.println(resultadoA);
        System.out.println(resultadoB);
        System.out.println(resultadoC);
        System.out.println(resultadoD);
        
        
        
        
    }
}

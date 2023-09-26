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
public class AnalisisNumero {
    
    public static void main(String [] args){
        /*
        Escribe un programa en Java que solicite un número entero (sin decimales) 
        y lo analice averiguando lo siguiente:
        si es cero,
        si es positivo,
        si es menor que cien,
        si es par.
        */
        
       //------------------------
       //DECLARACIÓN DE VARIABLES
       //------------------------
       //Variables de entrada
        int numEntry;
       //Variables de salida
        boolean esCero,esPositivo,esMenorAcien,esPar;
       //Constantes
       //Variables auxiliares
       
       //Crear clase Scanner
       Scanner teclado = new Scanner (System.in);
       //----------------------
       //Introducción de datos
       //----------------------
        System.out.println("Introduce un número entero");
        numEntry = teclado.nextInt();
       //-----------------------
       //PROCESAMIENTO
       //-----------------------
       esCero = numEntry==0;
       esPositivo = numEntry>0;
       esMenorAcien = numEntry<100;
       esPar = numEntry%2==0;
       //-----------------------
       //SALIDA DE DATOS
       //-----------------------
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println();
        System.out.println("El número es cero "+esCero);
        System.out.println("El número es positivo "+esPositivo );
        System.out.println("El número es menor a cien "+esMenorAcien);
        System.out.println("El número es par "+esPar);
    }
    
}

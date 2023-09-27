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
public class CuadernoColores {
    
    public static void main(String [] args){
       
        /*
        Una factoría papelera confecciona cuadernos en los que se van alternando hojas de color rojo, verde y azul.
        Siempre se comienza por el color rojo, siguiéndole el verde, luego el azul y comenzando nuevamente con el rojo.
        Por ejemplo, si un cuaderno está compuesto por 100 hojas, 34 serían de color rojo, 33 de color verde y 
        33 de color azul.
        Sin embargo, si el cuaderno tuviera 200 hojas, 67 serían de color rojo, 67 de color verde y 66 de color azul.
        Por otro lado, si el cuaderno tuviera 201 hojas, 67 serían rojas, 67 verdes y 67 azules.
        */
        
        
        
        //------------------------
        //DECLARACIÓN DE VARIABLES
        //------------------------
        //Variables de entrada
        int numHojas;
        //Variables de salida
        int hojasRojo,hojasVerde,hojasAzul;
        //Constantes
        //Variables auxiliares
        int restoHojas;
        //Instaciar clase Scanner
        Scanner teclado = new Scanner (System.in);
       
        //--------------------------
        //ENTRADA DE DATOS
        //--------------------------
        System.out.println("Por favor introduzca el número de hojas");
        numHojas = teclado.nextInt();
        
        //-------------------------
        //PROCESAMIENTO
        //-------------------------
        restoHojas = numHojas%3;//Módulo 3 porque son 3 tipos de hojas
        hojasRojo = numHojas/3;
        hojasVerde = numHojas/3;
        hojasAzul = numHojas/3;
        //Si el resto de hojas es 1, lo añadimos como hojas rojas y si es dos, lo añadimos como hojas verdes
        hojasRojo =(restoHojas>0)?hojasRojo+=1:hojasRojo+0;
        hojasVerde = (restoHojas>1)?hojasVerde+=1:hojasVerde+0;
        
        //-------------------------
        //SALIDA DE DATOS
        //-------------------------
        System.out.println("El número de hojas rojas es: "+hojasRojo);
        System.out.println("El número de hojas verdes es: "+hojasVerde);
        System.out.println("El número de hojas azúles es: "+hojasAzul);
    }
    
}

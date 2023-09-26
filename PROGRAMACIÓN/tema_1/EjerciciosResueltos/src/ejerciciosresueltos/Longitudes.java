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
public class Longitudes {
    
    public static void main(String[]args){
    //-------------------------
    //DECLARACIÓN DE VARIABLES
    //-------------------------
    //Variables de entrada
    double longitudMetros;
    //Variables de salida
    double siDm, siCm, siMm, siPulgada, siPie, siYarda;
    //Constantes
    final double DM = 10;
    final double CM = 100;
    final double MM = 1000;
    final double PULGADA = 2.54; //2.54 Centímetros
    final double PIE = 12; //12 x pulgada
    final double YARDA = 3;//3 x pie

    //Variables auxiliares
    double longitudCent;
    //Clase Scanner para entrada de datos
    Scanner teclado = new Scanner (System.in);
    
    //----------------
    //ENTRADA DE DATOS
    //----------------
        System.out.println("Introduzca una longitud en metros");
        longitudMetros = teclado.nextDouble();
    //----------------
    //PROCESAMIENTO
    //----------------
    siDm = longitudMetros * DM;
    siCm = longitudMetros * CM;
    siMm = longitudMetros * MM;
    //Como la entrada de datos es en metros, la pasamos a cm
    longitudCent = longitudMetros *100;
    
    siPulgada = longitudCent / PULGADA;
    siPie = siPulgada / PIE;       
    siYarda = siPie / YARDA;

    
    
    
    
    //----------------
    //SALIDA DE DATOS
    //----------------
    System.out.println("RESULTADO");
    System.out.println("---------");
    System.out.println("");
    System.out.println("SISTEMA INTERNACIONAL");
    System.out.println("---------------------");
    System.out.println("La media "+longitudMetros+" en metros son:");
    System.out.println(siDm + " Decímetros");
    System.out.println(siCm + " Centímetros");
    System.out.println(siMm + " Milímetros");
    
    System.out.println();
    
    System.out.println("SISTEMA ANGLOSAJÓN");
    System.out.println("---------------------");
    System.out.println("La media "+longitudMetros+" en metros son:");
    System.out.println(siPulgada + " Pulgadas");
    System.out.println(siPie + " Pies");
    System.out.println(siYarda + " Yardas");
    
    
    }
    
}

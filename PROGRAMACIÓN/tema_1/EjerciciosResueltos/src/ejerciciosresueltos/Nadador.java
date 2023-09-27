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
public class Nadador {
    
    public static void main(String [] args){
    
       /*
        Un nadador entrena en la piscina haciendo un largo de ida a estilo crol, un largo de vuelta a estilo espalda,
        y así sucesivamente.

        Escribe un programa en Java que solicite al usuario la cantidad de largos que ha recorrido el nadador y 
        la longitud de la piscina en la que ha entrenado (en metros). El programa debe calcular e indicar: la cantidad 
        total de metros que ha nadado en cada estilo así como la longitud total que ha recorrido nadando (en kilómetros). 
        */
       
       
       //---------------------
       //DECLARACIÓN DE VARIABLES
       //---------------------
       //Variables de entrada
       int numeroLargos;
       double metrosPiscina;
       //Variables de salida
       double longitudNadandoKm;
       int estiloCrol; //Número de Idas
       int estiloEspalda1, estiloEspalda2; //Número de Vueltas
       int estiloBrazo;
       double numMetrosCrol, numMetrosEspalda,numMetrosBrazo;
       double longitudPiscina;
       //Constantes
       //Variables auxiliares
       boolean esPar;
       
       //Instanciar clase Scanner
        
       Scanner teclado = new Scanner(System.in);
       
       //-------------------------
       //INTRODUCCIÓN DE DATOS
       //-------------------------
        System.out.println("Por favor indique número de largos");
        numeroLargos = teclado.nextInt();
        System.out.println("Por favor indique longitud de la piscina en metros");
        longitudPiscina =teclado.nextDouble();
       
       //-------------------------
       //PROCESAMIENTO
       //-------------------------
       //Conocer si el número de largos es par
        esPar = numeroLargos%2==0;
        //Estilo Crol -> Ida
        estiloCrol = (esPar==false)?numeroLargos/4 + 1: numeroLargos/4;
        //Estilo Brazo
        estiloBrazo = (esPar==false)?numeroLargos/4 + 1: numeroLargos/4;
        //Estilo Espalda1
        estiloEspalda1 = (esPar==false)?numeroLargos/4 + 1: numeroLargos/4;
        //Estilo Espalda2
        estiloEspalda2 = numeroLargos/4;
        //Calculamos metros nadados por cada estilo
        numMetrosCrol = estiloCrol * longitudPiscina;
        numMetrosBrazo = estiloBrazo * longitudPiscina;
        numMetrosEspalda = (estiloEspalda1+estiloEspalda2) * longitudPiscina;
        //Calculamos km totales nadados
        longitudNadandoKm = (numeroLargos * longitudPiscina)/1000;
        
       //-------------------------
       //SALIDA DE DATOS
       //-------------------------
        System.out.println("Se han nadado "+numMetrosCrol+" metros estilo crol");
        System.out.println("Se han nadado "+numMetrosBrazo+" metros estilo brazo");
        System.out.println("Se han nadado "+numMetrosEspalda+" metros estilo espalda");
        System.out.println("Se han nadado un total de "+longitudNadandoKm+" kilómetros");

    
    }
    
}

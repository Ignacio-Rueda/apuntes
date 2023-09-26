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
public class VolumenPiramide {
    
    public static void main(String[]args){
    /*
    El volumen de una pirámide se calcula con la siguiente fórmula:
        volumen = 1/3 *B*h
    Volumen es igual a un tercio del area de la base por la altura.
    En la fórmula anterior, B corresponde con el área de la base y h corresponde con la altura de la pirámide. 
    Crea un programa que, dado el tamaño del lado de la base L y la altura h, calcule el volumen.
    Nota: ten en cuenta que la base (B) es un cuadrado, por lo que primero deberás calcular el area B partiendo 
    del tamaño del lado (L).
    Escribe un programa en Java que solicite la altura y la longitud del lado (en metros) de una pirámide de base 
    cuadrángular y calcule su volumen en metros cúbicos.
    Después de realizar ese cálculo, muestra a cuántas piscinas olímpicas equivale dicho volumen, 
    teniendo en cuenta que una piscina olímpica tiene 2500 metros cúbicos.    
    */
    
    //------------------------
    //DECLARACIÓN DE VARIABLES
    //------------------------
    //Constantes
    double piscinaOlimpica = 2500;
    //Variables de entrada
    double altura;
    double lado;
    //Variables de salida
    double volumen;
    int numPiscinas;
    //Variables auxiliares
    double base;
    
    //Clase scanner para petición de datos
    Scanner teclado = new Scanner(System.in);
    //----------------
    //ENTRADA DE DATOS
    //----------------
        System.out.println("Introduzca el lado de la pirámide en m");
        lado = teclado.nextDouble();
        System.out.println("Intrduzca la altura de la pirámide en m");
        altura = teclado.nextDouble();
    //-------------
    //PROCESAMINETO
    //-------------
    base = lado*lado;
    volumen = 1.0/3.0 *(base*altura);
    numPiscinas = (int) (volumen/piscinaOlimpica);

    //---------------------
    //SALIDA DE RESULTADOS
    //---------------------
        System.out.println("Volumen de la pirámide"+volumen+"metros cúbicos \n"+"Equivale aproximadamente"
        + " a:"+numPiscinas+" piscinas olímpicas");
        
    }
}

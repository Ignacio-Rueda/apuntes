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
public class ConcursoTv {
    public static void main(String[]args){
    /*
    Para un concurso de TV se solicitan personas cuyo nombre comience y termine por la misma letra,
    y además sus apellidos tengan la misma cantidad de letras.

    Escribe un programa en Java que reciba como entradas el nombre, el primer apellido y el segundo 
    apellido de una persona y muestre por pantalla:
    "La persona es APTA para el concurso" si es apta para participar en el concurso.
    "La persona es NO APTA para el concurso" si no lo es.
    La primera letra del nombre y de los apellidos debe escribirse en mayúscula y el resto en minúscula. 
    No se admiten acentos ni eñes.
    */   
    //-------------------------
    //DECLARACIÓN DE VARIABLES
    //-------------------------
    //Variables de entrada
    String nombre,primerApellido,segundoApellido;
    //Variables de salida
    String resultado;
    //Variables auxiliares
    char primeraLetra;
    char ultimaLetra;
    int numCharPrimerAp;
    int numCharSegundoAp;
    boolean resultadoLetras;
    boolean resultadoCantidadLetras;
    //Constantes
    int NUMC = 32; //Diferencia entre caracteres de mayúscula a minúscula;
    
    //Declaración clase scanner
    Scanner teclado = new Scanner (System.in);
    
    //------------------------
    //ENTRADA DE DATOS
    //------------------------
    System.out.println("Por favor, indica el nombre del concursante");
    nombre = teclado.nextLine();
    System.out.println("Por favor, indica el primer apellido del concursante");
    primerApellido = teclado.nextLine();
    System.out.println("Por favor, indica el segundo apellido del concursante");
    segundoApellido = teclado.nextLine();
    //---------------------
    //PROCESAMIENTO
    //---------------------
    //Pasamos todos los caracteres a minúscula
   
    primeraLetra = nombre.charAt(0);
    int pos = (int)primeraLetra + NUMC;
    primeraLetra = (char) pos;
    ultimaLetra = nombre.charAt(nombre.length()-1);
    //Comprobamos si los caracteres coinciden
    resultadoLetras=(primeraLetra == ultimaLetra)?true:false;
    //Contamos número caracteres apellidos;
    numCharPrimerAp = primerApellido.length();
    numCharSegundoAp = segundoApellido.length();
    //Comprobamos si tienen el mismo número de caracteres
    resultadoCantidadLetras = (numCharPrimerAp == numCharSegundoAp)?true:false;
    //Si ambos requisitos son ciertos  será APTO
    resultado = ((resultadoCantidadLetras == true)&& (resultadoLetras==true))?"APTO":"NO APTO"; 
    //---------------------
    //SALIDA DE DATOS
    //---------------------
    System.out.println("El concursante es:" + resultado);    
  
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author Ignacio
 */
public class Condicional_1 {
    public static void main(String [] args){
    //d contendrá un número aleatorio entre 0 y 100.
    double d=Math.random()*100;
        
    /*
    Usando exclusivamente el operador condicional, junto con operadores de relación, lógicos y de asignación, escribe un código en Java que muestre por pantalla si el número aleatorio 
    generado está entre los rangos siguientes:
    d está entre 0 y 20, 20 no incluido.
    d está entre 20 y 50, ambos incluidos.
    d está entre 50 y 75, ninguno incluido.
    d está entre 75 y 100, ambos incluidos.       
    */
    String condicional = (d<20)?"incluido":"No incluido";
    System.out.println("El número: "+d+" "+condicional);
    
    condicional = (d>= 20 && d<=50)?"incluido":"No incluido";
    System.out.println("El número: "+d+" "+condicional);
    
    condicional = (d>50 && d<75)?"incluido":"No incluido";
    System.out.println("El número: "+d+" "+condicional);
    
    condicional = (d>= 75 && d<=100)?"incluido":"No incluido";
    System.out.println("El número: "+d+" "+condicional);
    }
}

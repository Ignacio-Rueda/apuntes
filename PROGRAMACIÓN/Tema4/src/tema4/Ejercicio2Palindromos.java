/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class Ejercicio2Palindromos {

    /*
    Un palíndromo es una palabra o expresión que se lee igual de izquierda a derecha que de derecha a izquierda, 
    como por ejemplo "Ana", "salas", "reconocer" o "No deseo ese don".
    Escribe un programa que lea desde teclado una cadena que solo pueda contener letras 
    (mayúsculas o minúsculas, sin contar con la eñe). Mientras que la cadena introducida contenga algo que no sean 
    letras, habrá que volver a solicitarla. Una vez la cadena cumpla las reglas, habrá que comprobar si se trata de un 
    palíndromo o no.
    A la hora de llevar a cabo la comprobación, no deberían importar mayúsculas
    y minúsculas.
     */
    public static void main(String[] args) {
        boolean repetir;
        boolean palindromo = true;
        String resultado = "";
        String palabra;
        String copiaPalabra="";
        Scanner teclado = new Scanner(System.in);
        //Solución 1.
        do {
            repetir = false;
            System.out.println("Dame una cadena que solo contenga letras");
            palabra = teclado.nextLine();
            palabra = palabra.toLowerCase();
            //Comprobar si son solo letras.
            for(int l=0;l<palabra.length();l++){
               if(palabra.charAt(l)<'a' || palabra.charAt(l)>'z'){
                   repetir = true;
               }
            }
            //Si se han introducido caracteres correctos.
            if(!repetir){
            for (int n = 0, z = palabra.length() - 1; n < palabra.length()/2; n++, z--) {
                if (palabra.charAt(z) != palabra.charAt(n)) {
                    palindromo = false;
                }
            }
            }

        } while (repetir);
        
        resultado = palindromo?"si":"no";
        System.out.printf("%s%s%s%n","La palabra introducida ",resultado," es un palindromo");
        
        //Solución 2.
        for(int n=palabra.length()-1;n>=0;n--){
            copiaPalabra+=(palabra.charAt(n));
        }
        resultado = palabra.equals(copiaPalabra)?"si":"no";
        System.out.printf("%s%s%s%n","La palabra introducida ",resultado," es un palindromo");
        
        
    }

}

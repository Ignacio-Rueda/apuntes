/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Ignacio Rueda
 */
public class ExpresionesRegularesPatternMatcher {

    public static void main(String[] args) {
        System.out.println("Introduzca el texto a buscar");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        
        //Patrón.
        Pattern patron = Pattern.compile("a");//Aquí la expresión regular
        Matcher match = patron.matcher(texto);
        System.out.println("--------------------------------------------------");
        //Buscar coincidencias.
        if(match.find()){
            System.out.println("Coincide");
        }else{
            System.out.println("No coincide");
        }
        //Después de realizar la búsqueda el puntero interno de Matcher se mueve al final de la secuencia coincidente, desde el principio del texto.
        //Para reiniciar la búsqueda, crear un nuevo objeto Matcher.
        System.out.println("---------------------------------------------------");
        System.out.println("----------LETRAS ENCONTRADAS-----------------------");
        match = patron.matcher(texto);
        while(match.find()){
            System.out.println(match.start());//Indica el índice donde empieza la coincidenicia.
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;
import java.util.Arrays;
/**
 *
 * @author Ignacio Rueda
 */
public class SopaDeLetras {

    public static void main(String[] args) {
        char sopa [][]={
            {'H','J','S','O','L'},
            {'O','E','C','A','U'},
            {'L','Y','K','D','A'},
            {'A','A','M','O','R'},
            {'V','C','A','S','A'}
        };
        String listaPalabras [] = {"Hola","sol","AMOR","ARA","Casa","dos"};
        String resultados [] = new String[listaPalabras.length];
        String cadena;//Almacenar cadenas para posteriormente buscar coincidencias
        String posiciones;
        int contadorPalabras=0;
        System.out.println("Buscador de palabras en horizontal");
        System.out.println("----------------------------------");
        //Representar sopa letras
        System.out.println("Sopa de letras:");
        for(int n=0;n<sopa.length;n++){
            cadena = "";
            for(int x=0;x<sopa[n].length;x++){
                cadena+=sopa[n][x];//Almacenamos tods los valores de la búsqueda en horizontal.
                System.out.print(sopa[n][x]);
            }
            System.out.println("");
            //Buscar si existe coincidencia en la cadena.
            for(int j=0;j<listaPalabras.length;j++){
                int resultado = cadena.toLowerCase().indexOf(listaPalabras[j].toLowerCase());
                if(resultado >= 0){
                    posiciones = "fila "+n+" columna "+resultado;
                    resultados[j]=posiciones;
                }
            }
        }
        //Ahora recorremos el array con los resultados y si encontramos null, lo sustituimos por "no"
        for(int j=0;j<resultados.length;j++){
            if(resultados[j]==null){
                resultados[j]="no";
                contadorPalabras++;
            }
        }
        System.out.println("Lista de palabras de prueba:");
        System.out.println(Arrays.toString(listaPalabras));
        System.out.println(Arrays.toString(resultados));
        System.out.printf("%s%d%n","Número de palabras encontradas: ",listaPalabras.length-contadorPalabras);
     
        
    }
    
}

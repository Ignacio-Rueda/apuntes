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
public class Linea {

    public static void main(String[] args) {

        int numerosQueHanSalido[] = {
             1, 2, 5, 10, 11, 12, 14, 15, 22, 55, 56, 57, 59, 60, 61, 66, 78, 89, 90};

        int carton[][] = {
            {1, 2, 5,9},
            {11,15},
            {22,29},
            {34},
            {47,49},
            {55,59,60},
            {61},
            {71,75},
            {88,90}
        };
        System.out.println("Buscador de líneas en un cartón de bingo");
        System.out.println("----------------------------------------");
        int coincidencias[] = new int[carton.length];//Array para guardar las coincidencias de cada línea.
        String lineasEncontradas [] = new String[carton.length];
        System.out.println("Números que han salido: "+Arrays.toString(numerosQueHanSalido));
        System.out.print("Cartón: ");
        for (int n = 0; n < carton.length; n++) {
            System.out.print(Arrays.toString(carton[n]));
        }
        System.out.println("");
        int contador = 0;//Contador de coincidencias en el cartón.
      
        for (int l = 0; l < carton.length; l++) {//Recorremos la matriz.
            contador=0;
            for (int i = 0; i < carton[l].length; i++) {
                for (int x = 0; x < numerosQueHanSalido.length; x++) {
                    if (numerosQueHanSalido[x] == carton[l][i]) {
                        contador++;
                    }
                }//.
            }//.
             coincidencias[l] = contador;
        }//Bucle exterior.
        int contarLineas = 0;
        
        for(int n=0;n<carton.length;n++){
            if(carton[n].length == coincidencias[n]){
                lineasEncontradas[n] = "línea";
                contarLineas++;
            }
            else{
                lineasEncontradas[n] = "no";
            }
        }
        
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Resultado de la búsqueda de líneas en el cartón de bingo");
        System.out.println(Arrays.toString(lineasEncontradas));
        System.out.println("Número de líneas obtenidas: "+contarLineas);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_preparacion_temas_1_5.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class InicializarArrayIrregular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int filas = 0;
        int contador = 0;
        int numColumnas = 0;
        int contadorRelleno = 1;
        //Declaración del array
        int[][] miArrayBi;
        
        System.out.println("Por favor, indique el número de filas del array:");
        Scanner teclado = new Scanner(System.in);
        filas = teclado.nextInt();
        miArrayBi = new int[filas][];
        
        while(contador<filas){
            System.out.printf("Por favor indique el número de columnas en la fila %d: ",contador);
            numColumnas = teclado.nextInt();
            
            miArrayBi[contador] = new int[numColumnas];
            contador++;
        }
        
        //Rellenamos el array.
        
        for(int i=0;i<miArrayBi.length;i++){
        
            for(int j=0;j<miArrayBi[i].length;j++){
                miArrayBi[i][j]=contadorRelleno;
                contadorRelleno++;
            }
        }
        
        //Mostrar resultados.
        
        System.out.printf("El contenido del array es: %n");
        for(int i=0;i<miArrayBi.length;i++){
            for(int j=0;j<miArrayBi[i].length;j++){
                System.out.print(miArrayBi[i][j]);
            }
            System.out.println("");
        }
        
        System.out.printf("Contenido usando \"Arrays.toString\"%s%n",Arrays.toString(miArrayBi));
        System.out.printf("Contenido usando \"Arrays.deepToString\"%s%n",Arrays.deepToString(miArrayBi));
        
    
    }
}

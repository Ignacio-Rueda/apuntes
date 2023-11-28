/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Ignacio Rueda
 */
public class NumeroDeButacas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitar un número válido de filas (Entre 2 y 50)
        double precioFila = 10.50;
        double incrementoPrecio = 0.50;
        int numFilas = 0;
        int contadorButacas = 4;
        System.out.println("BUTACAS DE UN TEATRO");
        System.out.println("--------------------");
        do{
        System.out.println("Introduzca el número de filas (2-50)");
        try{
            Scanner teclado = new Scanner (System.in);
            numFilas = teclado.nextInt();
        }
        catch(InputMismatchException ex2){
            //numFilas = 0;
            System.out.println("Error en la entrada de caracteres "+ex2.getMessage());
        }
        
        }while(numFilas<2 || numFilas>50);
        
        //Creamos filas. Asignamos en el array el número de filas y a parti de ahí,calculamos las butacas por fila.
        double numFilasButacas [][] = new double[numFilas][];
        for(int n=0;n<numFilasButacas.length;n++){
            numFilasButacas[n]=new double [contadorButacas];
            contadorButacas+=2;
        }
        System.out.printf("%s%d%s%n","Reservado array de ",numFilas," filas, cada fila con una cantidad de elementos diferente.");
        //Mostramos Butacas vacías
        System.out.println(Arrays.deepToString(numFilasButacas));
        //Aplicamos precios (Empezando por el final)
        for(int x = numFilasButacas.length-1;x>=0;x--){
            //Incrementar precio fila
            if(x<numFilasButacas.length-1){
                precioFila+=0.50;
            }
            for(int i=0;i<numFilasButacas[x].length;i++){
                //Precio Butacas interior
                if(i>0 && i<numFilasButacas[x].length-1){
                    numFilasButacas[x][i]=precioFila;
                }
                else{
                    numFilasButacas[x][i]=precioFila-0.50;
                }
            }
        }
        //Una vez que lo tenemos relleno
        System.out.println(" ");
        System.out.println("RESULTADO: ESTRUCTURAS DE BUTACAS Y PRECIOS POR FILAS");
        System.out.println("-----------------------------------------------------");
        for(int x=0;x<numFilasButacas.length;x++){
            int fila = x+1;
            System.out.printf("%s%d%s%d%s","Fila ",fila," (",numFilasButacas[x].length,") butacas: ");
            for(int i=0;i<numFilasButacas[x].length;i++){
                System.out.printf("%.2f%s",numFilasButacas[x][i]," ");
            }
            System.out.println(" ");
        }
        //Usar herramiento deepToString
        System.out.println(Arrays.deepToString(numFilasButacas));
        
        
        //Mostrar por pantalla en forma de triángulo.
        System.out.println("");
        System.out.println("MOSTRAR DISPOSICIÓN BUTACAS EN TRIÁNGULO");
        System.out.println("----------------------------------------");
        System.out.println("");
        int contadorEspacios = 2;
        String espacios = "      ";
        for(int n=numFilasButacas.length-1;n>=0;n--){
            if(n<numFilasButacas.length-1){
                System.out.print(espacios);
                espacios = espacios+"      ";
            }
            for(int x=0;x<numFilasButacas[n].length;x++){
                System.out.printf("%.2f%s",numFilasButacas[n][x]," ");
            }
            contadorEspacios+=2;
            System.out.println(" ");
        }
      
        
        
    }
    
}

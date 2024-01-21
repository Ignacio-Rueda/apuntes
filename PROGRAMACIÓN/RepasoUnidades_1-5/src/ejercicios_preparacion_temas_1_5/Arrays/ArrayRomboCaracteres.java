package ejercicios_preparacion_temas_1_5.Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class ArrayRomboCaracteres {

    public static void main(String[] args) {
        //Declaración de variables
        int numFilasBase = 0;
        int numFilasDuplicadas = 0;
        char[][] miArray;
        int inicioCaracter = 65;
        StringBuilder resultado = new StringBuilder();

        System.out.println("ARRAY 2D EN FORMA DE ROMBO");
        System.out.println("--------------------------");
        Scanner teclado = new Scanner(System.in);
        while (numFilasBase < 3 || numFilasBase > 10) {
            try {
                System.out.println("Introduzca el número de filas \"base\" (3-10):");
                numFilasBase = teclado.nextInt();
            } catch (InputMismatchException ex) {
                teclado.nextLine();//Purgamos lo que haya en el buffer.Evita que el programa quede en un bucle infinito tratando de leer el mismo token incorrecto, ya que si no se purga el buffer después de una excepción. el token incorrecto seguirá estando allí.
            }
        }

        numFilasDuplicadas = numFilasBase * 2;
        miArray = new char[numFilasDuplicadas][];
        int elementos = 1;
        //GENERAR LAS COLUMNAS CORRESPONDIENTES.
        for (int i = 0; i < miArray.length; i++) {
            //Si nos encontramos en la posición 0, elementos = 1.
            if (i == 0) {
                miArray[i] = new char[elementos];
            } //Sumar dos a partir de la posición 1, mientras estemos por debajo del numFilasBase.
            else if (i < numFilasBase && i != 0) {
                miArray[i] = new char[elementos += 2];
            } //Si 'i' vale lo mismo que las filas base, mantenemos el mísmo número de elementos.
            else if (i == numFilasBase) {
                miArray[i] = new char[elementos];
            } //Si 'i+1' vale más que las filas base, decrementamos dos elementos.
            else if (i > numFilasBase) {
                miArray[i] = new char[elementos -= 2];
            }
        }
        //RELLENAR LAS COLUMNAS
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[i].length; j++) {
                miArray[i][j] = (char) inicioCaracter;
                resultado.append(String.format("%c ", miArray[i][j]));

            }
            resultado.append("\n");
            inicioCaracter++;
        }

        System.out.println("RESULTADO: ARRAY EN 2D EN FORMA DE ROMBO");
        System.out.println("----------------------------------------");

        System.out.printf("Contenido del array usando Arrays.deepToString:%s%n", Arrays.deepToString(miArray));
        System.out.printf("Contenido del array mostrando elemento a elemento (doble bucle)%n%s%n", resultado);

        //MOSTRAR DE UNA MANERA MÁS ESTÉTICA: EN ROMBO
        //Suponemos que la parte mas anchas es = numeroFilasDuplicadas - 1.
        int espaciosRombo = numFilasDuplicadas - 1;

        for (int n = 0; n < miArray.length; n++) {
            int espacioArellenar = miArray[n].length;
            //Restamos al total del espacio, la cantidad de caracteres ocupados.
            espacioArellenar = espaciosRombo - espacioArellenar;//5 caracteres tiene la parte más ancha, para la primera posición, restamos un caracter, nos quedarían 4;
            espacioArellenar = espacioArellenar / 2;//Dividimos los espacios.
            String espacio = "";
            int contador = 0;
            while (contador < espacioArellenar) {//Generamos tantos espacios como espaciosArellenar hayamos determinado.
                espacio += "  ";
                contador++;
            }
            System.out.printf(espacio);
            for (int l = 0; l < miArray[n].length; l++) {

                System.out.printf("%c ", miArray[n][l]);

            }//Bucle interior
            System.out.println("");

        }//Bucle exterior

    }

}

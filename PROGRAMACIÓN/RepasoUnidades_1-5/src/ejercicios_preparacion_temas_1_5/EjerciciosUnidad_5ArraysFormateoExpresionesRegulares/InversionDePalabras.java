package ejercicios_preparacion_temas_1_5.EjerciciosUnidad_5ArraysFormateoExpresionesRegulares;

import java.util.Arrays;

public class InversionDePalabras {

    public static void main(String[] args) {
        //DECLARAR UN ARRAY DE STRING
        String[] arrayEntrada = {
            "Reconocer",
            "AMANECER",
            "Esto no es un palindromo",
            "Dabale arroz a la zorra el abad.",
            "A man, a plan, a canal: Panama.",
            "A man a plan and a canal, Panama.",
            "No deseo ese don..."
        };

        //DECLARAR ARRAY DE RESULTADOS
        String[] resultados = new String[arrayEntrada.length];
        System.out.println("INVERSIÓN DE PALABRAS");
        System.out.println("---------------------");
        System.out.println("Los textos que vamos a analizar son:");
        //RECORRA CADA UNO DE LOS TEXTOS DEL ARRAY DE ENTRADA Y LOS MUESTRA POR PANTALLA
        for (int i = 0; i < arrayEntrada.length; i++) {
            System.out.printf("-Texto %d:%s%n", i + 1, arrayEntrada[i]);
        }
        //RECORRER CADA UNO DE LOS TEXTOS Y OBTENER CADA PALABRA DEL TEXTO (SE CONSIDERA PALABRA TODA ACUMULACIÓN DE LETRAS) HASTA QUE SE ENCUENTREN ESPACIOS O SIGNOS DE PUNTUACIÓN.
        //1-Declaro mi expresión regular.
        
        StringBuilder resultadosObtenidos = new StringBuilder();
        String cadenaTextoInvertidas = "";
        String expresionRegular = "[ .,:]+";
        for (int i = 0; i < arrayEntrada.length; i++) {
            //Obtenemos todas las palabras existentes en una posición dada del arrayEntrada
            String[] manipulacionSplit;
            manipulacionSplit = arrayEntrada[i].split(expresionRegular);

            //Recorremos todas las palabras obtenidas
            for (int l = 0; l < manipulacionSplit.length; l++) {
                //Utilizaremos el método Reverse de StringBuilder para invertir palabra
                StringBuilder invertirPalabra = new StringBuilder();
                invertirPalabra.append(manipulacionSplit[l]).reverse();
                //Guardamos en una cadena de texto todas las palabras.
                cadenaTextoInvertidas += invertirPalabra.toString()+" ";
            }

            //Una vez que hemos terminado de recorrer la frase en la que estábamos la guardamos en el array resultados.
            resultados[i] = cadenaTextoInvertidas;
            //Reseteamos valores.
            cadenaTextoInvertidas = "";
        }
        System.out.println("RESULTADOS OBTENIDOS");
        System.out.println("--------------------");
        for(int n=0;n<arrayEntrada.length;n++){
            System.out.printf("Texto %d:%s%n",n+1,arrayEntrada[n]);
            System.out.printf("Palabras invertidas: \"%s\"%n%n",resultados[n].trim());
        }
        

    }//Final método

}//Final clase

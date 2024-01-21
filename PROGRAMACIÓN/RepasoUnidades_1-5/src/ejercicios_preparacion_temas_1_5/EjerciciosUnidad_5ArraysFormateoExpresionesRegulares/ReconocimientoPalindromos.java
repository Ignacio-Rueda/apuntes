package ejercicios_preparacion_temas_1_5.EjerciciosUnidad_5ArraysFormateoExpresionesRegulares;

import java.util.Arrays;

public class ReconocimientoPalindromos {

    public static void main(String[] args) {
        //DECLARACIÓN DE ARRAY CON POSIBLES EJEMPLOS
        String[] textosEjemplo = {"Reconocer",
            "AMANECER",
            "Esto no es un palindromo",
            "Dabale arroz a la zorra el abad.",
            "A man, a plan, a canal: Panama.",
            "A man a plan and a canal, Panama.",
            "No deseo ese don..."
        };

        //DECLARACIÓN BOOLEAN PARA LOS RESULTADOS
        boolean[] resultados = new boolean[textosEjemplo.length];
        //RECORRER CADA UNO DE LOS TEXTOS DEL ARRAY DE ENTRADA.
        System.out.println("RECONOCIMIENTO DE PALÍNDROMOS");
        System.out.println("-----------------------------");
        System.out.println("Los textos que vamos a analizar son:");
        for (int n = 0; n < textosEjemplo.length; n++) {
            System.out.printf("-Texto %d: %s%n", n + 1, textosEjemplo[n]);
            //Eliminamos puntos y caracteres vacíos
            String textoAinvertir = textosEjemplo[n].toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace(":", "");
            //Recorrer los caracteres de la palabra sobre la que estamos iterando.

            String invertida = "";
            for (int l = textoAinvertir.length() - 1; l >= 0; l--) {
                invertida += String.valueOf(textoAinvertir.charAt(l));
            }
            if (invertida.equals(textoAinvertir)) {
                System.out.println(invertida);
                resultados[n] = true;
            }

        }

        //MOSTRAR RESULTADOS
        System.out.printf("%nRESULTADOS OBTENIDOS%n");
        System.out.printf("Palíndormos encontrados: %s%n", Arrays.toString(resultados));
        System.out.println("");

        //---------------------------OTRA POSIBLE SOLUCIÓN--------------------------------------------------
        boolean coincide = true;
        
        //RECORRER CADA UNO DE LOS TEXTOS DEL ARRAY DE ENTRADA.
        System.out.println("RECONOCIMIENTO DE PALÍNDROMOS -> SOLUCIÓN 2");
        System.out.println("-------------------------------------------");
        System.out.println("Los textos que vamos a analizar son:");
        for (int n = 0; n < textosEjemplo.length; n++) {
            System.out.printf("-Texto %d: %s%n", n + 1, textosEjemplo[n]);
            //Eliminamos puntos y caracteres vacíos
            String textoAinvertir = textosEjemplo[n].toLowerCase().replaceAll("[ ,.:]", "");
            //Recorrer los caracteres de la palabra sobre la que estamos iterando.
            for (int l = textoAinvertir.length() - 1,v=0; l >= (textoAinvertir.length()/2)-1 && coincide; l--,v++) {
                coincide = textoAinvertir.charAt(l) == textoAinvertir.charAt(v);
            }
            if (coincide) {
                resultados[n] = true;
            }

        }

        //MOSTRAR RESULTADOS
        System.out.printf("%nRESULTADOS OBTENIDOS%n");
        System.out.printf("Palíndormos encontrados: %s%n", Arrays.toString(resultados));

    }

}

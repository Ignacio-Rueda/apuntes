package ejercicios_preparacion_temas_1_5.Arrays;

import java.util.Scanner;

public class FormasVerbalesArrays {

    public static void main(String[] args) {
        /**
         * Escribe un programa en Java que solicite un verbo regular en
         * castellano (en infinitivo) y lo conjugue en presente de indicativo,
         * indicando cada una de las seis personas (primera, segunda y tercera
         * persona del singular y del plural: yo, tú, él/ella, nosotros/as,
         * vosotros/as y ellos/as).
         */
        //Declaración de variables.
        String verboIntroducido = "";
        StringBuilder conjugacion = new StringBuilder();
        String terminacion = "";
        //Terminaciones infinitivo
        String[] terminaciones = {"ar", "er", "ir"};
        //Arrays para almacenar las desinencias personales de cada conjucación.
        String[] conjugacion1 = {"o", "as", "a", "amos", "áis", "an"};
        String[] conjugacion2 = {"o", "es", "e", "emos", "éis", "en"};
        String[] conjugacion3 = {"o", "es", "e", "imos", "ís", "en"};

        String[][] todasLasConjugaciones = {{"o", "as", "a", "amos", "áis", "an"}, {"o", "es", "e", "emos", "éis", "en"}, {"o", "es", "e", "imos", "ís", "en"}};

        //Pronombres personales.
        String[] pronombres = {"yo", "tú", "él/ella", "nosotros/as", "vosotros/as", "ellos/as"};

        System.out.println("PROGRAMA PARA CONJUGAR VERBOS PERSONALES");
        System.out.println("----------------------------------------");

        System.out.print("Introduzca verbo regular:");
        Scanner teclado = new Scanner(System.in);

        verboIntroducido = teclado.nextLine();

        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.printf("Conjugación en presente de indicativo del verbo %s%n", verboIntroducido);

        //Nos quedamos con la parte del verbo a conjugar, p.ejemplo: comer -> com
        terminacion = verboIntroducido.substring(verboIntroducido.length() - 2, verboIntroducido.length());

        verboIntroducido = verboIntroducido.substring(0, (verboIntroducido.length() - 2));

        for (int n = 0; n < conjugacion1.length; n++) {
            switch (terminacion) {
                case "ar":
                    conjugacion.append(String.format("%s %s%s", pronombres[n], verboIntroducido, conjugacion1[n]));
                    //Añadimos el final de la conjugación.
                    System.out.println(conjugacion);
                    conjugacion.delete(0, conjugacion.length());
                    break;
                case "ir":
                    conjugacion.append(String.format("%s %s%s", pronombres[n], verboIntroducido, conjugacion3[n]));
                    //Añadimos el final de la conjugación.
                    System.out.println(conjugacion);
                    conjugacion.delete(0, conjugacion.length());
                    break;
                case "er":
                    conjugacion.append(String.format("%s %s%s", pronombres[n], verboIntroducido, conjugacion2[n]));
                    //Añadimos el final de la conjugación.
                    System.out.println(conjugacion);
                    conjugacion.delete(0, conjugacion.length());
                    break;
            }

        }

        //MOSTRAR TODAS LAS CONJUGACIONES.
        System.out.println("");
        System.out.println("MOSTRAR TODAS LAS CONJUGACIONES");
        System.out.println("-------------------------------");
        System.out.println("");

        int conj = 0;
        switch (terminacion) {
            case "ar":
                conj = 0;
                break;
            case "ir":
                conj = 2;
                break;
            case "er":
                conj = 1;
                break;
        }

        for (int j = 0; j < todasLasConjugaciones[conj].length; j++) {
            conjugacion.append(String.format("%s %s%s", pronombres[j], verboIntroducido, todasLasConjugaciones[conj][j]));
            System.out.println(conjugacion);
            conjugacion.delete(0, conjugacion.length());
        }

    }

}

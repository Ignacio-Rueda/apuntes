package ejercicios_preparacion_temas_1_5.Arrays;

import java.util.Scanner;

public class FormasVerbalesArrays {

    public static void main(String[] args) {
        /**
         * Escribe un programa en Java que solicite un verbo regular en
         * castellano (en infinitivo) y lo conjugue en presente de indicativo,
         * indicando cada una de las seis personas (primera, segunda y tercera
         * persona del singular y del plural: yo, t�, �l/ella, nosotros/as,
         * vosotros/as y ellos/as).
         */
        //Declaraci�n de variables.
        String verboIntroducido = "";
        StringBuilder conjugacion = new StringBuilder();
        String terminacion = "";
        //Terminaciones infinitivo
        String[] terminaciones = {"ar", "er", "ir"};
        //Arrays para almacenar las desinencias personales de cada conjucaci�n.
        String[] conjugacion1 = {"o", "as", "a", "amos", "�is", "an"};
        String[] conjugacion2 = {"o", "es", "e", "emos", "�is", "en"};
        String[] conjugacion3 = {"o", "es", "e", "imos", "�s", "en"};

        String[][] todasLasConjugaciones = {{"o", "as", "a", "amos", "�is", "an"}, {"o", "es", "e", "emos", "�is", "en"}, {"o", "es", "e", "imos", "�s", "en"}};

        //Pronombres personales.
        String[] pronombres = {"yo", "t�", "�l/ella", "nosotros/as", "vosotros/as", "ellos/as"};

        System.out.println("PROGRAMA PARA CONJUGAR VERBOS PERSONALES");
        System.out.println("----------------------------------------");

        System.out.print("Introduzca verbo regular:");
        Scanner teclado = new Scanner(System.in);

        verboIntroducido = teclado.nextLine();

        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.printf("Conjugaci�n en presente de indicativo del verbo %s%n", verboIntroducido);

        //Nos quedamos con la parte del verbo a conjugar, p.ejemplo: comer -> com
        terminacion = verboIntroducido.substring(verboIntroducido.length() - 2, verboIntroducido.length());

        verboIntroducido = verboIntroducido.substring(0, (verboIntroducido.length() - 2));

        for (int n = 0; n < conjugacion1.length; n++) {
            switch (terminacion) {
                case "ar":
                    conjugacion.append(String.format("%s %s%s", pronombres[n], verboIntroducido, conjugacion1[n]));
                    //A�adimos el final de la conjugaci�n.
                    System.out.println(conjugacion);
                    conjugacion.delete(0, conjugacion.length());
                    break;
                case "ir":
                    conjugacion.append(String.format("%s %s%s", pronombres[n], verboIntroducido, conjugacion3[n]));
                    //A�adimos el final de la conjugaci�n.
                    System.out.println(conjugacion);
                    conjugacion.delete(0, conjugacion.length());
                    break;
                case "er":
                    conjugacion.append(String.format("%s %s%s", pronombres[n], verboIntroducido, conjugacion2[n]));
                    //A�adimos el final de la conjugaci�n.
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

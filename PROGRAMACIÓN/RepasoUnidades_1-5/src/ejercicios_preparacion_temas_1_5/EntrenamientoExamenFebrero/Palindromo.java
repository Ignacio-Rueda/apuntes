package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean noEsLetra = false;
        boolean resultado = true;
        do {
            noEsLetra = false;
            System.out.println("Introduce una palabra (solo puede contener letras) y te digo si es pal�ndormo o no");
            String texto = teclado.nextLine();

            for (int n = 0; n < texto.length(); n++) {
                if (!Character.isAlphabetic(texto.charAt(n))) {
                    noEsLetra = true;
                }
            }
            if (noEsLetra) {
                System.out.println("Lo siento, solo puedes introducir letras");
            } else {
                for (int i = 0, l = texto.length() - 1; i < texto.length() / 2; i++, l--) {
                    if (Character.toUpperCase(texto.charAt(i)) != Character.toUpperCase(texto.charAt(l))) {
                        resultado = false;
                    }
                }
            }
        } while (noEsLetra);
        if (resultado) {
            System.out.println("Es pal�ndromo");
        } else {
            System.out.println("No es pal�ndromo");
        }

        ///////////////////OTRA FORMA DE BUSCAR SI ES PAL�NDROMO///////////////////////////////////////
        System.out.println("OTRA OPCI�N");
        resultado = true;
        do {
            noEsLetra = false;
            System.out.println("Introduce una palabra (solo puede contener letras) y te digo si es pal�ndormo o no");
            String texto = teclado.nextLine();

            for (int n = 0; n < texto.length(); n++) {
                if (!Character.isAlphabetic(texto.charAt(n))) {
                    noEsLetra = true;
                }
            }
            if (noEsLetra) {
                System.out.println("Lo siento, solo puedes introducir letras");
            } else {
                String cadenaInversa = "";
                for (int i = texto.length()-1; i >=0 ; i--) {
                    cadenaInversa+=texto.charAt(i);
                }
                if(cadenaInversa.equals(texto)){
                    resultado = true;
                }
            }
        } while (noEsLetra);
        if (resultado) {
            System.out.println("Es pal�ndromo");
        } else {
            System.out.println("No es pal�ndromo");
        }
    }

}

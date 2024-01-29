package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

/**
 *
 * Implementar un programa que reciba un conjunto de números entre 0 y 99 a
 * partir de un array de int (podemos usar como base el ejercicio 2) y genere un
 * array de String con esos números en su equivalente en "romano". El cero
 * podríamos representarlo, por ejemplo, con un guion ("-").
 *
 * @author Ignacio Rueda
 */
public class ConversorNumConvAnumRomano {

    public static void numRomanosSencillos(int[] arrayEntrada) {

        //****************************************************************************
        //REPRESENTACIÓN NÚMEROS ROMANOS "FÁCIL"
        //****************************************************************************
        String[] arrayString = new String[arrayEntrada.length];
        StringBuilder numeroRomanoFacil = new StringBuilder();
        for (int n = 0; n < arrayEntrada.length; n++) {
            //Reseteamos los valores acumulados.
            numeroRomanoFacil.delete(0, numeroRomanoFacil.length());
            //Obtener decenas.
            boolean numCero = arrayEntrada[n] == 0;
            int decenas = arrayEntrada[n] / 10;
            //Obtener unidades.
            int unidades = arrayEntrada[n] % 10;

            //REPRESENTACIÓN PARA LAS DECENAS.
            numeroRomanoFacil.append(decenas >= 5 ? "L" : "");
            switch (decenas) {
                case 9:
                case 4:
                    numeroRomanoFacil.append("X");
                case 8:
                case 3:
                    numeroRomanoFacil.append("X");
                case 7:
                case 2:
                    numeroRomanoFacil.append("X");
                case 6:
                case 1:
                    numeroRomanoFacil.append("X");
            }
            //REPRESENTACIÓN PARA LAS UNIDADES.
            numeroRomanoFacil.append(unidades > 5 ? "V" : "");
            switch (unidades) {
                case 0:
                    numeroRomanoFacil.append((numCero ? "-" : ""));
                    break;
                case 9:
                case 4:
                    numeroRomanoFacil.append("I");
                case 8:
                case 3:
                    numeroRomanoFacil.append("I");
                case 7:
                case 2:
                    numeroRomanoFacil.append("I");
                case 6:
                case 1:
                    numeroRomanoFacil.append("I");
            }
            arrayString[n] = numeroRomanoFacil.toString();
        }

        System.out.printf(String.format("REPRESENTACIÓN NÚMEROS ROMANOS \"FÁCIL\": %s%n", Arrays.toString(arrayString)));

    }

    /**
     * Recibe un número entre 0 y 99 y lo devuelve en formato romano.
     *
     * @param numero entre 0 y 99.
     * @return cadena formato romano
     */
    public static String numRomanosConvencional(int numero) {
        String resultado;
        StringBuilder unidadesNumeroRomano = new StringBuilder();
        StringBuilder decenasNumeroRomano = new StringBuilder();

        //Reseteamos los valores acumulados.
        unidadesNumeroRomano.delete(0, unidadesNumeroRomano.length());
        decenasNumeroRomano.delete(0, decenasNumeroRomano.length());
        //Obtener decenas.
        boolean numCero = numero == 0;
        int decenas = numero / 10;
        //Obtener unidades.
        int unidades = numero % 10;

        //REPRESENTACIÓN PARA LAS DECENAS.
        decenasNumeroRomano.append(decenas > 3 ? "L" : "");
        switch (decenas) {
            case 9:
            case 4:
                if (decenas == 9) {
                    decenasNumeroRomano.replace(0, 1, "C");
                }
                decenasNumeroRomano.append("X").reverse();
                break;
            case 8:
            case 3:
                decenasNumeroRomano.append("X");
            case 7:
            case 2:
                decenasNumeroRomano.append("X");
            case 6:
            case 1:
                decenasNumeroRomano.append("X");
        }
        //REPRESENTACIÓN PARA LAS UNIDADES.
        unidadesNumeroRomano.append(unidades > 3 ? "V" : "");
        switch (unidades) {
            case 0:
                unidadesNumeroRomano.append((numCero ? "-" : ""));
                break;
            case 9:
            case 4:
                if (unidades == 9) {
                    unidadesNumeroRomano.replace(0, 1, "X");
                }
                unidadesNumeroRomano.append("I").reverse();
                break;
            case 8:
            case 3:
                unidadesNumeroRomano.append("I");
            case 7:
            case 2:
                unidadesNumeroRomano.append("I");
            case 6:
            case 1:
                unidadesNumeroRomano.append("I");
        }
        resultado = decenasNumeroRomano.toString() + unidadesNumeroRomano.toString();

        return resultado;

    }

    public static String numRomanosMenorA3000(int numero) {
        /**
         * C = 100; D = 500; M = 1000;
         */
        String resultado;
        StringBuilder numeroRomanoUmillar = new StringBuilder();
        StringBuilder numeroRomanoCentenas = new StringBuilder();
        //Comprobar si esta entre 100 y 300.
        int centenas = numero / 100;
        centenas = centenas % 10;
        int uMillar = numero / 1000;
        switch (uMillar) {
            case 3:
                numeroRomanoUmillar.append("M");
            case 2:
                numeroRomanoUmillar.append("M");
            case 1:
                numeroRomanoUmillar.append("M");
        }
        numeroRomanoCentenas.append(centenas >= 5 && centenas < 9 ? "D" : "");
        switch (centenas) {
            case 4:
                numeroRomanoCentenas.append("CD");
                break;
            case 9:
                numeroRomanoCentenas.append("CM");
                break;
            case 3:
            case 8:
                numeroRomanoCentenas.append("C");
            case 2:
            case 7:
                numeroRomanoCentenas.append("C");
            case 1:
            case 6:
                numeroRomanoCentenas.append("C");

        }
        //Utilizamos la función numRomanosConvencinal solo si el resto de la operación no es cero:
        resultado = numero % 100 > 1 ? numeroRomanoUmillar.toString() + numeroRomanoCentenas.toString() + numRomanosConvencional(numero % 100) : numeroRomanoUmillar.toString() + numeroRomanoCentenas.toString();
        return resultado;
    }

    public static void main(String[] args) {
        int[] arrayEntrada = {0, 99, 10, 20, 15, 25, 66, 11, 7, 90, 72};
        int[] arrayEntrada2 = {512, 27, 1893, 934, 68, 1456, 2233, 3000, 472, 189, 77, 100};
        
        String[] arrayNumeroRomano = new String[arrayEntrada.length];
        String[] arrayNumeroRomanoCeroY3M = new String[arrayEntrada2.length];

        //1º EJERCICIO
        numRomanosSencillos(arrayEntrada);
        //2º EJERCICIO
        for (int i = 0; i < arrayEntrada.length; i++) {
            arrayNumeroRomano[i] = ConversorNumConvAnumRomano.numRomanosConvencional(arrayEntrada[i]);
        }

        //3º EJERCICIO
        for (int n = 0; n < arrayEntrada2.length; n++) {
            arrayNumeroRomanoCeroY3M[n] = ConversorNumConvAnumRomano.numRomanosMenorA3000(arrayEntrada2[n]);
        }

        //MOSTRAR RESULTADOS.
        System.out.printf(String.format("REPRESENTACIÓN NÚMEROS ROMANOS CONVENCIONAL: %s%n",Arrays.toString(arrayNumeroRomano)));
         System.out.printf(String.format("REPRESENTACIÓN NÚMEROS ROMANOS \"entre 0 y 3000\": %s%n",Arrays.toString(arrayNumeroRomanoCeroY3M)));
    }//Final método main.

}//Final clase.

package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

public class NumeroAPalabra99 {

    /**
     * Programa principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------
        // Variables de entrada
        int[] arrayEntrada = {0, 99, 10, 20, 15, 25, 66, 11, 7, 90, 72};

        // Variables de salida
        String[] arrayResultado;

        // Variables auxiliares
        String[][] arrayNombresNumeros = {
            {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"},
            {"diez", "once", "doce", "trece", "catorce", "quince", "diecis�is", "diecisiete", "dieciocho", "diecinueve"},
            {"veinte", "veintiuno", "veintid�s", "veintitr�s", "veinticuatro", "veinticinco", "veintis�is", "veintisiete", "veintiocho", "veintinueve"},
            {"treinta"},
            {"cuarenta"},
            {"cincuenta"},
            {"sesenta"},
            {"setenta"},
            {"ochenta"},
            {"noventa"}
        };
    

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CONVERSOR DE NOMBRES DE N�MEROS");
        System.out.println("-------------------------------");
        System.out.println("Lista de n�meros de prueba:");
        System.out.println(Arrays.toString(arrayEntrada));

        //----------------------------------------------
        //  Procesamiento (a implementar por el alumnado)
        //----------------------------------------------
        arrayResultado = new String[arrayEntrada.length];//Otorgamos el tama�o al array de entrada.

        for (int n = 0; n < arrayEntrada.length; n++) {
            int unidad = arrayEntrada[n] % 10;
            int decena = arrayEntrada[n] / 10;
            
            switch (decena) {
                case 0:case 1:case 2:
                    arrayResultado[n] = arrayNombresNumeros[decena][unidad];
                    break;
                default:
                    arrayResultado[n] = unidad > 0 ? arrayNombresNumeros[decena][0] + " y " + arrayNombresNumeros[0][unidad] : arrayNombresNumeros[decena][0];
                   
            }
        }//Final bucle

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.printf("Los nombres de esos n�meros son:\n%s\n",
                Arrays.toString(arrayResultado));

    }

}

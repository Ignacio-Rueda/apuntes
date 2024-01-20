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
        int contador;

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
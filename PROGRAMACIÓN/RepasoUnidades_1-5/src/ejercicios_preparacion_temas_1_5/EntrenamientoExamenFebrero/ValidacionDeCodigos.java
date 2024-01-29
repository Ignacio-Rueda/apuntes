package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class ValidacionDeCodigos {

    public static void main(String[] args) {
        String[] numerosDeSeriePruebas = {"ZA-2000", "XAZ2000", "XA2000", "XA-1969", "YH-1969", "XQ-1970", "XJ-2002", "YV-2021", "XB-2022", "YV-2042", "YA-1970", "YH-2002", "XB-2021"};
        String[] resultado = new String[numerosDeSeriePruebas.length];
        String patron = "[XY][A-Z]-(19[7-9][0-9]|20[0-2][0-4])";

        for (int n = 0; n < numerosDeSeriePruebas.length; n++) {
            if (numerosDeSeriePruebas[n].matches(patron)) {
                //Obtener el �ltimo n�mero del a�o.
                int numAnio = Integer.parseInt(numerosDeSeriePruebas[n].substring(numerosDeSeriePruebas[n].length() - 4, numerosDeSeriePruebas[n].length()));
                //Primera letra.
                String primeraLetra = numerosDeSeriePruebas[n].substring(0, 1); 
                //Almacenar resultados.
                resultado[n]=numAnio%2==0 && primeraLetra.equals("Y") ||numAnio%2==1 && primeraLetra.equals("X")  ?"v�lido":"inv�lido";
            }
            else{//Si no coincide con el patr�n, directamente inv�lido, no lo evaluamos.
                resultado[n]="inv�lido";
            }
        }

        //MOSTRAR RESULTADOS
        System.out.println("VALIDADOR DE N�MEROS DE PRUEBA");
        System.out.println("------------------------------");
        System.out.printf(String.format("Lista de n�meros de serie de prueba: %s%n", Arrays.toString(numerosDeSeriePruebas)));
        System.out.println("RESULTADO");
        System.out.println("------------------------------");
        System.out.printf(String.format("El resultado de la comprobaci�n de la validez de los n�meros de serie es: %s%n", Arrays.toString(resultado)));
    }

}

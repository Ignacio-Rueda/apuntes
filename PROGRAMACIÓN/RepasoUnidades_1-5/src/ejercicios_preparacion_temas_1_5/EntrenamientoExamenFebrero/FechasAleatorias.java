package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.time.LocalDate;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.Period;
import java.util.Scanner;

/**
 * Escribe un programa en Java en el que se rellene un array de N fechas
 * aleatorias de tipo LocalDate (todas las fechas deben pertenecer al a�o 2023 y
 * se generar�n de forma aleatoria, controlando los posibles errores que
 * pudieran ocurrir durante el proceso). La cantidad de fechas se pedir� por
 * teclado y debe estar comprendida entre 20 y 30.
 *
 * El programa deber� implementar la siguiente funcionalidad:
 *
 * 1. Mostrar el listado de fechas creadas aleatoriamente identificando a qu�
 * d�a de la semana pertenece cada fecha.
 *
 * 2. Calcular la diferencia en d�as entre la fecha m�s antigua y la fecha m�s
 * reciente de entre las fechas contenidas en el array.
 *
 * 3. Calcular�, de las fechas creadas aleatoriamente, qu� dos fechas son las
 * que est�n m�s pr�ximas entre s� y cu�ntos d�as se diferencian.
 *
 * @author Ignacio Rueda
 */
public class FechasAleatorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        StringBuilder fechasDiaSemana = new StringBuilder();
        final int MAX_TAMANIO = 30;
        final int MIN_TAMANIO = 20;
        final int ANIO = 2023;
        int dimensionArray = 0;
        boolean numCorrecto = false;
        LocalDate[] arrayFechas;
        Scanner teclado = new Scanner(System.in);
        
        //*********************************************
        //ENTRADA DE DATOS.
        //*********************************************
        
        while (!numCorrecto) {
            try {
                System.out.println("Indicame cu�ntas fechas quieres generar (20-30)");
                dimensionArray = teclado.nextInt();
                if(dimensionArray >= MIN_TAMANIO && dimensionArray<=MAX_TAMANIO){
                    numCorrecto = true;
                }
                
            } catch (Exception ex) {
                System.out.println("Valor no v�lido");
                numCorrecto = false;
                teclado.nextLine();
            }
        }
        //Asigno dimensi�n array.
        arrayFechas = new LocalDate[dimensionArray];
        //Creamos fechas de manera aleatoria.
        for (int n = 0; n < arrayFechas.length; n++) {
            //Creamos mes aleatorio.
            int creaMesRandom = (int) (1 + Math.random() * 12);
            //Creamos una "pseudo" fecha para concer los d�as del mes
            LocalDate fechaRandom = LocalDate.of(ANIO, creaMesRandom, 1);
            int numDiasMax = fechaRandom.lengthOfMonth();
            //Una vez que conocemos los d�as del mes como m�ximo,creamos los d�as.
            int creaDiaRandom = (int) (1 + Math.random() * numDiasMax);

            arrayFechas[n] = LocalDate.of(ANIO, creaMesRandom, creaDiaRandom);
        }
        //1 * 1. Mostrar el listado de fechas creadas aleatoriamente identificando a qu� d�a de la semana pertenece cada fecha.

        for (int n = 0; n < arrayFechas.length; n++) {
            fechasDiaSemana.append(String.format("Esta fecha: %s",arrayFechas[n].format(formatoFecha)));
            fechasDiaSemana.append(String.format("pertenece al d�a de la semana:%s%n",arrayFechas[n].getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"))));
        }

        //2- Calcular la diferencia en d�as entre la fecha m�s antigua y la fecha m�s reciente de entre las fechas contenidas en el array.
        LocalDate fechaMasAntigua = arrayFechas[0];
        LocalDate fechaMasReciente = arrayFechas[0];
        for (int n = 1; n < arrayFechas.length; n++) {
            if (!fechaMasAntigua.isBefore(arrayFechas[n])) {
                fechaMasAntigua = arrayFechas[n];
            }
            if (!fechaMasReciente.isAfter(arrayFechas[n])) {
                fechaMasReciente = arrayFechas[n];
            }
        }
       

        // * 3. Calcular�, de las fechas creadas aleatoriamente, qu� dos fechas son las que est�n m�s pr�ximas entre s� y cu�ntos d�as se diferencian.
        //Ordenamos el array de fechas, finalmente comparamos las dos primeras.
        for (int n = 0; n < arrayFechas.length; n++) {
            for (int i = n; i < arrayFechas.length; i++) {
                if (arrayFechas[n].isAfter(arrayFechas[i])) {
                    LocalDate aux = arrayFechas[i];
                    arrayFechas[i] = arrayFechas[n];
                    arrayFechas[n] = aux;
                }
            }
        }
        //*****************************
        //SALIDA DE DATOS
        //*****************************
        System.out.println(fechasDiaSemana);
        System.out.printf("La fecha m�s reciente es: %s y la fecha m�s antigua es %s%n", fechaMasReciente.format(formatoFecha), fechaMasAntigua.format(formatoFecha));
        System.out.printf("Existe %d d�as de diferencia entre las fechas m�s pr�ximas.%n",Period.between(arrayFechas[0], arrayFechas[1]).getDays());
    }

}

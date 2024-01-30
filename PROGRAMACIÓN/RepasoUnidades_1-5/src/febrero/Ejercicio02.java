package febrero;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


import java.time.LocalDate;

/**
 * @author Francisco Guti�rrez Ruiz
 * @version 1.0
 * @since 2024/02/07
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------
        // Constantes
        final int ANNO = 2023; // A�o a tratar
        final int MIN_FECHAS = 20; // M�nimo de n�mero de fechas 
        final int MAX_FECHAS = 30; // M�ximo de n�mero de fechas

        // Variables de entrada
        int numFechas = 0; // Cantidad de fechas
        LocalDate[] fecha; // Declaraci�n de un array de objetos de tipo LocalDate para las fechas
        LocalDate fechaMenor; // Objeto LocalDate para la fecha m�s antigua
        LocalDate fechaMayor; // Objeto LocalDate para la fecha m�s moderna

        Random aleatorio; // Objeto random
        int dia; // D�a
        int maxDia; // Ultimo d�a del mes
        int mes; // Mes

        // Variables de salida
        StringBuilder listadoFechas;

        // Variables auxiliares
        boolean fechaCorrecta; // Controla la salida del bucle
        String fechaFormateada; // Fecha con formato

        // Objeto Scanner para lectura desde teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        do { // Repite mientras el n�mero no sea correcto
            fechaCorrecta = true;
            try { // Controla que se introduce un n�mero
                System.out.print("Introduzca el n�mero de fechas: ");
                numFechas = teclado.nextInt();
                if (numFechas < MIN_FECHAS || numFechas > MAX_FECHAS) {
                    System.out.printf("El n�mero debe estar entre %d y %d", MIN_FECHAS, MAX_FECHAS);
                    fechaCorrecta = false;
                }
            } catch (Exception e) { // No se ha introducido un n�mero
                System.out.println("El valor introducido no es v�lido");
                fechaCorrecta = false;
            }
        } while (!fechaCorrecta);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        fecha = new LocalDate[numFechas]; // Creamos el array de fechas
        aleatorio = new Random(); // Creamos el n�mero aleatorio
        for (int i = 0; i < numFechas; i++) { // Recorremos el array de fechas
            mes = aleatorio.nextInt(1, 12); // Mes aleatorio
            fecha[i] = LocalDate.of(ANNO, mes, 1); // Establecemos el d�a 1 del mes aleatorio (podr�a hacerse tambi�n en una variable temporal)
            maxDia = fecha[i].lengthOfMonth(); // Obtenemos el �ltimo d�a del mes
            dia = aleatorio.nextInt(1, maxDia); // D�a aleatorio entre el 1 y el d�a m�ximo del mes
            fecha[i] = LocalDate.of(ANNO, mes, dia); // Creamos la fecha correcta y la guardamos en el array
        } // Fin for

        listadoFechas = new StringBuilder(""); // Creamos un objeto StringBuilder para ir creando la salida
        fechaMenor = LocalDate.of(ANNO, 12, 31); // Para ir retrocediendo y buscar la fecha m�s antigua partimos del �ltimo d�a del a�o
        fechaMayor = LocalDate.of(ANNO, 1, 1); // Para ir avanzando y buscar la fecha m�s moderna partimos del primer d�a del a�o

        for (int i = 0; i < numFechas; i++) { // Recorremos el array de fechas
            fechaFormateada = fecha[i].format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); // Damos formato a la fecha
            String diaSemana = fecha[i].getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES")); // Obtenemos el d�a de la semana en castellano
            listadoFechas.append(fechaFormateada).append(" - ").append(diaSemana).append("\n"); // A�adimos los datos al objeto StringBuilder
            fechaMenor = (fecha[i].isBefore(fechaMenor)) ? fecha[i] : fechaMenor; // Si la fecha m�s antigua por ahora es mayor que la del elemento del array, la sustituimos
            fechaMayor = (fecha[i].isAfter(fechaMayor)) ? fecha[i] : fechaMayor; // Si la fecha m�s moderna por ahora es menor que la del elemento del array, la sustituimos
        } // Fin for

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println(Arrays.toString(fecha));
        System.out.println("La fecha m�s antigua es: " + fechaMenor.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("La fecha m�s reciente es: " + fechaMayor.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    } // Fin main

} // Fin class

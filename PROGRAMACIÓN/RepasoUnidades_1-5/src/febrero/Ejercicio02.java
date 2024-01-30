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
 * @author Francisco Gutiérrez Ruiz
 * @version 1.0
 * @since 2024/02/07
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        final int ANNO = 2023; // Año a tratar
        final int MIN_FECHAS = 20; // Mínimo de número de fechas 
        final int MAX_FECHAS = 30; // Máximo de número de fechas

        // Variables de entrada
        int numFechas = 0; // Cantidad de fechas
        LocalDate[] fecha; // Declaración de un array de objetos de tipo LocalDate para las fechas
        LocalDate fechaMenor; // Objeto LocalDate para la fecha más antigua
        LocalDate fechaMayor; // Objeto LocalDate para la fecha más moderna

        Random aleatorio; // Objeto random
        int dia; // Día
        int maxDia; // Ultimo día del mes
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
        do { // Repite mientras el número no sea correcto
            fechaCorrecta = true;
            try { // Controla que se introduce un número
                System.out.print("Introduzca el número de fechas: ");
                numFechas = teclado.nextInt();
                if (numFechas < MIN_FECHAS || numFechas > MAX_FECHAS) {
                    System.out.printf("El número debe estar entre %d y %d", MIN_FECHAS, MAX_FECHAS);
                    fechaCorrecta = false;
                }
            } catch (Exception e) { // No se ha introducido un número
                System.out.println("El valor introducido no es válido");
                fechaCorrecta = false;
            }
        } while (!fechaCorrecta);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        fecha = new LocalDate[numFechas]; // Creamos el array de fechas
        aleatorio = new Random(); // Creamos el número aleatorio
        for (int i = 0; i < numFechas; i++) { // Recorremos el array de fechas
            mes = aleatorio.nextInt(1, 12); // Mes aleatorio
            fecha[i] = LocalDate.of(ANNO, mes, 1); // Establecemos el día 1 del mes aleatorio (podría hacerse también en una variable temporal)
            maxDia = fecha[i].lengthOfMonth(); // Obtenemos el último día del mes
            dia = aleatorio.nextInt(1, maxDia); // Día aleatorio entre el 1 y el día máximo del mes
            fecha[i] = LocalDate.of(ANNO, mes, dia); // Creamos la fecha correcta y la guardamos en el array
        } // Fin for

        listadoFechas = new StringBuilder(""); // Creamos un objeto StringBuilder para ir creando la salida
        fechaMenor = LocalDate.of(ANNO, 12, 31); // Para ir retrocediendo y buscar la fecha más antigua partimos del último día del año
        fechaMayor = LocalDate.of(ANNO, 1, 1); // Para ir avanzando y buscar la fecha más moderna partimos del primer día del año

        for (int i = 0; i < numFechas; i++) { // Recorremos el array de fechas
            fechaFormateada = fecha[i].format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); // Damos formato a la fecha
            String diaSemana = fecha[i].getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES")); // Obtenemos el día de la semana en castellano
            listadoFechas.append(fechaFormateada).append(" - ").append(diaSemana).append("\n"); // Añadimos los datos al objeto StringBuilder
            fechaMenor = (fecha[i].isBefore(fechaMenor)) ? fecha[i] : fechaMenor; // Si la fecha más antigua por ahora es mayor que la del elemento del array, la sustituimos
            fechaMayor = (fecha[i].isAfter(fechaMayor)) ? fecha[i] : fechaMayor; // Si la fecha más moderna por ahora es menor que la del elemento del array, la sustituimos
        } // Fin for

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println(Arrays.toString(fecha));
        System.out.println("La fecha más antigua es: " + fechaMenor.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("La fecha más reciente es: " + fechaMayor.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    } // Fin main

} // Fin class

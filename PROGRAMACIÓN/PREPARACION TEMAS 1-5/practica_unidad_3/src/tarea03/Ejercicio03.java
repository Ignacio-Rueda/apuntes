package tarea03;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Ejercicio 3: Día de cumpleaños
 *
 * @author profe
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        // Variables de entrada
        int contadorCoincidencias=0;
        int anioEntrada = 0;//Insertado por el usuario.
        int mesNacimiento = 0; //Insertado por el usuario.
        int diaNacimiento = 0; //Insertado por el usuario.
        int numeroDiasMesNacimiento = 0;
        int diasMesBuscado = 0;
        String diaSeleccionado = "";
        String diaNacimientoStr = "";
        String resultadoFechas ="";//Fechas almacenadas cuando recorremos el último bucle.
        // Variables de salida
        // Variables auxiliares
        // Objeto Scanner para lectura desde teclado
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("DÍA DE CUMPLEAÑOS");
        System.out.println("-----------------");

        // 1. Entrada de datos: lectura de año de nacimiento
        // 1.1.- Leer y comprobar el año de nacimiento (entre 1900 y año actual)
        do {
            try {
                System.out.printf("Introduzca año de entrada (entre 1900 y año actual)%n");
                Scanner teclado = new Scanner(System.in);
                anioEntrada = teclado.nextInt();
            } catch (InputMismatchException ex) {
                System.out.printf("Error de lectura: año incorrecto.%n");
            }
        } while (anioEntrada < 1900);
        // 1.2.- Leer y comprobar el mes de nacimiento 
        do {
            try {
                System.out.printf("Introduzca mes de nacimiento (1-12)%n");
                Scanner teclado = new Scanner(System.in);
                mesNacimiento = teclado.nextInt();
            } catch (InputMismatchException ex) {
                System.out.printf("Error de lectura: mes incorrecto%n");
            }
        } while (!(mesNacimiento >= 1 && mesNacimiento <= 12));
        // 1.3.- Averiguamos cuántos días tiene el mes de nacimiento
        fechaNacimiento = LocalDate.of(anioEntrada, mesNacimiento, 1);
        numeroDiasMesNacimiento = fechaNacimiento.lengthOfMonth();

        // 1.4.- Leer y comprobar el día de nacimiento 
        do {
            try {
                System.out.printf("Introduzca día nacimiento%n");
                Scanner teclado = new Scanner(System.in);
                diaNacimiento = teclado.nextInt();
            } catch (InputMismatchException ex) {
                System.out.printf("Error de lectura: dia incorrecto %n");
            }

        } while (diaNacimiento > numeroDiasMesNacimiento || diaNacimiento < 1);
        fechaNacimiento = LocalDate.of(anioEntrada,mesNacimiento, diaNacimiento);
        //----------------------------------------------
        //    Procesamiento + Salida de resultados  
        //----------------------------------------------
        //2.- Cálculo del día de la semana en que cayó el nacimiento 
        diaNacimientoStr = fechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es","ES"));
        System.out.printf("El día que naciste fue: %s%n",diaNacimientoStr);
        // 3.- Recorremos desde el año posterior al año de nacimiento hasta el año actual (bucle)
        for(int n=anioEntrada+1;n<fechaActual.getYear();n++){
            fechaNacimiento = LocalDate.of(n,mesNacimiento, 1);//Comprobar si tiene los mismos días el mes actual que el de nacimiento, para el caso de febrero.
            diasMesBuscado = fechaNacimiento.lengthOfMonth();
            
            if(diasMesBuscado == numeroDiasMesNacimiento){//Si el número de días del mes recorrido son los mismos que el de nacimiento entramos en la condicional
                fechaNacimiento = LocalDate.of(n, mesNacimiento, diaNacimiento);
                diaSeleccionado = fechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL,new Locale ("es","ES"));
                if(diaSeleccionado.equals(diaNacimientoStr)){
                    resultadoFechas += String.valueOf(fechaNacimiento.format(formatoFecha))+"\n";
                    contadorCoincidencias++;
                }
            }
        }
        // 4.- Mostramos por pantalla el número de coincidencias
        System.out.printf(resultadoFechas);
        System.out.printf("Número total de coincidencias: %d%n",contadorCoincidencias);
        
    }
}

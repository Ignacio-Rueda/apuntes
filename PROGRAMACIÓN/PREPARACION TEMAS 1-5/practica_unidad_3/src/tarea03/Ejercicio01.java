package tarea03;

import java.awt.BorderLayout;
import java.util.InputMismatchException;
import libtarea3.Teatro;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 1: Trabajo con teatros
 *
 * @author Profe
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // 1.2. Declaración de constante para dar formato de fecha hora 
        final DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH':'mm':'ss");
        final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        // 1.1. Declaración de tres variables referencia a objetos instancia de la clase Teatro
        Teatro teatro1, teatro2, teatro3;

        // Clase Scanner para petición de datos de entrada (no es necesario)
        //----------------------------------------------
        //              Presentación
        //----------------------------------------------
        System.out.println("TRABAJO CON TEATROS");
        System.out.println("--------------------");
        System.out.println();

        //----------------------------------------------
        //               Análisis inicial
        //----------------------------------------------        
        // 2. Consulta de valores iniciales
        System.out.println("1.-CONSULTA INICIAL DE VALORES GLOBALES");
        System.out.println("---------------------------------------");
        System.out.println();

        // 2.1. Número de teatros creados hasta el momento
        System.out.printf("Número de teatros creados hasta el momento: %d%n", Teatro.getTeatrosTotales());

        // 2.2. Número de obras que se están represenando en este momento en todos los teatros
        System.out.printf("Número de obras que se están representando en este momento: %d%n", Teatro.getObrasActivas());

        //2.3. Número de entradas vendidas en todos los teatros y para todas las obras que se han representado hasta el momento
        System.out.printf("Número de entradas vendidas hasta el momento: %d%n", Teatro.getEntradasVendidasTotales());

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // En realidad no hay entrada de datos como tal dado que la información 
        // de entrada es fija y siempre la misma
        System.out.println("\n2.-CREACIÓN Y USO DE TEATROS");
        System.out.println("------------------------------\n");

        // 3.- Instanciación de tres objetos Teatro
        System.out.println("Creación de teatros (constructores)");
        System.out.println("-------------------------------------");

        // 3.1.- Intento de crear un teatro con un aforo inferior (hay que gestionar la posible excepción)
        System.out.printf("Intentando crear un teatro con un aforo inferior...%n");
        try {
            teatro1 = new Teatro("Teatro Cervantes", 299);
        } catch (IllegalArgumentException e) {//Utilizo este tipo de excepción porque el argumento no es válido ya que debe ser superior a los 300.
            System.out.printf("%s%n", e.getMessage());
        }
        // 3.2.- Intento de crear un teatro con un aforo superior (hay que gestionar la posible excepción)
        System.out.printf("Intentando crar un teatro con un aforo superior...%n");
        try {
            teatro2 = new Teatro("Teatro Apolo", 1001);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s%n", e.getMessage());
        }

        // 3.3.- Intento de crear un teatro con un nombre de teatro vacío y aforo por defecto
        System.out.printf("Intentando crear un teatro con un nombre vacío y aforo por defecto...%n");
        try {
            teatro3 = new Teatro("");
        } catch (IllegalArgumentException e) {
            System.out.printf("%s%n", e.getMessage());
        }

        // 3.4.- Creación de un primer teatro usando el constructor de dos parámetros
        System.out.printf("Creando un teatro con afor válido con un constructor con dos parámetros...%n");
        teatro1 = new Teatro("Teatro Cervantes", 900);
        System.out.printf("Teatro1 creado, estado: %s%n", teatro1);

        // 3.5.- Creación de un segundo teatro con un aforo por defecto usando el constructor de un parámetro        
        System.out.printf("%s%n", "Creando teatro con aforo por defecto usando un constructor con un parámetro...");
        teatro2 = new Teatro("Teatro Apolo");
        System.out.printf("Teatro2 creado, estado: %s%n", teatro2);

        // 3.6.- Creación de un tercer teatro usando el constructor sin parámetros        
        System.out.printf("%s%n", "Creando teatro con valores por defecto usando un constructor sin parámetros...");
        teatro3 = new Teatro();
        System.out.printf("Teatro3 creado, estado: %s%n", teatro3);

        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        // Dado que se va a ir mostrando información de salida a la vez que 
        // se van realizando operaciones, podemos considerar en este caso
        // que el procesamiento y la salida de resultado van unidos y "mezclados"
        // 4.- Operaciones con teatros
        System.out.println("Manipulación de teatros (métodos)");
        System.out.println("-----------------------------------");

        // 4.1.- Intento de terminar de representar una obra a un teatro que no tiene obra asignada (debemos capturar el error)
        System.out.printf("Terminando de representar obra en el primer teatro...%n");
        try {
            teatro1.terminarObra();
        } catch (IllegalStateException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }

        //4.2.- Asignamos una obra al teatro1 y lo llenamos (debemos comprobar antes si podemos asignarla)
        System.out.printf("Asignando una obra de teatro...%n");
        //Comprobar si tiene obra asignada.
        if (!teatro1.tieneObra()) {
            teatro1.asignarObra("La vida es sueño");
            teatro1.llenarTeatro();
            System.out.printf("Se ha asignado '%s' al teatro '%s'.%n", teatro1.getObra(), teatro1.getNombreTeatro());
            System.out.printf("Teatro lleno. Se han vendido %d entradas.%n", teatro1.getEntradasVendidas());////////////////////////////////////DUDA!!!! TEATRO LLENO?? ALGÚN MÉTODO????
        }

        //4.3.- Devolvemos 50 entradas del teatro1 (puesto que acabamos de llenar el teatro, no es necesario comprobar si podemos devolver entradas)
        teatro1.devolverEntradas(50);

        //4.4.- Intentamos traspasar la representación de la obra del teatro1 al teatro2 (hay que gestionar la posible excepción)
        System.out.printf("Intentando traspasar una obra de un teatro a otro...%n");
        try {
            teatro1.traspasarObra(teatro2);
        } catch (IllegalStateException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }

        //4.5.- Devolvemos otras 50 entradas del teatro1 (no es necesario comprobar si podemos devolver entradas)
        teatro1.devolverEntradas(50);

        //4.6.- Volvemos a intentar traspasar la obra del teatro1 al teatro2 (ahora no debe dar excepción)
        teatro1.traspasarObra(teatro2);
        System.out.printf("Traspaso realizado con éxito.");

        //4.7.- Devolver una entrada del teatro2
        teatro2.devolverEntradas(1);
        //5.- Obtención de información del segundo teatro creado
        System.out.println("\nPrueba de los getters del segundo teatro creado:");
        System.out.println("----------------------------------------------------");
        System.out.printf("Fecha de realización de la prueba %s %s%n",LocalDate.now().format(formatoFecha),LocalTime.now().format(formatoHora));
        
        System.out.printf("%s%n",teatro2.getNombreTeatro());
        
        System.out.printf("%22s Nombre del teatro: '%s'%n","Código del teatro: ",teatro2.getCodigoTeatro(),teatro2.getNombreTeatro());
        System.out.printf("%9s %d%n","Aforo:",teatro2.getAforo());
        System.out.printf("%2s Estado: %n","");
        System.out.printf("%4s Se está representando la obra de teatro: \"%s\" %n%4s Entradas vendidas: %d%n%n","",teatro2.getObra(),"",teatro2.getEntradasVendidas());
        
        //----------------------------------------------
        //               Análisis Final
        //----------------------------------------------        
        // 6. Consulta de valores finales
        System.out.println("3.-CONSULTA FINAL DE VALORES GLOBALES");
        System.out.println("-------------------------------------");
        System.out.println();

        // 6.1. Número de teatros creados hasta el momento
        System.out.printf("Número de teatros creados hasta el momento: %d%n",Teatro.getTeatrosTotales());
        // 6.2. Número de obras que se están represenando en este momento en todos los teatros
        System.out.printf("Número de obras que se están representando en este momento en todos los teatros %d%n",Teatro.getObrasActivas());
        //6.3. Número de entradas vendidas en todos los teatros y para todas las obras que se han representado hasta el momento
        System.out.printf("Númer de entradas vendidas en todos los teatros y para todas las obras que se han representado hasta el momento %d%n",Teatro.getEntradasVendidasTotales());
    }

}

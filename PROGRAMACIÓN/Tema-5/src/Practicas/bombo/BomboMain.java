/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practicas.bombo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class BomboMain {

    public static void main(String[] args) {
        boolean capacidadBombo = false;
        Bombo bombo = null;
        System.out.printf("BOMBO DE UN BINGO%n");
        System.out.printf("-----------------%n");

        System.out.printf("Prueba del constructor sin parámetros%n");
        bombo = new Bombo();

        System.out.printf("Creado objeto: ");
        System.out.printf(bombo.toString());

        System.out.printf("Prueba del constructor con parámetros%n");
        //Mientras no se inserte un número válido de bolas, repetiremos el mensaje.
        Bombo b2 = null;
        while (!capacidadBombo) {
            Scanner teclado = new Scanner(System.in);
            System.out.printf("Introduzca el número de bolas (9-90):");
            int capacidad = teclado.nextInt();
            try {
                b2 = new Bombo(capacidad);
                capacidadBombo = true;
            } catch (Exception ex) {
                System.out.printf("Error: %s%n", ex.getMessage());
            }
        }

        System.out.printf("Prueba del getNumBolas:");
        System.out.println(b2.getCapacidad());

        System.out.printf("Prueba del getNumBolasExtraidas");
        System.out.println(b2.getCantidadBolasExtraidas());

        System.out.printf("Prueba del getNumBolasRestantes");
        System.out.println(b2.getCantidadBolasRestantes());

        System.out.printf("Prueba del toString:");
        System.out.println(b2.toString());

        System.out.printf("Pruebas de extraccción: ");
        for (int n = 0; n <= b2.getCapacidad(); n++) {
            try {
                System.out.print(b2.extraccionBola() + " ");
            } catch (Exception ex) {
                System.out.printf("%nError: %s%n", ex.getMessage());
            }
        }

        System.out.printf("Estado actual del bombo: %s%n", b2.toString());

        System.out.println("PRUEBA DE BOMBO MEJORADO");
        System.out.println("------------------------");

        System.out.printf("Instanciando bombo de capacidad 9 bolas.%n");
        Bombo bomboMejorado = null;
        try {
            bomboMejorado = new Bombo(9);
        } catch (Exception ex) {
            System.out.printf("Error: %s%n", ex.getMessage());
        }

        System.out.printf("Bombo creado.%n");
        System.out.printf("Estado inicial del bombo: %s%n", bomboMejorado.toString());
        //Obtenemos el array con los datos
        short bolasExtraidas[] = bomboMejorado.getBolasExtraidas();
        System.out.printf("Extraídas %s%n", Arrays.toString(bolasExtraidas));

        //Obtenemos el array con los datos
        short bolasRestantes[] = bomboMejorado.getBolasRestantes();
        System.out.printf("Restantes %s%n", Arrays.toString(bolasRestantes));

        System.out.printf("Prueba de extracción");

        
        for (int n = 0; n < 9; n++) {
            System.out.printf("Bola extraída: %d%n", bomboMejorado.extraccionBola());
            System.out.printf("Array bolas extraídas %s%n", Arrays.toString(bomboMejorado.getBolasExtraidas()));
            System.out.printf("Array bolas restantes %s%n", Arrays.toString(bomboMejorado.getBolasRestantes()));
        }
           
        
    }

}

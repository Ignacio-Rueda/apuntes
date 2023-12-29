/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practicas.ticket;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ignacio Rueda
 */
public class TicketMain {

    public static void main(String[] args) {
        //Comprobamos constructor sin parámetros.
        Ticket t1;
        try {
            t1 = new Ticket();
            System.out.println(t1.getId());
            System.out.println(t1.getFecha());
            try {
                System.out.printf("Tratamos de usar un ticket 1 vez%n");
                t1.usar();
                System.out.printf("%s%n", t1.toString());
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            try {
                System.out.printf("Tratamos de usar un ticket 2 vez%n");
                t1.usar();
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }

        //Comprobamos constructor con parámetros.
        //Recibimos la fecha
        int dia = 28;
        int mes = 12;
        int anio = 2023;
        LocalDate fechaConstructor = LocalDate.of(anio, mes, dia);
        try {
            Ticket t2 = new Ticket(fechaConstructor);
            System.out.println(t2.getId());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("Mostramos el ticket generado por el método randomEstemes");
        try {
            Ticket ticketMesRandom = Ticket.randomEsteMes();
            System.out.println(ticketMesRandom.toString());
        } catch (Exception ex) {
            System.out.println("Error: "+
            ex.getMessage());
        }
        
         System.out.println("Mostramos el ticket generado por el método random");
        try {
            Ticket ticketRandom = Ticket.random();
            System.out.println(ticketRandom.toString());
        } catch (Exception ex) {
            System.out.println("Error: "+
            ex.getMessage());
        }
     
        
    
    }//Fin método main.

}

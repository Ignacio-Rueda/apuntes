/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas.ticket;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ignacio Rueda
 */
public class Ticket {

    //Variables objeto.
    private boolean usado;
    private boolean finDeSemana;
    private final String id;
    private final LocalDate fechaUso;
    private LocalTime horaUso;
    public StringBuilder secuencia = new StringBuilder("00000000");

    //Variables clase.
    public static final int NUMERO_SECUENCIA_MAXIMO = 99999999;
    public static int NUMERO_SECUENCIA_ACTUAL = 0;
    public static LocalDate FECHA_ACTUAL = LocalDate.now();

    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm");

    /*----------------------------------------
                CONSTRUCTORES
    ---------------------------------------*/
    //Constructor con parámetros.
    public Ticket(LocalDate fechaIntroducida) throws IllegalArgumentException,IllegalStateException {

        if(fechaIntroducida == null){
            throw new IllegalArgumentException("Fecha inválida (null)");
        }
        //Lanzamos una excepción si la fecha es anterior a la actual.
        LocalDate fechaActual = LocalDate.now();
        if (fechaIntroducida.isBefore(fechaActual)) {
            throw new IllegalArgumentException("No puedes introducir una fecha anterior a la actual");
        }
        //Lanzamos una excepción si el año de la fecha es posterior al actual.
        if (fechaIntroducida.getYear() > fechaActual.getYear()) {
            throw new IllegalStateException("Año introducido no válido");
        }

        //Comprobar si podemos añadir un ticket mas al año.
        if (Ticket.NUMERO_SECUENCIA_ACTUAL < Ticket.NUMERO_SECUENCIA_MAXIMO) {
            Ticket.NUMERO_SECUENCIA_ACTUAL++;
            //Sustituir el valor en la secuencia.
            secuencia.replace(secuencia.length() - (String.valueOf(Ticket.NUMERO_SECUENCIA_ACTUAL).length()), secuencia.length(), String.valueOf(Ticket.NUMERO_SECUENCIA_ACTUAL));

            //Unir el año de la fecha con la secuencia.
            id = String.valueOf(fechaIntroducida.getYear()) + "-" + secuencia;
            //Establecer fecha de uso.
            fechaUso = fechaIntroducida;

        } else {
            throw new IllegalArgumentException("No puedes crear más ticket este año");
        }

    }
    //Constructor sin parámetros

    public Ticket() throws IllegalArgumentException {
        //Generar un ticket para ser usado en la fecha actual (hoy).
        this(LocalDate.now());
    }

    /*-------------------------------
                MÉTODOS
    ---------------------------------*/
    public String getId() {
        return id;
    }

    public String getFecha() {
        return "";
    }

    public boolean isUsado() {
        return true;
    }

    public boolean isFinDeSemana() {
        return true;
    }

    public void usar() throws IllegalStateException {
        //Comprobamos si ya ha sido usado.
        if (this.usado) {
            throw new IllegalStateException("Este ticket ya ha sido utilizado");
        }
        //Si esta en fecha de uso y como hemos saltado la excepción anterior, es usable: lo marcamos como usado y registramos la hora.
        if (LocalDate.now().equals(fechaUso)) {
            this.usado = true;
            this.horaUso = LocalTime.now();

        } else {
            throw new IllegalStateException("Fecha de uso no válida");
        }
    }

    public String toString() {
        String resultado = String.format("{ID: %s, Fecha:%s, Usado: %s}",
                this.id,
                this.fechaUso.format(formatoFecha),
                this.usado ? this.horaUso.format(formatoHora) : "no"
        );
        return resultado;
    }

    public static Ticket randomEsteMes() {
        Ticket ticketRandom;
        //Generar una fecha aleatoria del mes actual.
        //Para ello debemos obtener el número de días del mes actual.
        int totalDiasMesActual = Ticket.FECHA_ACTUAL.lengthOfMonth();
        int diaActual = Ticket.FECHA_ACTUAL.getDayOfMonth();
        int diaRandom = (int) (Math.random() * (totalDiasMesActual - diaActual + 1));
        //Una vez que tenemos el día aleatorio pasamos la fecha al constructor.
        LocalDate fechaRandom = LocalDate.of(Ticket.FECHA_ACTUAL.getYear(), Ticket.FECHA_ACTUAL.getMonth(), diaRandom);
        ticketRandom = new Ticket(fechaRandom);
        return ticketRandom;
    }

    public static Ticket random() {

        int diaActual = Ticket.FECHA_ACTUAL.getDayOfYear();

        int ultimoDia = 365 + (Ticket.FECHA_ACTUAL.isLeapYear() ? 1 : 0);

        int diasRandom = (int) (Math.random() * (ultimoDia - diaActual + 1));

        LocalDate fechaRandom = Ticket.FECHA_ACTUAL.plusDays(diasRandom);

        Ticket ticket = new Ticket(fechaRandom);
        return ticket;
    }
}

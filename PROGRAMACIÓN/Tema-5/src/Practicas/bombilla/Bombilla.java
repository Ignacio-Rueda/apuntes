/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas.bombilla;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * estado
 *
 * @author Ignacio Rueda
 */
public class Bombilla {

    //Atributos objeto.
    private boolean estado;
    private int vecesEncendia;
    private double tiempoEncendida;
    private LocalDateTime ultimaVezEncendida;

    //Atributos clase.
    private static int bombillasCreadas;
    private static int bombillasEncendidas;
    private static double consumoBombillas;

    private final double potencia; //(vatios)
    //Atributos de clase constante.
    public static final boolean DEFAULT_ESTADO_INICIAL = false;
    public static final double DEFAULT_MAXIMA_POTENCIA = 200;
    public static final double DEFAULT_MINIMA_POTENCIA = 10;
    public static final double DEFAULT_POTENCIA = 60;

    //Declaración constructores
    public Bombilla(boolean estadoInicial, double potencia) throws IllegalArgumentException {
        if (potencia < Bombilla.DEFAULT_MINIMA_POTENCIA || potencia > Bombilla.DEFAULT_MAXIMA_POTENCIA) {
            throw new IllegalArgumentException(String.format("Potencia no válida: %.2f", potencia));
        }
        this.estado = estadoInicial;
        //Si el primer estado es encendida, ya ha sido encendida una vez.
        this.vecesEncendia = estadoInicial ? 1 : 0;
        //Actualizar atributos de clase
        Bombilla.bombillasCreadas++;
        Bombilla.bombillasEncendidas += this.estado ? 1 : 0;
        this.potencia = potencia;

        //Si la bombilla comienza como encendida, registramos el instante actual como el instante de encendido
        if (this.estado) {
            this.ultimaVezEncendida = LocalDateTime.now();
        } else {
            this.ultimaVezEncendida = null;
        }
    }

    public Bombilla(double potencia) throws IllegalArgumentException {
        this(Bombilla.DEFAULT_ESTADO_INICIAL, potencia);
    }

    public Bombilla(boolean estadoInicial) {
        this(estadoInicial, Bombilla.DEFAULT_POTENCIA);

    }

    public Bombilla(){
        this(Bombilla.DEFAULT_ESTADO_INICIAL);
    }
    
    public boolean getEstado() {
        return this.estado;
    }

    public int getVecesEncendia() {
        return this.vecesEncendia;
    }

    public boolean isEncendida() {
        return this.estado;
    }

    public boolean isApagada() {
        return !this.estado;
    }

    public static int getBombillasCreadas() {
        return Bombilla.bombillasCreadas;
    }

    public static int getBombillasEncendidas() {
        return Bombilla.bombillasEncendidas;
    }

    @Override
    public String toString() {
        String resultado = String.format("Bombilla %s. Se ha encendido %d %s%n",
                this.estado ? "encendia" : "apagada",
                this.vecesEncendia,
                this.vecesEncendia > 1 ? "veces" : "vez"
        );

        return resultado;
    }

    //Métodos de acción.
    public void encender() throws IllegalStateException {
        if (!this.estado) {
            //Encendemos la bombilla.
            this.estado = true;
            //Aumentamos el número de veces encendida.
            this.vecesEncendia++;
            //Aumentamos el número de bombillas encendidas.
            Bombilla.bombillasEncendidas++;
            this.ultimaVezEncendida = LocalDateTime.now();//Registramos momento actual.

        } else {
            throw new IllegalStateException("Intentando encender bombilla ya encendida");
        }
    }

    public void apagar() throws IllegalStateException {
        if (!this.estado) {
            throw new IllegalStateException("No puedes apagar la bombilla, puesto que ya lo está");
        } else {
            //Apagamos la bombilla.
            this.estado = false;
            //Restamos el número de bombillas encendidas.
            Bombilla.bombillasEncendidas--;
            this.tiempoEncendida+= this.ultimaVezEncendida.until(LocalDateTime.now(),ChronoUnit.SECONDS)/3600;
            this.ultimaVezEncendida = null;
        }
    }

    public void conmutar() {

        //Si está encendia, la apagamos.
        if (this.estado) {
            this.estado = false;
            //Restamos el número de bombillas encendidas.
            Bombilla.bombillasEncendidas--;
        } else {
            //Sumamos el número de bombillas encendidas.
            Bombilla.bombillasEncendidas++;
            //Aumentamos el número de veces encendida.
            this.vecesEncendia++;
            this.estado = true;
        }
    }

    public double getPotencia(){
        return this.potencia;
    }
    
    private double calcularTiempoEncendida(){
    double primerTramo = this.tiempoEncendida;
    double segundoTramo = 0.0;
    
    
    //Calcular el segundo tramo de tiempo encendida
    //Ddesde que se encendió la última vez hasta el instante actual.
    
    if(this.ultimaVezEncendida != null){
        segundoTramo = this.ultimaVezEncendida.until(LocalDateTime.now(), ChronoUnit.SECONDS)/3600.0; //Calculo en horas
    }
    //Sumamos el primer tramo y el segundo tramo de tiempo encendida
    return primerTramo+segundoTramo;
    
    }
    
    public double getPotenciaConsumida(){
        return calcularTiempoEncendida()*this.potencia;
    }
}

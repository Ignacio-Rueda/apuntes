/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas.bombo;

/**
 *
 * @author Ignacio Rueda
 */
public class Bombo {

    //Declaración atributos clase.
    private final static int NUM_MIN_BOLAS = 9;
    private final static int NUM_MAX_BOLAS = 90;
    private final static int DEFAULT_NUM_BOLAS = 60;

    //Declaración atributos objeto.
    private final int capacidadMaxBombo;
    private short[] registroBolas;
    short[] bolasExtraidas;//Array para almacenar todas la bolas extraídas, lo hago de este modo, para poder guardar el orden en el que van saliendo.
    private short contadorBolasExtraidas =0; //Declaro el contador fuera del método para que no se reinicie cada vez que sea invocado.
    

    //Declaración constructores.
    public Bombo(int capacidadMaxBombo) throws IllegalArgumentException {
        //Comprobar si la capacidad que se inserta es adecuada.
        if (capacidadMaxBombo < Bombo.NUM_MIN_BOLAS || capacidadMaxBombo > Bombo.NUM_MAX_BOLAS) {
            throw new IllegalArgumentException("Capacidad no permitida");
        }
        this.capacidadMaxBombo = capacidadMaxBombo;
        this.registroBolas = new short[capacidadMaxBombo];//En este array todos los números posibles.
        this.bolasExtraidas = new short[this.capacidadMaxBombo];//En este array tenemos todas las posiciones posibles pero solo almacenaremos en las que vayan saliendo.
    }

    public Bombo() throws IllegalArgumentException {
        this(Bombo.DEFAULT_NUM_BOLAS);
    }

    //Métodos.
    public int getCapacidad() {
        return this.capacidadMaxBombo;//Número de bolas cuando esté lleno.
    }

    public int getCantidadBolasRestantes() {//Número de bolas restantes.
        int contador = 0;
        for (int n = 0; n < this.registroBolas.length; n++) {
            if (this.registroBolas[n] == 0) {//Contamos todas aquellas posiciones que tengan un cero.
                contador++;
            }
        }
        return contador;
    }

    public int getCantidadBolasExtraidas() {//Obtenemos la diferencia entre la capacidad del bombo y las bolas que quedan en el bombo.
        return this.getCapacidad() - this.getCantidadBolasRestantes();
    }

    public boolean isCompleto() {//Comprobamos si el número de bolas restantes coincide con la capacidad máxima.
        return this.getCantidadBolasExtraidas() == this.getCapacidad() ? true : false;
    }

    public boolean isVacio() {
        return !isCompleto();
    }
    @Override
    public String toString() {
        String resultado = String.format("Capacidad: %d bolas. Cantidad de bolas extraidas: %d%n",
                this.capacidadMaxBombo,
                this.getCantidadBolasExtraidas()
        );
        return resultado;
    }

    public int extraccionBola() throws IllegalStateException {
        //Comprobar que es posible sacar una bola más.
        if (this.isCompleto()) {
            throw new IllegalStateException("Bombo vacío");
        }
        
        boolean bolaCorrecta = false;
        int bola = 0;
        while (!bolaCorrecta) {
            bola = (int) (1 + Math.random() * (this.capacidadMaxBombo));
            //Comprobar si esa bola ya ha salido.
            if (this.registroBolas[bola - 1] == 0) {
                bolaCorrecta = true;
                this.registroBolas[bola - 1] = 1;//Marcamos en la posición (numero de bola) un 1 como señal de que ya ha salido este número.
                this.bolasExtraidas[this.contadorBolasExtraidas] =(short)bola;//Introducimos en la posición que corresponda (contadorBolasExtraidas) el número de bola, de este modo podemos saber el orden en el que han ido saliendo.
            }
        }
        this.contadorBolasExtraidas++;
        return bola;
    }

    //Resetear el bombo a cero.
    public int reset() {
        this.registroBolas = new short[this.capacidadMaxBombo];
        return this.getCantidadBolasExtraidas();
    }

    /*
        Obtener un array con los números de bola que quedan en el bombo.
     */
    public short[] getBolasRestantes() {
        //Creamos un array para almacenar las bolas que quedan en el bombo.
        short[] bolasRestantes = new short[this.getCantidadBolasRestantes()];
        //Contador para poder iterar en el array que hemos creado.
        int contador = 0;
        //Recorremos el array original donde guardamos un 1 si ya ha salido una bola.
        for (int n = 0; n < this.registroBolas.length; n++) {
            if (this.registroBolas[n] == 0) {//Si en esta posición no existe el 1, quiere decir que esta bola no ha salido.
                bolasRestantes[contador] = (short) (n + 1);
                contador++;
            }
        }
        return bolasRestantes;
    }

    /*
        Obtener un array con los números de bolas que han salido.
     */

    public short[] getBolasExtraidas() {
        
        short[]mostrarBolasExtraidas = new short[this.getCantidadBolasExtraidas()];
        //Contador para poder iterar en el array que hemos creado.
        int contador = 0;

        //Recorremos el array original donde guardamos un 1 si ya ha salido una bola.
        for (int n = 0; n < mostrarBolasExtraidas.length; n++) {
            if (this.bolasExtraidas[n] != 0) {
                mostrarBolasExtraidas[n]=this.bolasExtraidas[n];
            }
        }
        return mostrarBolasExtraidas;
    }
}

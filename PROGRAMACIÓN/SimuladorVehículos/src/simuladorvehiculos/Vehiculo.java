/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorvehiculos;

/**
 * Clase que representa una <strong> clase Vehículo </strong> con la cual
 * podemos simular las diferentes actividades que se realizan día a día con un
 * vehículo. Con la ventaja de poder 'controlar' errores que en la vida diaria
 * el humano puede no contemplar, dada la repetitividad de las acciones.
 * <p>
 * Los objetos de esta clase contienen atributos que permiten almacenar
 * información sobre:</p>
 * <ul>
 * <li><strong>Capacidad del depósito</strong> Este valor establecerá cuál es la
 * capacidad del depósito en litros.</li>
 * <li><strong>Consumo medio</strong> Este valor establecerá cuál es el consumo
 * medio de un vehículo en litros.</li>
 * <li><strong>Estado motor</strong> Este valor establecerá si el motor se
 * encuentra encendido o apagado.</li>
 * <li><strong>Nivel actual del depósito</strong> Este valor establecerá cuál es
 * el nivel del depósito en el momento actual.</li>
 * <li><strong>Kilómetros recorridos</strong> Cantidad de kilómetros recorridos
 * hasta el momento actual.</li>
 * <li><strong>Consumo realizado</strong> Este valor establecer litros
 * consumidos desde que fue arrancado por última vez.</li>
 * <li><strong>Kilómetros totales recorridos</strong> Este valor establecerá
 * total de kilómetros recorridos desde que se fabricó.</li>
 * <li><strong>Consumo Total Realizado</strong> Total de litros consumidos desde
 * que se fabricó el vehículo.</li>
 * </ul>
 * <p>
 * La clase también dispone de información general independiente de los objetos
 * concretos que se hayan creado. Es el caso de:</p>
 * <ul>
 * <li><strong>Distancia recorrida todos los vehículos</strong>Este valor
 * establecerá la distancia total recorrida (km) por todos los vehículos.</li>
 * <li><strong>Consumo realizado todos los vehículos</strong>Este valor
 * establecerá el consumo (litros) por todos los vehículos.</li>
 * <li><strong>Número de vehículos con el motor encendido</strong>Este valor
 * establecerá el número de vehículos con el motor encendido.</li>
 * </ul>
 */
public class Vehiculo {

    //Declaración atributos objeto constantes.
    private final double capacidadDeposito;
    private final double consumoMedio;

    //Declaración atributos objeto variables.
    private boolean estadoMotor; //Si el vehículo tiene el motor encendido o apagado.
    private double nivelActualDeposito; //Nivel actual del depósito de combustible (en litros).
    private double kmRecorridos; //Kilómetros recorridos desde que fue arrancacado la última vez.
    private double consumoRealizado; //Litros consumidos desde que fue arrancado por última vez.
    private double kmTotalRecorridos; //Total de kilómetros recorridos desde que se fabricó.
    private double consumoTotalRealizado; //Total litros consumidos desde que se fabricó el vehículo.

    //Declaración atributos clase variables.
    private static double distanciaRecorridaTodosVehiculos; //Distancia total recorrida por todos los vehículos.
    private static double consumoRealizadoTodosVehiculos; //Consumo de combustible por el total de los vehículos.
    private static int numVehiculosMotorEncendido; //Total de vehículos con el motor encendido.

    //Declaración atributos clase constante.
    /**
     * Mínimo consumo medio a la hora de crear un nuevo vehículo:
     * {@value MINIMO_CONSUMO_MEDIO} litros.
     */
    public static final double MINIMO_CONSUMO_MEDIO = 2.0;
    /**
     * Máximo consumo medio a la hora de crear un nuevo vehículo:
     * {@value MAXIMO_CONSUMO_MEDIO} litros.
     */
    public static final double MAXIMO_CONSUMO_MEDIO = 20.0;
    /**
     * Mínima capacidad del depósito permitida a la hora de crear un nuevo
     * vehículo: {@value MINIMA_CAPACIDAD_DEPOSITO} litros.
     */
    public static final double MINIMA_CAPACIDAD_DEPOSITO = 10.0;
    /**
     * Máxima capacidad del depósito permitida a la hroa de crear un nuevo
     * vehículo: {@value MAXIMA_CAPACIDAD_DEPOSITO} litros.
     */
    public static final double MAXIMA_CAPACIDAD_DEPOSITO = 120.0;
    /**
     * Consumo a la hora de arrancar el vehículo (siempre será el mísmo):
     * {@value CONSUMO_ARRANQUE_VEHICULO} litros.
     */
    public static final double CONSUMO_ARRANQUE_VEHICULO = 0.02;
    /**
     * Consumo medio por defecto de un vehículo: {@value DEFAULT_CONSUMO_MEDIO}
     * litros.
     */
    public static final double DEFAULT_CONSUMO_MEDIO = 5.0;
    /**
     * Capacidad por defecto del depósito de un vehículo_
     * {@value DEFAULT_CAPACIDAD_DEPOSITO} litros.
     */
    public static final double DEFAULT_CAPACIDAD_DEPOSITO = 50.0;

    /*
     * *******************************************************
     * DECLARACIÓN DE CONSTRUCTORES.
     * ********************************************************
     */
    /**
     * Constructor con dos parámetros.
     *
     * @param capacidadDeposito permite fijar la capacidad del depósito al crear
     * el vehículo.
     * @param consumoMedio permite fijar el consumo medio del vehículo creado.
     * @throws IllegalArgumentException arrojará una excepción si alguno de los
     * dos parámetros anteriores no cumple con las condiciones.
     */
    public Vehiculo(double capacidadDeposito, double consumoMedio) throws IllegalArgumentException {
        //Comprobar si los parámetros cumplen con las condiciones.
        if (capacidadDeposito < Vehiculo.MINIMA_CAPACIDAD_DEPOSITO || capacidadDeposito > Vehiculo.MAXIMA_CAPACIDAD_DEPOSITO) {
            throw new IllegalArgumentException("Error en el valor asignado a la capacidad del depósito");
        }
        if (consumoMedio < Vehiculo.MINIMO_CONSUMO_MEDIO || consumoMedio > Vehiculo.MAXIMO_CONSUMO_MEDIO) {
            throw new IllegalArgumentException("Error en el valor asignado al consumo medio");
        }
        //Si no ha saltado ninguna excepción quiere decir que las condiciones son aptas para poder realizar la asignación.
        this.capacidadDeposito = capacidadDeposito;
        this.consumoMedio = consumoMedio;

        this.estadoMotor = false;
        this.nivelActualDeposito = 0;
        this.kmRecorridos = 0;
        this.consumoRealizado = 0;
        this.kmTotalRecorridos = 0;
        this.consumoTotalRealizado = 0;
    }

    /**
     * Constructor sin parámetros.
     */
    public Vehiculo() {
        this(Vehiculo.DEFAULT_CAPACIDAD_DEPOSITO, Vehiculo.DEFAULT_CONSUMO_MEDIO);
    }

    /*
     * *********************************************************
     * MÉTODOS CONSULTORES.
     * ***********************************************************
     */
 /*
     * ***********Métodos de objeto.***************************
     */
    /**
     * Éste método permite conocer el estado en el que se encuentra el motor. Si
     * el motor se encuentra apagado, devolverá false y se encuentra encendido
     * true.
     *
     * @return booleano que indica si el motor se encuentra encendido o apagado.
     */
    public boolean isArrancado() {
        return this.estadoMotor;
    }

    /**
     * Éste método permite conocer el cnsumo medio del vehículo actual.
     *
     * @return double consumo medio del vehículo actual.
     */
    public double getConsumoMedio() {
        return this.consumoMedio;
    }

    /**
     * Éste método permite conocer la capacidad del depósito del vehículo
     * actual.
     *
     * @return double litros capacidad del depósito.
     */
    public double getCapacidadDeposito() {
        return this.capacidadDeposito;
    }

    /**
     * Éste método permite conocer el nivel de combustible actual del vehículo.
     *
     * @return double litros nivel actual del depósito.
     */
    public double getNivelCombustible() {
        return this.nivelActualDeposito;
    }

    /**
     * Éste método permite conocer la distancia recorrida desde la última vez
     * que se puso en marcha.
     *
     * @return double km recorridos.
     */
    public double getDistanciaRecorrida() {
        return this.kmRecorridos;
    }

    /**
     * Éste método permite conocer el total de la distancia recorrida del
     * vehículo desde que se fabricó.
     *
     * @return double km totales recorridos.
     */
    public double getDistanciaRecorridaTotal() {
        return this.kmTotalRecorridos;
    }

    public double getCombustibleConsumido() {
        return this.consumoRealizado;
    }

    /**
     * Éste método permite conocer la cantidad de combustible consumida en
     * total.
     *
     * @return double litros consumo total realizado.
     */
    public double getCombustibleConsumidoTotal() {
        return this.consumoTotalRealizado;
    }

    /*
     * ***********Métodos de clase.***************************
     */
    /**
     * Éste método nos permite conocer la distancia recorrida por todos los
     * vehículos que conforman la flota.
     *
     * @return double kilómetros recorridos por toda la flota.
     */
    public static double getDistanciaRecorridaFlota() {
        return Vehiculo.distanciaRecorridaTodosVehiculos;
    }

    /**
     * Éste método nos permite conocer el total del combustible consumido por
     * todos los vehículos que conforman la flota.
     *
     * @return double litros consumidos por toda la flota.
     */
    public static double getCombustibleConsumidoFlota() {
        return Vehiculo.consumoRealizadoTodosVehiculos;
    }

    /**
     * Éste método permite conocer cuántos coches de la flota se encuentran con
     * el motor encendido en el momento actual.
     *
     * @return int número de vehículos con el motor encendido.
     */
    public static int getNumVehiculosArrancadosFlota() {
        return Vehiculo.numVehiculosMotorEncendido;
    }

    /////////////////////////////////////////////////////////
    //RESTO DE MÉTODOS. 
    ////////////////////////////////////////////////////////
    /**
     * Éste método permite repostar combustible en el vehículo, recibe un
     * parámetro.
     *
     * @param litros cantidad de litros que deseamos repostar.
     * @throws IllegalStateException Si se trata de repostar con el motor en
     * marcha.
     * @throws IllegalArgumentException Si tratamos de repostar una cantidad
     * superior a la capacidad actual del vehículo, el depósito quedará lleno
     * hasta rebosar y a continuación saltará una excepción.
     */
    public void repostar(double litros) throws IllegalStateException, IllegalArgumentException {
        //Comprobamos si el parámetro cumple con las condiciones.
        if (this.estadoMotor) {
            throw new IllegalStateException("Error: se intentó repostar con el motor encendido. No se ha repostado.");
        }

        if (litros > (this.capacidadDeposito - this.nivelActualDeposito)) {
            double diferencia = this.capacidadDeposito - this.nivelActualDeposito;
            //Llenar depósito.
            this.nivelActualDeposito += diferencia;
            //Cantidad rebosado
            double rebosado = litros - this.nivelActualDeposito;
            String strRebosado = String.format("%.2f", rebosado);
            //Al rebosar, lanzar la excepción.
            throw new IllegalArgumentException("Error: Depósito lleno. Se ha sobrepasado la capacidad del depósito de combustible en " + strRebosado + " litros.");
        }
        //Rellenar el depósito después de comprobar las condiciones.
        this.nivelActualDeposito += litros;
    }

    /**
     * Éste método nos permite arrancar el vehículo.
     *
     * @throws IllegalStateException Lanzará una excepción si el motor ya se
     * encuentra arrancado o si el vehículo no contiene combustible suficiente
     * (consumirá resto de combustible.).
     */
    public void arrancar() throws IllegalStateException {
        //El estado del motor pasa a arrancado si aún no lo está, pero si ya lo está no se producirá ningún consumo y lanzaremos una excepción.
        if (this.estadoMotor) {
            throw new IllegalStateException("Error: El motor ya se encuentra arrancado.");
        }
        //Si el depósito del vehiículo no tiene combustible suficiente para poder arrancar, lanzar una excepción.
        if (this.nivelActualDeposito < Vehiculo.CONSUMO_ARRANQUE_VEHICULO) {
            //Vaciar completamente lo que quede de combustible.
            this.nivelActualDeposito = 0;
            throw new IllegalStateException("depósito vacío. Se intentó arrancar sin combustible suficiente.");
        }
        //Arrancar el motor de un vehículo hará que se produzca una pequeña cantidad de consumo de combustible.
        //Incrementar el consumo.
        this.consumoRealizado += Vehiculo.CONSUMO_ARRANQUE_VEHICULO;
        this.consumoTotalRealizado += Vehiculo.CONSUMO_ARRANQUE_VEHICULO;
        Vehiculo.consumoRealizadoTodosVehiculos += Vehiculo.CONSUMO_ARRANQUE_VEHICULO;
        //Decrementar el nivel del depósito.
        this.nivelActualDeposito -= Vehiculo.CONSUMO_ARRANQUE_VEHICULO;
        //Incrementar número de vehículos totales con el motor encendido.
        Vehiculo.numVehiculosMotorEncendido++;
        //Arrancamos el motor.
        this.estadoMotor = true;
    }

    /**
     * Éste método nos permite introducir un parámetro con el cual indicaremos
     * la cantidad de kilómetros que deseamos recorre.
     *
     * @param distanciaKm cantidad de kilómetros que deseamos recorrer.
     * @throws IllegalArgumentException Lanzará una excepción si introducimos un
     * valor negativo.
     * @throws IllegalStateException Lanzará una excepción si el motor se
     * encuentra apagado.
     */
    public void realizarTrayecto(double distanciaKm) throws IllegalArgumentException, IllegalStateException {
        //Comprobar si se cumplen las siguientes condiciones
        //Si el valor que se pasa como distancia es negativo.
        if (distanciaKm < 0) {
            throw new IllegalArgumentException("Error: Se intentó realizar un trayecto negativo");
        }
        //Si el motor está apagado.
        if (!this.estadoMotor) {
            throw new IllegalStateException("Error: Se intentó realizar un trayecto con el motor apagado. No se ha avanzado.");
        }
        //Si no hay combustible suficiente para recorrer esa distancia.En tal caso se consume todo el depósito, se recorre la distancia que sea posible.
        //y se apaga el motor.
        //Calcular combustible necesario para realizar el trayecto.
        double combustibleNecesario = distanciaKm * (this.consumoMedio / 100);

        if (this.nivelActualDeposito < combustibleNecesario) {
            //Calcular cuánta distancia se ha podido recorrer con el combustible actual.
            double distanciaRecorrida;//Distancia recorrida con el nivel actual de combustible.
            distanciaRecorrida = (this.nivelActualDeposito * 100) / this.consumoMedio;
            double kmNoRecorridos = distanciaKm - distanciaRecorrida;
            String strKmNoRecorridos = String.format("%.2f", kmNoRecorridos);

            //Apagamos el motor.
            this.estadoMotor = false;
            Vehiculo.numVehiculosMotorEncendido--;
            this.kmTotalRecorridos += distanciaRecorrida;
            Vehiculo.distanciaRecorridaTodosVehiculos += distanciaRecorrida;
            //Dejamos el consumo a cero.
            this.consumoRealizado = 0;
            this.consumoTotalRealizado += this.nivelActualDeposito;
            Vehiculo.consumoRealizadoTodosVehiculos += this.nivelActualDeposito;
            //Dejamos el nivel de combustible a cero,lo hemos agotado.
            this.nivelActualDeposito = 0;
            throw new IllegalStateException("Error: no se ha podido finalizar el trayecto completamente. Depósito vacío. Han faltado por recorrer " + strKmNoRecorridos + " km");
        }
        //Una vez realizadas las comprobaciones:
        //Actualizamos atributos objeto.
        this.kmRecorridos += distanciaKm;
        this.kmTotalRecorridos += distanciaKm;
        this.consumoRealizado += combustibleNecesario;
        this.consumoTotalRealizado += combustibleNecesario;
        this.nivelActualDeposito -= combustibleNecesario;
        //Actualizamos atributos clase.
        Vehiculo.distanciaRecorridaTodosVehiculos += distanciaKm;
        Vehiculo.consumoRealizadoTodosVehiculos += combustibleNecesario;
    }

    /**
     * Éste método permite apagar el vehículo.
     *
     * @throws IllegalStateException Lanzará una excepción si el vehícuolo ya se
     * encuentra apagado.
     */
    public void apagar() throws IllegalStateException {
        //Si el motor se encuentra apagado, debe lanzarse una excepción.
        if (!this.estadoMotor) {
            throw new IllegalStateException("Error: el motor ya se encuentrá apagado");
        } else {
            //Una vez realizadas las comprobaciones:
            this.estadoMotor = false;
            Vehiculo.numVehiculosMotorEncendido--;
            //Reiniciar a cero los indicadores de consumo y distancia recorrida desde el último arranque.
            this.consumoRealizado = 0;
            this.kmRecorridos = 0;
        }
    }

    /**
     * Éste método nos devolverá información sobre el vehículo actual.
     *
     * @return String devuelve una cadena de caracteres con la información del
     * vehículo. (Estado del motor, nivel actual del depósito, kilómetros
     * recorridos y consumo realizado).
     */
    @Override
    public String toString() {
        String resultado = String.format("Motor: %s -Depósito: %.2f -Dist: %.2f -Consumo: %.2f",
                this.estadoMotor ? "arrancado" : "apagado",
                this.nivelActualDeposito,
                this.kmRecorridos,
                this.consumoRealizado
        );
        return resultado;
    }

}

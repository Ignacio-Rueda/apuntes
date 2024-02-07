package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class Paciente {

    private String nombre;//Nombre del paciente.
    private double gastoAcumulado;//Gasto acumulado del paciente.
    private int numPinchazos;//Número de pinchazos recibidos por el paciente.

    public static final int PREMIUM = 10_000;
    public static final int MUY_INTERESANTE = 7_750;
    public static final int INTERESANTE = 4_000;

    //Costructor
    public Paciente(String nombre, double gastoAcumulado, int numPinchazos) throws IllegalArgumentException {
        if (gastoAcumulado < 0) {
            throw new IllegalArgumentException("Datos iniciales erróneos");
        }
        if (numPinchazos < 0) {
            throw new IllegalArgumentException("Datos iniciales erróneos");
        }
        //Actualizar valores.
        this.nombre = nombre;
        this.gastoAcumulado = gastoAcumulado;
        this.numPinchazos = numPinchazos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double gastoAcumulado() {
        return this.gastoAcumulado;
    }

    public int numPinchazos() {
        return this.numPinchazos;
    }

    //Métodos
    public boolean actualizarGastoAcumulado(int numPinchazosHoy, float importePinchazo) {
        boolean resultado = false;
        if (numPinchazosHoy > 0 && importePinchazo > 0) {
            this.numPinchazos += numPinchazosHoy;
            this.gastoAcumulado += (importePinchazo * numPinchazosHoy);
            resultado = true;
        }
        return resultado;
    }

    public String tipoPaciente() {
        String resultado = "";

        if (this.gastoAcumulado >= Paciente.PREMIUM) {
            resultado = "Premium";
        } else if (this.gastoAcumulado >= Paciente.MUY_INTERESANTE) {
            resultado = "Muy interesante";
        } else if (this.gastoAcumulado >= Paciente.INTERESANTE) {
            resultado = "Interesante";
        } else {
            resultado = "Estándar";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return String.format("Paciente: %s, número de pinchazos: %d, gasto acumulado: %.2f%n",
                this.nombre,
                this.numPinchazos,
                this.gastoAcumulado
        );
    }

    public static void main(String[] args) {

        /**
         * Un primer intento de crear un objeto con datos erróneos para que
         * salte la excepción y sea capturada como ya sabemos con una estructura
         * try-catch.
         */
        System.out.println("Intento crear un paciente de nombre Roberto");
        try {
            Paciente paciente = new Paciente("Roberto", 5, -10);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Vamos a crear dos objetos paciente");
        Paciente pc1 = null, pc2 = null;
        try {
            pc1 = new Paciente("Julián Piqueras", 0.0, 0);
            pc2 = new Paciente("Fulgencio Pérez", 5, 1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Mostramos la información de los dos objetos paciente");
        System.out.println(pc1);
        System.out.println(pc2);
        /**
         * Al paciente que has creado con el nombre de Julian Piqueras Gómez,
         * actualiza su gasto acumulado empleando el método apropiado, con dos
         * pinchazos de 7025.50. Muestra de nuevo por consola su información
         * usando el método toString.
         */
        System.out.println("Actualizamos el gasto acumulado de julian con dos pinchazos de 7025.50");
        pc1.actualizarGastoAcumulado(2, 7025.50f);
        System.out.println(pc1);

        /**
         * A paciente que has creado con el nombre de Fulgencio Pérez, actualiza
         * su gasto acumulado empleando el método apropiado, con cinco pinchazos
         * de 76.87. Muestra de nuevo por consola su información usando el
         * método toString.
         */
        System.out.println("Actualizamos el gasto acumulado de Fulgencio con 5 pinchazos de 76.87");
        pc2.actualizarGastoAcumulado(5, 76.87f);
        System.out.println(pc2.toString());

        System.out.printf("El tipo de paciente de: %s es %s%n", pc1.getNombre(), pc1.tipoPaciente());
        System.out.printf("El tipo de paciente de: %s es %s%n", pc2.getNombre(), pc2.tipoPaciente());
    }//Final main

}

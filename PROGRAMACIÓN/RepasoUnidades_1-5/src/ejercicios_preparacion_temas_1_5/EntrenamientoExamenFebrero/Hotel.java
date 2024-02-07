package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class Hotel {

    private String nombre;
    private String ciudad;
    private int numPlantas;//Número de planatas(pisos) de las que dispone.
    private Habitacion[][] arrayHabitacion = new Habitacion[8][8];

    public void eliminarHab(String nombre) {
        for (int n = 0; n <this.arrayHabitacion.length; n++) {
            for (int i = 0; i < this.arrayHabitacion[n].length; i++) {
                if (this.arrayHabitacion[n][i].getNombre().equals(nombre)) {
                   this.arrayHabitacion[n][i] = null;
                }
                int sigPos = i+1;
                if(this.arrayHabitacion[n][i] == null && sigPos<this.arrayHabitacion[n].length){
                    //Si la posición actual es igual a null, intercambio posiciones.
                    this.arrayHabitacion[n][i] = this.arrayHabitacion[n][sigPos];
                    this.arrayHabitacion[n][sigPos] = null;
                }
            }
        }
    }//Fin método eliminar hab.


    public static void main(String[] args) {
        Hotel h1 = new Hotel();

    }

}

class Habitacion {

    private static int habsPlanta = 0;
    private static int numPlantas = 0;

    String nombre;
    private String tipoHabitacion;
    private double precio;

    private enum TipoHabitacion {
        doble, triple
    };

    public Habitacion(int numPlanta, String tipoHabitacion) throws IllegalArgumentException, IllegalStateException {
        //Controlamos que no se añada una planta inferior a 1 o superior a 8. 
        if (numPlanta < 1 || numPlanta > 8) {
            throw new IllegalArgumentException(String.format("No es posible crear una planta", numPlanta));
        }
        //Controlamos que no se añadan mas de 8 habitaciones por planta.
        if (habsPlanta == 8) {
            throw new IllegalStateException("Lo siento,ya están toda la planta completa");
        }
        //Controlamos que el tipo de habitación exista.

        if (!tipoHabitacion.toLowerCase().equals(TipoHabitacion.doble.toString()) || !tipoHabitacion.toLowerCase().equals(TipoHabitacion.triple.toString())) {
            throw new IllegalArgumentException(String.format("Lo siento, no existe el tipo de habitación %s", tipoHabitacion));
        }
        //Actualizamos valores.
        Habitacion.habsPlanta++;
        Habitacion.numPlantas = numPlanta;
        this.tipoHabitacion = tipoHabitacion;
        this.nombre += "H" + (Habitacion.numPlantas * 100 + Habitacion.numPlantas);
        if (this.tipoHabitacion.toLowerCase() == TipoHabitacion.doble.toString()) {
            precio = 80 + Math.random() * 41;
        }
        if (this.tipoHabitacion.toLowerCase() == TipoHabitacion.triple.toString()) {
            precio = 150 + Math.random() * 31;
        }

    }
    //Métodos getters.
    public String getNombre() {
        return this.nombre;
    }

}

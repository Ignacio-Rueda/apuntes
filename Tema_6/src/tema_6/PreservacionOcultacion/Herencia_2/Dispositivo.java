package tema_6.PreservacionOcultacion.Herencia_2;

import java.util.InputMismatchException;

public abstract class Dispositivo {

    private String descripcion;
    private int ubicacion;
    protected static int nextId = 1;//
    private int id;

    public static final int MIN_UBICACION = 1;//Mínima ubicación
    public static final int MAX_UBICACION = 10;//Máxima ubicación.

    public Dispositivo(String descripcion, int ubicacion) throws IllegalArgumentException {
        //La ubicación no podrá estar fuera del rango entre 1 y 10
        if (ubicacion < Dispositivo.MIN_UBICACION && ubicacion > Dispositivo.MAX_UBICACION) {
            throw new IllegalArgumentException(String.format("Ubicación no válida %d", ubicacion));
        } else {
            this.ubicacion = ubicacion;
            this.descripcion = descripcion;
            //Aumentamos en 1, cada vez que se instancie.
            this.id = this.nextId;
            Dispositivo.nextId++;
        }
    }

    public String toString() {
        StringBuilder strb = new StringBuilder();
        strb.append(String.format("tipo: %s id %d descripción: %s ubicación: %d",
                this.getClass().getSimpleName(),
                this.id,
                this.descripcion,
                this.ubicacion
        ));
        return strb.toString();
    }

}

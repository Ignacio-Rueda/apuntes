package tema_6.PreservacionOcultacion.Herencia_2;

public class Bombilla extends Dispositivo {

    protected boolean estado;
    protected double intensidad;
    protected int numVecesManipulada;

    public static final int INTENSIDAD_INICIAL = 0;
    public static final int INTENSIDAD_MAXIMA = 10;

    public Bombilla(String descripcion, int ubicacion) throws IllegalArgumentException {
        this(descripcion, ubicacion, 0);
    }

    private Bombilla(String descripcion, int ubicacion, double intensidad) throws IllegalArgumentException {
        super(descripcion, ubicacion);
        this.intensidad = intensidad;
        this.numVecesManipulada = 0;

    }

    private static Bombilla creaBombilla(String descripcion, int ubicacion, double intensidad) {

        if (intensidad < Bombilla.INTENSIDAD_INICIAL || intensidad > Bombilla.INTENSIDAD_MAXIMA) {
            throw new IllegalArgumentException(String.format("Error, intensidad no válida %s", intensidad));
        }
        Bombilla bombilla = new Bombilla(descripcion, ubicacion, intensidad);

        return bombilla;
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();

        strb.append(String.format("%s estado:%s int:%.2f NVM %d",
                super.toString(),
                this.estado ? "encendida" : "apagada",
                this.intensidad,
                this.numVecesManipulada
        ));
        return strb.toString();
    }

}

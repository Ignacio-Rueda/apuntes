package tema_6.PreservacionOcultacion.Herencia_2;

public class Cerradura extends Dispositivo {

    boolean estado;

    public Cerradura(String descripcion, int ubiacacion, boolean estado) throws IllegalArgumentException {
        super(descripcion, ubiacacion);
        this.estado = estado;
    }
    public Cerradura(String descripcion,int ubicacion) throws IllegalArgumentException{
        this(descripcion,ubicacion,false);//Estado inicial: cerradural abierta o desactivada
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        strb.append(String.format("%s estado: %s",
                super.toString(),
                this.estado?"Encendida":"Apagada"
        ));
        return strb.toString();
    }
}

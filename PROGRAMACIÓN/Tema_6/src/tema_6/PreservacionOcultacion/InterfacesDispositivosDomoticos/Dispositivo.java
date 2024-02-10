package tema_6.PreservacionOcultacion.InterfacesDispositivosDomoticos;

public abstract class Dispositivo {

    private String descripcion;
    private int ubicacion;
    protected static int nextId = 1;
    private int id;

    public Dispositivo(String descripcion,int ubicacion){
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }
}

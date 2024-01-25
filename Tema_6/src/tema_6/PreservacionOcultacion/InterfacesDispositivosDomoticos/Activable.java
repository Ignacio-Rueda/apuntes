
package tema_6.PreservacionOcultacion.InterfacesDispositivosDomoticos;

public interface Activable {
    public boolean getEstado();
    public void on() throws IllegalStateException;
    public void of() throws IllegalStateException;
}


package tema_6.PreservacionOcultacion.InterfacesDispositivosDomoticos;


public class Cerradura extends Dispositivo implements Activable{
    boolean estado;
    public Cerradura(String descripcion,int ubicacion,boolean estado){
        super(descripcion,ubicacion);
        this.estado = estado;
    }
    
    @Override
    public boolean getEstado(){
        return this.estado;
    }
    @Override
    public void on()throws IllegalStateException{
        if(this.estado){
            throw new IllegalStateException("Cerradura ya está cerrada");
        }else{
            this.estado = true;
        }
    }
    @Override
    public void of()throws IllegalStateException{
        if(!this.estado){
            throw new IllegalStateException("Cerradura ya está abierta");
        }else{
            this.estado = false;
        }
    
    }
}

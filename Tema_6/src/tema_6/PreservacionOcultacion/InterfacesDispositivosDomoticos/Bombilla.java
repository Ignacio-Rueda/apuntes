
package tema_6.PreservacionOcultacion.InterfacesDispositivosDomoticos;

public class Bombilla extends Dispositivo implements Activable,Regulable {
    int intensidad;
    static final int MINIMA_INTENSIDAD =1;
    static final int MAXIMA_INTENSIDAD = 10;
    public Bombilla(String descripcion,int ubicacion,int intensidad){
        super(descripcion,ubicacion);
        this.intensidad = intensidad;
    }
    //********************************************
    //IMPLEMENTACIÓN DE LA INTERFAZ ACTIVABLE
    //*******************************************
    @Override
    public boolean getEstado(){
        boolean resultadoEstado = true;
        if(this.intensidad == Bombilla.MINIMA_INTENSIDAD){//Se devolverá falso cuando la intensidad del dispositivo esté al mínimo (1)
            resultadoEstado = false;
        }
        return resultadoEstado;
    }
    @Override
    public void on()throws IllegalStateException{
        if(this.getEstado()){
            throw new IllegalStateException("Bombilla ya encendida");
        }else{
            this.intensidad = Bombilla.MAXIMA_INTENSIDAD;//Establecer la intensidad a su máximo nivel.
        }
    }
    @Override 
    public void of()throws IllegalStateException{
        if(!this.getEstado()){
            throw new IllegalStateException("Bombilla ya apagada");
        }else{
            this.intensidad = Bombilla.MINIMA_INTENSIDAD;//Establecer la intensidad a su mínimo nivel.
        }
    }
    
    //****************************************
    //IMPLEMENTACIÓN DE LA INTERFAZ REGULABLE
    //****************************************
    @Override
    public int getIntensidad(){
        return this.intensidad;
    }
    @Override
    public int up(){
        if(this.intensidad<Bombilla.MAXIMA_INTENSIDAD){
            this.intensidad++;
        }
        return this.intensidad;
    }
    @Override
    public int down(){
        if(this.intensidad>=Bombilla.MINIMA_INTENSIDAD){
            this.intensidad--;
        }
        return this.intensidad;
    }
    
}

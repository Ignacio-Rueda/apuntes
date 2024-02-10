
package tema_6.PreservacionOcultacion;

public class Bombilla {
    private double potencia;
    
    public Bombilla(){
    }
    
    public Bombilla(double potencia){
        this.potencia = potencia;
    }
    
    //Constructor copia
    public Bombilla(Bombilla bombillaAcopiar){
        this.potencia = bombillaAcopiar.getPotencia();
    }
    
    
    public double getPotencia(){
        return this.potencia;
    }
    
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    
}

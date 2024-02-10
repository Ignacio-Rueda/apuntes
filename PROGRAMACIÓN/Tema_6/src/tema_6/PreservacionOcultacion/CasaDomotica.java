
package tema_6.PreservacionOcultacion;

import java.time.LocalDate;


public class CasaDomotica {
    private String id;
    private LocalDate fechaConstruccion;
    private Bombilla[] arrayBombilla = new Bombilla[2];

    public CasaDomotica(String id, LocalDate fechaConstruccion,Bombilla... bombillas){
        this.id = id;
        this.fechaConstruccion = fechaConstruccion;
        for(int n=0;n<bombillas.length;n++){
            this.arrayBombilla[n] = new Bombilla (bombillas[n]);
              //this.arrayBombilla[n] = new Bombilla (bombillas[n].getPotencia());
        }
    }
    
    public Bombilla[] getBombilla(){
        return this.arrayBombilla;
    }
}

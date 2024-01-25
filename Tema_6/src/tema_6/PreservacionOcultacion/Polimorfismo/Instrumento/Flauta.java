/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_6.PreservacionOcultacion.Polimorfismo.Instrumento;

/**
 *
 * @author Ignacio Rueda
 */
public class Flauta extends Instrumento {

    public Flauta(String nombre,String color,String tipo,String nota){
        super(nombre,color,tipo,nota);
    }
    
    @Override
    public String tocarNota(){
        return super.tocarNota();
    }
}

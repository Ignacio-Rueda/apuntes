/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_6.PreservacionOcultacion.Polimorfismo.Instrumento;

/**
 *
 * @author Ignacio Rueda
 */
public abstract class Instrumento {
    private final String nombre;
    private final String color;
    private final String tipo;
    private String nota;
    public Instrumento(String nombre,String color,String tipo,String nota){
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
        this.nota = nota;
    }
    
    public String tocarNota(){
        return String.format("Nombre del instrumento: %s.Instrumento de color %s.Toca la nota %s", this.nombre,this.color,this.tipo,this.nota);
    }
}

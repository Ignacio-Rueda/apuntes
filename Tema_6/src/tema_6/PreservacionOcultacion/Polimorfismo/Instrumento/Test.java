/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_6.PreservacionOcultacion.Polimorfismo.Instrumento;

/**
 *
 * @author Ignacio Rueda
 */
public class Test {

    public static void main(String[] args) {
        Instrumento[] arrayInstrumentos = new Instrumento[2];

        arrayInstrumentos[0] = new Flauta("Flauta", "Marrón claro", "Viento", "FA");
        arrayInstrumentos[1] = new Piano("Piano", "Negro", "Cuerda", "MI");
        
        for(int n=0;n<arrayInstrumentos.length;n++){
            System.out.println(arrayInstrumentos[n].tocarNota());
        }

    }

}

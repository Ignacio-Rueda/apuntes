/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposenumerados;

/**
 *
 * @author Ignacio
 */
public class TiposEnumerados {
    public enum UnidadVolumen{MILILITRO,CENTILITRO,DECILITRO,LITRO,DECALITRO,HECTOLITRO};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(UnidadVolumen.MILILITRO);
        System.out.println(UnidadVolumen.CENTILITRO);
        System.out.println(UnidadVolumen.DECILITRO);
        System.out.println(UnidadVolumen.LITRO);
        System.out.println(UnidadVolumen.DECALITRO);
        System.out.println(UnidadVolumen.HECTOLITRO);

    }
    
}

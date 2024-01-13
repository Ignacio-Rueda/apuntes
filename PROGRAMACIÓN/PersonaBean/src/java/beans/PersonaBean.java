/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

/**
 *
 * @author Ignacio Rueda
 */
public class PersonaBean {

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }
    
    private String nombre;
    private String mensaje;

    public String getNombre() {
        return nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void saludar(){
        this.mensaje = "Hola te has identificado como: "+this.nombre;
    }
    
}

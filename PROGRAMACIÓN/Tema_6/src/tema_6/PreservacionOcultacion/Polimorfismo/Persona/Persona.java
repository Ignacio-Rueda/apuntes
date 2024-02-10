
package tema_6.PreservacionOcultacion.Polimorfismo.Persona;

public  class Persona {
    private final String nombre;
    private final String apellidos;
    private final String categoria;
    
    public Persona(String nombre,String apellidos,String categoria){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.categoria = categoria;
    }
    
    
    public String toString(){
        String resultado = String.format("%s Nombre: %s. Apellidos: %s",this.categoria, this.nombre,this.apellidos);
        return resultado;
    }
}

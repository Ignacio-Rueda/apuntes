package tema_6.PreservacionOcultacion.Polimorfismo.Persona;

public class Alumno extends Persona {
    protected String saludo;
    public Alumno(String nombre, String apellidos,String categoria,String saludo) {
        super(nombre, apellidos,categoria);
        this.saludo = saludo;
    }
    
    @Override
    public String toString(){
        return super.toString()+this.saludo;
    }
}

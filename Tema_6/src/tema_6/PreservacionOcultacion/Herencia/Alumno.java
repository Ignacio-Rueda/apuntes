
package tema_6.PreservacionOcultacion.Herencia;
import java.time.LocalDate;

public class Alumno extends Persona {
    private String grupo;
    private double notaMedia;

    public Alumno(String nombre,String apellidos,LocalDate fechaNacimiento,String grupo,double notaMedia){
        super(nombre,apellidos,fechaNacimiento);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    @Override
    public String getNombre(){
        return "El nombre con formato clase derivada: "+this.nombre;
    }
    @Override
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        resultado.append(String.format("%s del grupo %s tiene una nota media de: %.2f%n", 
                super.toString(),
                this.grupo,
                this.notaMedia
        ));
        return resultado.toString();
    }
}

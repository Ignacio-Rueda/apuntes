package tema_6.PreservacionOcultacion.Herencia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Métos geter y setter.
    public String getNombre() {
        return "El nombre con formato clase padre: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        StringBuilder resultado = new StringBuilder();
        resultado.append(String.format("%s con apellidos %s y con fecha de nacimiento %s",
                this.nombre,
                this.apellidos,
                this.fechaNacimiento.format(formato)
        ));
        return resultado.toString();

    }

}


package tema_6.PreservacionOcultacion.Herencia;

import java.time.LocalDate;

public class Profesor extends Persona {
    private String especialidad;
    private double salario;
    
    
    public Profesor(String nombre,String apellidos,LocalDate fechaNacimiento,String especialidad,double salario){
        super(nombre,apellidos,fechaNacimiento);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        
        resultado.append(String.format("%s %s %.2f%n",
                super.toString(),
                this.especialidad,
                this.salario
        ));
        
        return resultado.toString();
    }
    
}

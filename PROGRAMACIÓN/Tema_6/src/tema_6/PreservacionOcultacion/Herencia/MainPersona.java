
package tema_6.PreservacionOcultacion.Herencia;

import java.time.LocalDate;
import java.time.Month;

public class MainPersona {

    public static void main(String[] args) {
        Alumno nacho = new Alumno("Nacho","Rueda",LocalDate.of(1989,10,26),"B",6.5);
        Profesor ramon = new Profesor("Ramón","Rueda",LocalDate.of(1991, 7, 10),"Informática",3500);
        System.out.println(nacho);
        System.out.println(ramon);
        //---------
        System.out.println(nacho.getNombre());
    }
    
}

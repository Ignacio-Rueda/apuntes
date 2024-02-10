
package tema_6.PreservacionOcultacion.Polimorfismo.Persona;

public class Test {

    public static void main(String[] args) {
        Persona p1;

        p1 = new Alumno("Nacho","Rueda","Alumno","Holii");
        System.out.println(p1.toString());
        
        System.out.println(((Alumno)p1).saludo);//Conversión explicita CASTING. Para acceder a la información adicional de la clase especializada.
        
        System.out.println(p1 instanceof Alumno);
        
    }
    
}


package tema_6.PreservacionOcultacion.Polimorfismo.Persona;

public class Test {

    public static void main(String[] args) {
        Persona p1;

        p1 = new Alumno("Nacho","Rueda","Alumno","Holii");
        System.out.println(p1.toString());
        
        System.out.println(((Alumno)p1).saludo);//Conversi�n explicita CASTING. Para acceder a la informaci�n adicional de la clase especializada.
        
        System.out.println(p1 instanceof Alumno);
        
    }
    
}

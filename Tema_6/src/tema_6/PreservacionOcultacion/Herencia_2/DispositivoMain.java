package tema_6.PreservacionOcultacion.Herencia_2;

import java.util.InputMismatchException;

public class DispositivoMain {

    public static void main(String[] args) {
        Bombilla ob1 = null;
        Cerradura c1 = null;
        try {
            ob1 = new Bombilla("aporta luz", 20);
            System.out.println(ob1);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error " + ex.getMessage());
        }

        try {
            c1 = new Cerradura("seguridad puertas", 5, true);
            System.out.println(c1);
        } catch (InputMismatchException ex) {
            System.err.println("Error" + ex.getMessage());
        }

    }

}

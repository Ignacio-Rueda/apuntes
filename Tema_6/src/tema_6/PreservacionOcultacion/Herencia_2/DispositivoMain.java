package tema_6.PreservacionOcultacion.Herencia_2;

import java.util.InputMismatchException;

public class DispositivoMain {

    public static void main(String[] args) {

        //Declarar array de tipo Dispositivo
        Dispositivo[] arrayDispositivos = new Dispositivo [4]; 
        try {
            arrayDispositivos[0]= new Bombilla("luz fría", 20);   
            arrayDispositivos[1]= new Bombilla("luz cálida", 30);  
        } catch (IllegalArgumentException ex) {
            System.err.println("Error " + ex.getMessage());
        }

        try {
            arrayDispositivos[2] = new Cerradura("cerradura nivel 2", 5, true);
            arrayDispositivos[3] = new Cerradura("cerradura nivel 25", 6, false);
        } catch (InputMismatchException ex) {
            System.err.println("Error" + ex.getMessage());
        }
        
        
        
        
        
        for(int n=0;n<arrayDispositivos.length;n++){
            System.out.println(arrayDispositivos[n]);
        }
    }

}

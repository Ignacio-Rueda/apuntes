package tema_6.PreservacionOcultacion;

import java.time.LocalDate;

public class MainCasaDomotica {

    public static void main(String[] args) {
        //Creo una bombilla
        Bombilla b1 = new Bombilla(3.5);
        Bombilla b2 = new Bombilla(2.5);

        ///Ahora creo casa Domotica.
        LocalDate miFecha = LocalDate.of(2024, 12, 12);
        CasaDomotica miCasa = new CasaDomotica("2", miFecha, b1, b2);

        //Muestro datos
        for (int n = 0; n < miCasa.getBombilla().length; n++) {
            System.out.println(miCasa.getBombilla()[n].getPotencia());
        }

        b1.setPotencia(150);

        //Muestro datos
        //Muestro datos
        System.out.println("MUESTRO DATOS DESPUÉS DE MODIFICAR EL VALOR DE UNA BOMBILLA");
        for (int n = 0; n < miCasa.getBombilla().length; n++) {
            System.out.println(miCasa.getBombilla()[n].getPotencia());
        }
    }

}

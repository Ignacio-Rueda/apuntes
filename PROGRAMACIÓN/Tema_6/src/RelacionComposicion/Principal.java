package RelacionComposicion;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class Principal {

    public static void main(String[] args) {
        String[] provinciasAnd = {"Ja�n", "Granada", "M�laga", "Sevilla", "C�diz", "Almer�a", "Huelva", "C�rdoba"};
        String[] provinciasExt = {"C�ceres", "Badajoz"};

        Comunidades[] comunidadesEspania = {
            new Comunidades("Andaluc�a", provinciasAnd),
            new Comunidades("Extremadura", provinciasExt)
        };

        Pais espania = new Pais("Espa�a", comunidadesEspania);

        System.out.println(espania.getComunidadesPais());

        //Probamos con un nombre incorrecto.
        try {
            System.out.println(Arrays.toString(espania.getProvinciasComunidad("andaluca")));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        //Probamos con un nombre correcto.
        System.out.println(Arrays.toString(espania.getProvinciasComunidad("andaluc�a")));
    }

}

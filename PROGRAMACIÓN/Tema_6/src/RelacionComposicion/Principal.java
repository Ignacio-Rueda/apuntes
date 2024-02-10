package RelacionComposicion;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class Principal {

    public static void main(String[] args) {
        String[] provinciasAnd = {"Jaén", "Granada", "Málaga", "Sevilla", "Cádiz", "Almería", "Huelva", "Córdoba"};
        String[] provinciasExt = {"Cáceres", "Badajoz"};

        Comunidades[] comunidadesEspania = {
            new Comunidades("Andalucía", provinciasAnd),
            new Comunidades("Extremadura", provinciasExt)
        };

        Pais espania = new Pais("España", comunidadesEspania);

        System.out.println(espania.getComunidadesPais());

        //Probamos con un nombre incorrecto.
        try {
            System.out.println(Arrays.toString(espania.getProvinciasComunidad("andaluca")));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        //Probamos con un nombre correcto.
        System.out.println(Arrays.toString(espania.getProvinciasComunidad("andalucía")));
    }

}

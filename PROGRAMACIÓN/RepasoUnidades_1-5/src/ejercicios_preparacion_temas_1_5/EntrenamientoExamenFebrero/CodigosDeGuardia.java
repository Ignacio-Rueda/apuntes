package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class CodigosDeGuardia {

    public static void main(String[] args) {
        String[] codigoEmpleados = {"3ABC36", "1EDE27", "1UWX19", "1DEF32", "1AB45", "1STU45", "1aBC28", "1ABC31"};
        StringBuilder resultado = new StringBuilder();
        String patron = "1[AEIOUSD][A-Z]{2}([2-5][0-9]|6[0-5])";

        for (int n = 0; n < codigoEmpleados.length; n++) {
            if (codigoEmpleados[n].matches(patron)) {
                //Obtenemos la primera letra del código para saber el día de la semana que se trabajará.
                String codigoDiaSemanaTrabaja = codigoEmpleados[n].substring(1, 2);
                String diaSemana = "Trabaja el ";
                switch (codigoDiaSemanaTrabaja) {
                    case "A":
                        diaSemana += "LUNES";
                        break;
                    case "E":
                        diaSemana += "MARTES";
                        break;
                    case "I":
                        diaSemana += "MIÉRCOLES";
                        break;
                    case "O":
                        diaSemana += "JUEVES";
                        break;
                    case "U":
                        diaSemana += "VIERNES";
                        break;
                    case "S": case"D":
                        diaSemana ="";
                        diaSemana = "Fin de semana";
                        

                }
                resultado.append(String.format("El empleado %s %s %n", codigoEmpleados[n], diaSemana));
            } else {
                resultado.append(String.format("El empleado %s No trabaja%n", codigoEmpleados[n]));
            }
        }

        System.out.println("ASIGNACIÓN DE GUARDIAS");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println(resultado.toString());
    }

}

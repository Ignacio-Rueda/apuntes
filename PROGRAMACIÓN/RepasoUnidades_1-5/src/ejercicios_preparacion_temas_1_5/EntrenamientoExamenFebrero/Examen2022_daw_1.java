package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ignacio Rueda
 */
public class Examen2022_daw_1 {

    public static void main(String[] args) {
        String arrayEntrada[] = {"SP1234A", "aM5544I", "AO5925N", "O26232A", "AT5425G", "SM4285J", "sp1599A", "SP12341B", "SP111C"};
        StringBuilder resultado = new StringBuilder();
        int sumaCodigosValidos = 0;
        int sumaCodigosInvalidos = 0;
        System.out.println("EJERCICIO DE ANÁLISIS DE CÓDIGOS DE PRODUCTOS INFORMÁTICOS");
        System.out.println("----------------------------------------------------------");

        System.out.println("Se analizarán los siguientes códigos de producto:");
        System.out.println(Arrays.toString(arrayEntrada));

        Pattern patron = Pattern.compile("([SsAa])([TtPpMm])([0-9]{4})([A-j])");
        for (int n = 0; n < arrayEntrada.length; n++) {
            Matcher coincide = patron.matcher(arrayEntrada[n]);
            resultado.append(String.format("%s ", arrayEntrada[n]));
            if (coincide.matches()) {
                sumaCodigosValidos++;
                String disponibilidad = coincide.group(1);
                String tipoProducto = coincide.group(2);
                String identificador = coincide.group(3);
                String letraControl = coincide.group(4);
                //Considerar si el código es válido.
                int sumaIdentificador = 0;
                for (int i = 0; i < identificador.length(); i++) {
                    sumaIdentificador += (int)(identificador.charAt(i)-'0');//Al hacer la resta hace la conversión de un tipo a otro.                  
                }
                String letraResultante = "";
                switch (sumaIdentificador % 10) {
                    case 0:
                        letraResultante = "A";
                        break;
                    case 1:
                        letraResultante = "B";
                        break;
                    case 2:
                        letraResultante = "C";
                        break;
                    case 3:
                        letraResultante = "D";
                        break;
                    case 4:
                        letraResultante = "E";
                        break;
                    case 5:
                        letraResultante = "F";
                        break;
                    case 6:
                        letraResultante = "G";
                        break;
                    case 7:
                        letraResultante = "H";
                        break;
                    case 8:
                        letraResultante = "I";
                        break;
                    case 9:
                        letraResultante = "J";
                        break;
                }
                if (letraResultante.equals(letraControl)) {
                    String disponibilidadResultante = "";
                    String tipoProductoResultante = "";
                    switch (disponibilidad) {
                        case "s":
                        case "S":
                            disponibilidadResultante = "(En stock)";
                            break;
                        case "a":
                        case "A":
                            disponibilidadResultante = "(Agotado)";
                    }
                    switch (tipoProducto) {
                        case "T":
                        case "t":
                            tipoProductoResultante = "Tablet";
                            break;
                        case "m":
                        case "M":
                            tipoProductoResultante = "Móvil";
                            break;
                        case "p":
                        case "P":
                            tipoProductoResultante = "Portátil";
                    }

                    resultado.append(String.format("%s%s%n",
                            tipoProductoResultante, disponibilidadResultante));

                } else {
                    resultado.append("Código inválido\n");
                    sumaCodigosInvalidos++;
                }

            } else {
                resultado.append("Patrón NO Válido \n");
            }
        }

        System.out.println(
                "RESULTADO");
        System.out.println(
                "---------");
        System.out.printf(resultado.toString());
        System.out.println("Números de productos con patrón válido");
        System.out.printf("%d Producctos (%d con código válido y %d con código inválido)%n",sumaCodigosValidos,sumaCodigosValidos-sumaCodigosInvalidos,sumaCodigosInvalidos);

    }//Final main.

}

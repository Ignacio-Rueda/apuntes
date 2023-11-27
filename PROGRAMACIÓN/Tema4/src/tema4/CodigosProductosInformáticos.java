/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class CodigosProductosInformáticos {

    public static void main(String[] args) {
        System.out.println("ANÁLISIS DE CÓDIGOS DE PRODUCTOS INFORMÁTICOS");
        System.out.println("---------------------------------------------");
        String productos[] = {
            "SP1234A",
            "aM5544I",
            "AO5925N",
            "O26232A",
            "AT5425G",
            "SM4285J",
            "sp1599A",
            "SP12341B",
            "SP111C"
        };
        //Disponibilidad:
        //A-a agotado | S-s Stock
        //Tipo producto
        //T tablet P portátil M móvil

        System.out.println("Se analizarán los siguientes códigos de producto");
        System.out.println(Arrays.toString(productos));
        System.out.println("RESTULTADO");
        System.out.println("----------");
        //Patrón válido
        int contadorPatronValidos=0;
        int codigosValidos=0;
        int codigosInvalidos=0;
        String numCodigoStr = "";
        String estado = ""; //Agotado o en stock.
        String tipoDispositivo="";
        int numCodigoInt = 0;
        char codigoControl;
        String patron = "[SAsa][TPMtpm][0-9]{4}[A-Za-z]";
        for (int n = 0; n < productos.length; n++) {
            if (productos[n].matches(patron)) {
                contadorPatronValidos++;
                //Mostrar códigos y datos para patrones validos.
                //1.Comprobar si el código es válido
                numCodigoStr = productos[n].substring(2, 6);
                codigoControl = 'A';
                for (int l = 0; l < numCodigoStr.length(); l++) {
                    numCodigoInt += Integer.parseInt(String.valueOf(numCodigoStr.charAt(l)));
                }
                numCodigoInt = numCodigoInt % 10;
                codigoControl += (char) numCodigoInt;
                //Obtener dígito control, para comprobar si es un código válido.
                if (codigoControl == productos[n].toUpperCase().charAt(productos[n].length() - 1)) {
                    codigosValidos++;
                    switch (productos[n].toUpperCase().charAt(0)) {
                        case 'A':
                            estado = "(Agotado)";
                            break;
                        case 'S':
                            estado = "(En stock)";
                    }
                    switch (productos[n].toUpperCase().charAt(1)) {
                        case 'T':
                            tipoDispositivo = "Tablet";
                            break;
                        case 'P':
                            tipoDispositivo = "Portátil";
                            break;
                        case 'M':
                            tipoDispositivo = "Móvil";
                    }
                    System.out.printf("%-10s%s%5s%n", productos[n],tipoDispositivo,estado);
                } else {
                    codigosInvalidos++;
                    System.out.printf("%-10s%s%n", productos[n], "Código inválido");
                }

                numCodigoInt = 0;//Limpiamos valores acumulados.
            } //Mostrar códigos y datos para patrones no válidos.
            else {
                System.out.printf("%-10s%s%n", productos[n], "Patrón no válido");
            }

        }
        System.out.println("Número de productos con patrón válido:");
        System.out.printf("%d%s%d%s%d%s%n",contadorPatronValidos," Productos (",codigosValidos," con código válido y ",codigosInvalidos," con código inválido.");
    }

}

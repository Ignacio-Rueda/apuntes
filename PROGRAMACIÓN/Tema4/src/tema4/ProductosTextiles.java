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
public class ProductosTextiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] productos = {
            "H12345E15",
            "M00000E00",
            "A12345E15",
            "H12345E11",
            "B00011A02",
            "B00011A11",
            "h12345E15",
            "B1111A04",
            "B111111A06"
        };

        System.out.println("ANÁLISIS DE PRODUCTOS TEXTILES");
        System.out.println("------------------------------");
        System.out.println("Se analizarán los siguientes códigos de producto");
        System.out.println(Arrays.toString(productos));

        //Patrón válido
        //[HMB][0-9]{5}[EA][0-9]{2}
        String patron = "[HMB][0-9]{5}[EA][0-9]{2}";
        String digitos = "";//Guardar los 5 primeros digitos.
        int sumaDigitos;
        String digitosControlStr;
        String procedenciaRopa;
        int digitosControlInt;

        for (int n = 0; n < productos.length; n++) {
            if (productos[n].matches(patron)) {
                //Comprobar si el patrón es válido-> Suma de los 5 dígitos = los dos finales
                //1.Obtener los 5 digitos
                digitos = productos[n].substring(1, 6);
                //2.Obtener la suma de los digitos.
                sumaDigitos = 0;
                digitosControlInt = 0;
                for (int j = 0; j < digitos.length(); j++) {
                    sumaDigitos += Integer.parseInt(String.valueOf(digitos.charAt(j)));
                }
                //3.Obtener los digitos de control.
                digitosControlStr = productos[n].substring(7, 9);
                //4.Parsear los digitos de control.
                digitosControlInt = Integer.parseInt(digitosControlStr);
                //5.Comprobar si el patrón es válido (suma de los 5 digitos debe coincidir con los últimos digitos).
                //6.Comprobar procedencia prenda de ropa.
                procedenciaRopa = String.valueOf(productos[n].charAt(6));
                if(procedenciaRopa.equals("E")){
                    procedenciaRopa = " Fabricación: Europa";
                }
                else{
                    procedenciaRopa=" Fabricación: Asia";
                }
                if (digitosControlInt == sumaDigitos) {
                   //Tipo de cliente.
                    char tCliente = productos[n].charAt(0);
                    String tipoCliente = "";
                    if (tCliente == 'H') {
                        tipoCliente = "prenda de hombre.";
                    } else if (tCliente == 'M') {
                        tipoCliente = "prenda de mujer.";
                    } else {
                        tipoCliente = "prenda de bebé.";
                    }    
                    //Mostrar resultados.
                    System.out.printf("%s%s%s%s%n", productos[n], ": ",tipoCliente,procedenciaRopa);
                }
                else{
                    System.out.printf("%s%s%n", productos[n], ": Código inválido");
                }
            }
            else {
                System.out.printf("%s%s%n", productos[n], ": Patrón NO válido");
            }

        }

    }

}

package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

/**
 *
 * @author Ignacio Rueda
 */
public class Examen_2022_1 {

    public static void main(String[] args) {

        String codigos[] = {"H12345E15", "M00000E00", "A12345E15", "H12345E11", "B00011A02", "B00011A11", "h12345E15", "B1111A04", "B111111A06"};
        StringBuilder resultado = new StringBuilder();
        System.out.println("EJERCICIO DE AN�LISIS DE C�DIGOS DE PRODUCTOS TEXTILES");
        System.out.println("------------------------------------------------------");
        System.out.printf("Se analizar�n los siguientes c�digos de producto: %s%n", Arrays.toString(codigos));
        String patron = "[HMB][0-9]{5}[EA][0-9]{2}";

        System.out.println("RESULTADO");
        System.out.println("---------");
        for (int n = 0; n < codigos.length; n++) {
            resultado.append(String.format("%s:", codigos[n]));
            if (codigos[n].matches(patron)) {
                String tipoCliente = String.valueOf(codigos[n].charAt(0));
                String codigoNum = codigos[n].substring(1, 6);
                String oriegenFab = String.valueOf(codigos[n].charAt(6));
                String digitosControl = codigos[n].substring(codigos[n].length() - 2, codigos[n].length());
                //Comprobar los d�gitos de control
                int valor = 0;
                for (int i = 0; i < codigoNum.length(); i++) {
                   String num = String.valueOf(codigoNum.charAt(i));
                   valor+=Integer.valueOf(num);
                }
                
                if(valor == Integer.valueOf(digitosControl)){
                    String infoCliente="";
                    switch(tipoCliente){
                        case "H":
                            infoCliente = "Prenda de Hombre. ";
                            break;
                        case "B":
                            infoCliente = "Prenda de Beb�. ";
                            break;
                        case "M":
                            infoCliente = "Prenda de Mujer. ";
                            break;
                    }
                    resultado.append(infoCliente);
                    String infoOrigen="";
                    switch(oriegenFab){
                        case "E":
                            infoOrigen = "Fabricaci�n: Europa.\n";
                            break;
                        case "A":
                            infoOrigen = "Fabricaci�n: Asia.\n";
                            break;
                    }
                    resultado.append(infoOrigen);
                }else{
                    resultado.append("C�digo inv�lido\n");
                }

            } else {
                resultado.append("Patr�n no v�lido\n");
            }

        }
        
        
        System.out.println("MOSTRAR RESULTADOS");
        System.out.printf(resultado.toString());

    }

}

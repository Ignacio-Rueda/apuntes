package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ignacio Rueda
 */
public class CompraVideojuego {

    //Declaraci�n atributos objeto.
    private int cantidadPS5;
    private int cantidadXbox;
    private int cantidadSwitch;

    private double gastoPS5;
    private double gastoXbox;
    private double gastoSwitch;

    //Declaraci�n constructor
    public CompraVideojuego(String ticket) {

        //Para separar cada art��culo, usamos m�todo split de String
        String[] arrayArticulos = ticket.split("#");
        //Para identificar los diferentes elementos utilizaremos expresiones regulares.
        //                            Nombre    Nombre plataforma   Gasto total articulos
        String expresionRegular = "([A-z (0-9 )*]+),(PS5|Switch|XBOX),([1-9]+\\.[0-9]{2})";
        Pattern patron = Pattern.compile(expresionRegular);
        
        //Recorremos ticket
        for (int n = 0; n < arrayArticulos.length; n++) {
            //Controlamos que el ticket sigue el patr�n.
            Matcher acoplamiento = patron.matcher(arrayArticulos[n]);
            if (acoplamiento.matches()) {
                String nombrePlataforma = acoplamiento.group(2);
                //Buscamos la plataforma y asignamos valores.

                switch (nombrePlataforma) {
                    case "PS5":
                        this.cantidadPS5++;
                        this.gastoPS5 += Double.parseDouble(acoplamiento.group(3));
                        break;
                    case "Switch":
                        this.cantidadSwitch++;
                        this.gastoSwitch += Double.parseDouble(acoplamiento.group(3));
                        break;
                    case "XBOX":
                        this.cantidadXbox++;
                        this.gastoXbox += Double.parseDouble(acoplamiento.group(3));
                        break;
                }
                
            } else {
                //Art��culos no v�lidos.
            }
        }


    }

    //Declaraci�n de m�todos getters
    public int getCantidad(String plataforma) {
        int resultado = 0;
        switch (plataforma) {
            case "PS5":
                resultado = this.cantidadPS5;
                break;
            case "SWITCH":
                resultado = this.cantidadSwitch;
                break;
            case "XBOX":
                resultado = this.cantidadXbox;
                break;
        }
        return resultado;
    }

    public double getGasto(String plataforma) {
        double resultado = 0;
        switch (plataforma) {
            case "PS5":
                resultado = this.gastoPS5;
                break;
            case "SWITCH": case "Switch":
                resultado = this.gastoSwitch;
                break;
            case "XBOX":
                resultado = this.gastoXbox;
                break;
        }
        return resultado;
    }

    public double getGastoTotal() {
        double resultado = this.gastoPS5 + this.gastoSwitch + this.gastoXbox;
        return resultado;
    }
    
    private double getIvaIncluido(double precioSinIva,double ivaAplicar){
        
        double precioConIva = precioSinIva + (precioSinIva*(ivaAplicar/100));
        return precioConIva;
    }

    public static void main(String[] args) {
        final double cantidadIva = 21;
        String ticket = "God of War Ragnarok,PS5,66.10#FIFA 23,XBOX,57.84#NBA 2k23,XBOX,37.18#Mario Kart 8 Deluxe,Switch,41.31#Need For Speed Unbound,PS5,56.19";
        CompraVideojuego miCompra;
        String[]plataformas = {"PS5","SWITCH","XBOX"};
        StringBuilder resultado = new StringBuilder();
        
        System.out.println("EJERCICIO 3.COMPRA DE VIDEOJUEGOS");
        System.out.println("---------------------------------");
        System.out.printf( "Creando objeto de compra con el ticket:%n\"%s\"%n",ticket);
        
        miCompra  = new CompraVideojuego(ticket);
        
        for(int n=0;n<plataformas.length;n++){
        
            resultado.append(String.format("%d Videojuego/s %s %.2f Euros (%.2f Euros IVA incluido)%n",  
                    miCompra.getCantidad(plataformas[n]),
                    plataformas[n],
                    miCompra.getGasto(plataformas[n]),
                    miCompra.getIvaIncluido(miCompra.getGasto(plataformas[n]),cantidadIva)
    
            ));
        }
        resultado.append(String.format("%s%nTotal: %.2fEuros (%.2f Euros IVA incluido)",
                "--------------------------------------------------",
                    miCompra.getGastoTotal(),
                    miCompra.getIvaIncluido(miCompra.getGastoTotal(), cantidadIva)
                )
        );
        
        
        
        System.out.println(resultado);
       

    }

}

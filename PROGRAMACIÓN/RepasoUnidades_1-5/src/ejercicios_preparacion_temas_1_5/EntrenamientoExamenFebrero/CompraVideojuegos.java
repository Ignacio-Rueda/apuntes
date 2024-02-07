package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class CompraVideojuegos {

    private int cantidadPS5;
    private int cantidadXbox;
    private int cantidadSwitch;

    private double gastoPS5;
    private double gastoXbox;
    private double gastoSwitch;

    //Constructor
    public CompraVideojuegos(String ticket) {
        //Separamos en un array cada uno de los elementos.
        String arrayDatos[] = ticket.split("#");
        //Recorremos cada uno de los elementos.
        for (int n = 0; n < arrayDatos.length; n++) {
            String datosInternos[] = arrayDatos[n].split(",");
            String nombreVideojuego = datosInternos[0];
            String plataforma = datosInternos[1];
            double precio = Double.parseDouble(datosInternos[2]);
            switch (plataforma) {
                case "PS5":
                    this.cantidadPS5++;
                    this.gastoPS5 += precio;
                    break;
                case "SWITCH": case "Switch":
                    this.cantidadSwitch++;
                    this.gastoSwitch += precio;
                    break;
                case "XBOX":
                    this.cantidadXbox++;
                    this.gastoXbox += precio;
                    break;
            }
        }

    }

    //Métodos.
    public int getCantidad(String plataforma) {
        int cantidad = 0;
        switch (plataforma) {
            case "PS5":
                cantidad = this.cantidadPS5;
                break;
            case "SWITCH":
                cantidad = this.cantidadSwitch;
                break;
            case "XBOS":
                cantidad = this.cantidadXbox;
                break;
        }
        return cantidad;
    }

    public double getGastoTotal() {
        return this.gastoPS5 + this.gastoSwitch + this.gastoXbox;
    }

    public static void main(String[] args) {
        System.out.println("EJERCICIO 3. COMPRA DE VIDEOJUEGOS");
        System.out.println("----------------------------------");

        System.out.println("Creando objeto de compra con el ticket:");
        CompraVideojuegos compra = new CompraVideojuegos("God of War Ragnarok,PS5,66.10#FIFA 23,XBOX,57.84#NBA 2k23,XBOX,37.18#Mario Kart 8 Deluxe,Switch,41.31#Need For Speed Unbound,PS5,56.19");
        //Mostrar por pantalla una línea para cada plataforma de videojuegos (PS5, SWITCH, XBOX) indicando lo siguiente:
        System.out.println(compra.cantidadPS5);
        System.out.println(compra.gastoPS5);
        System.out.println(compra.cantidadSwitch);
        System.out.println(compra.gastoSwitch);
        System.out.println(compra.cantidadXbox);
        System.out.println(compra.gastoXbox);
    }

}

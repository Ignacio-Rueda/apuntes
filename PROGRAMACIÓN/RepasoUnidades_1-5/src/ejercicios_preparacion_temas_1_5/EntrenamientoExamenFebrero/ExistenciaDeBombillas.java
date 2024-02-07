package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Scanner;

/**
 *
 * @author Ignacio Rueda
 */
public class ExistenciaDeBombillas {

    private int existenciasBombillas;

    public ExistenciaDeBombillas() {
        this.existenciasBombillas = 0;
    }

    public void reponer(int bombillas) {
        this.existenciasBombillas += bombillas;
    }

    public boolean vender(int bombillas) {
        boolean resultado = false;
        if (this.existenciasBombillas >= bombillas) {
            this.existenciasBombillas -= bombillas;
            resultado = true;
        }
        return resultado;
    }

    public int existenciasAcutales() {
        return this.existenciasBombillas;
    }

    @Override
    public String toString() {
        return String.format("Las existencias de bombillas son: %d%n", this.existenciasBombillas);
    }

    public static void main(String[] args) {

        ExistenciaDeBombillas existenciaBomb = new ExistenciaDeBombillas();
        Scanner teclado = new Scanner(System.in);
        boolean datosCorrecto = false;
        String respuesta = "N";
        int datoIntroducido = 0;
        while (!datosCorrecto) {
            try {
                System.out.printf("¿Cuántas bombillas se van a reponer?:");
                datoIntroducido = teclado.nextInt();
                existenciaBomb.reponer(datoIntroducido);
                datosCorrecto = true;
            } catch (Exception ex) {
                System.out.println("Datos inconrrectos");
                teclado.nextLine();
            }
        }
        System.out.println("EMPIEZA LA VENTA DE BOMBILLAS TRAS HABERSE REPUESTO LA CANTIDAD DE BOMBILLAS EN EL ALMACÉN");
        System.out.printf("En el almacén hay ahora %d bombillas%n", existenciaBomb.existenciasAcutales());
        while (respuesta.equals("N")) {

            try {
                System.out.println("¿Cuantos bombillas se van a vender?:");
                datoIntroducido = teclado.nextInt();
                boolean estado = existenciaBomb.vender(datoIntroducido);
                if (estado) {
                    System.out.printf("Se vendieron %d bombillas%n", datoIntroducido);
                    System.out.printf("En el almacén hay ahora %d bombillas%n", existenciaBomb.existenciasAcutales());
                } else {
                    System.out.printf("En el almacén hay ahora %d bombillas%n", existenciaBomb.existenciasAcutales());
                    System.out.println("Imposible vender, no hay suficientes bombillas en el almacén.");
                }

            } catch (Exception ex) {
                System.out.println("Los datos introducidos no son correctos");
            }
            teclado.nextLine();
            System.out.println("¿(T)erminar o (N)ueva venta?:");
            respuesta = teclado.nextLine().toUpperCase();
            if (respuesta.equals("N")) {
                System.out.printf("En el almacén hay ahora: %d bombillas%n", existenciaBomb.existenciasAcutales());
            } else if (respuesta.equals("T")) {
                System.out.printf("En el almacén hay ahora: %s bombillas%n", existenciaBomb.existenciasAcutales());
            } else {
                System.out.println("Respuesta no válida");
            }

        }

    }

}

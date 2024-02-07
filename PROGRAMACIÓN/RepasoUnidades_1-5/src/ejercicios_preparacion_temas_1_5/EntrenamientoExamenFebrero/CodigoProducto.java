package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodigoProducto {

    public static void main(String[] args) {
        String patron = "(10|[1-9][0-9])-(100|[1-9][0-9][0-9])-[VX]";
        String arrayPruebas[] = {
            "76-427-V",
            "94-435-V",
            "34-864-V",
            "95-324-V",
            "90-263-V",
            "34-635-V",
            "51-619-X",
            "42-901-V",
            "68-524-V"};
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        String n3;
        for (int n = 0; n < arrayPruebas.length; n++) {
            if (!arrayPruebas[n].matches(patron)) {
                System.out.println(arrayPruebas[n]);
                System.out.println("formato de código no adecuado");
            } else {
            
                String cadena[] = arrayPruebas[n].split("-");
                n1 = Integer.valueOf(cadena[0]);
                n2 = Integer.valueOf(cadena[1]);
                n3 = cadena[2];
                if((n1*n2)%2==0 && n3.equals("V") ||(n1*n2)%2==1 && n3.equals("X") ){
                    System.out.println(arrayPruebas[n]);
                    System.out.println("correcto");
                }
            }//Fin else

        }
        
        Pattern patron1 = Pattern.compile("hola");
        Matcher coincide = patron1.matcher("h");
        
    }

}


package ejercicios_preparacion_temas_1_5.FormateadoCadenas;

public class FormateoCadena {

    public static void main(String[] args) {
        
        //ESPACIOS
        System.out.printf("%5d%n",10);//La salida genera al menos 5 caracteres (poniendo espacios delante). Se mostrará el 10 pero también se añadirán 3 espacios delante para rellenar.
        
        //DECIMALES
        double num = 10;
        System.out.printf("%.2f%n",num);
        
        //ESPECIFICAR LA POSICIÓN DEL ARGUMENTO A UTILIZAR.
        double i = 10;
        double j = 20;
        //Mostrar : "10.00 multiplicado por 20.00 (10x20) es 200"
        String d = String.format("\"%1$.2f multiplicado por %2$.2f (%3$.0fx%4$.0f) es %5$.0f\"", i,j,i,j,i*j);
        
        System.out.println(d);
    }
    
}

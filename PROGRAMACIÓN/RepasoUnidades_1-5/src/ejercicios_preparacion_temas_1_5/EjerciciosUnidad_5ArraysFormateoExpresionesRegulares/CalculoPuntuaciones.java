
package ejercicios_preparacion_temas_1_5.EjerciciosUnidad_5ArraysFormateoExpresionesRegulares;
import java.util.Arrays;
public class CalculoPuntuaciones {

    public static void main(String[] args) {
        String expresionRegular = "[xXoO]|((X\\-)|(x\\-)|(O\\-)|(o\\-)){1,3}[XxOo]";
        String [] arrayAnotaciones = {"a", "a-b", "X-A", "O-O-B", "X--X", "O-X-", "-X-X", "O-X-O-X-O", "o", "O-o", "X", "o-x-o", "x", "x-x", "O-x-X", "X-X-X", "x-X-X-x"};
        StringBuilder resultados = new StringBuilder();
        int contadorPuntuacionesInvalidas = 0;
        System.out.println("CÁLCULO DE PUNTUACIONES");
        System.out.println("-----------------------");
        System.out.println("Anotaciones obtenidas de cada mano del juego:");
        System.out.println(Arrays.toString(arrayAnotaciones));
        
        //PROCESAMIENTO.
        for(int n=0;n<arrayAnotaciones.length;n++){
            if(arrayAnotaciones[n].matches(expresionRegular)){
                String[] listaInterior = arrayAnotaciones[n].split("-");//Si no encuentra el guión, devolverá un array que contiene solo un elemento, que es la cadena completa.
                //Una vez que tenemos separados los elementos, evaluamos.
                int contador =0;
                for(int j=0;j<listaInterior.length;j++){
                    contador += (listaInterior[j].equals("x") || listaInterior[j].equals("X"))?1:0;
                }
                resultados.append(contador);
            }else{
                resultados.append(-1);
                contadorPuntuacionesInvalidas++;
            }
            //Añadimos una coma después de la puntuación obtenida si no es el último elemento.
            if(n<arrayAnotaciones.length-1){
                resultados.append(",");
            }
            
        }
        
        System.out.println("RESULTADO: PUNTUACIONES CALCULADAS");
        System.out.println("----------------------------------");
        System.out.println(resultados.toString());
        System.out.printf("Número de anotaciones válidas:%d.%n",arrayAnotaciones.length-contadorPuntuacionesInvalidas);
        System.out.printf("Número de anotaciones inválidas:%d.%n",contadorPuntuacionesInvalidas);
        
    }
    
}

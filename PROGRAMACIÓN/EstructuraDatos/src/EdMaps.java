
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class EdMaps {
    private static Map<Integer,String>diccionario = new HashMap<Integer,String>(); 
    
    public static void main(String[] args) {
       
       //TAMAÑO DICCIONARIO.
       diccionario.size();
       //SI EXISTEN O NO ELEMENTOS EN EL DICCIONARIO.
       diccionario.isEmpty();
       //AÑADIR UN ELEMENTO AL DICCIONARIO.
       diccionario.put(0,"Ignacio");
       //DEVUELVE EL VALOR DE LA CLAVE O NULL SI NO EXISTE.
       diccionario.get(0);
       //DEVUELVE UN COLLECTION CON LOS VALORES DEL MAP
       diccionario.values();
       //IMPRIMIR DICCIONARIO CON ITERADOR
       Iterator<Integer> it = diccionario.keySet().iterator();
       while(it.hasNext()){
           Integer key = it.next();
           System.out.println("Clave "+key+diccionario.get(key));
       }
       /*-------------------------------------------------------------------------*/
       /*
        Map es una interfaz y por tanto se deben implementar los métodos de la interfaz.
       Java tiene varias "clases Map" implementadas, las tres más importantes:
       -HashMap: Los elementos que se insertarn en el map, no tendrán un orden específico. No aceptan claves duplicadas ni valores nulos.
       -TreeMap: El mapa lo ordena de forma natural. Por ejemplo si la clave son valores enteros, los ordena de menor a mayor.
       -LinkedHashMap: Inserta los elementos en el orden en el que se van insertando. Es decir, no tiene una ordenación de elementos como tal.
        Esta clase realiza la búsqueda de elementos más lenta que los demás.
       */
    }
    
}

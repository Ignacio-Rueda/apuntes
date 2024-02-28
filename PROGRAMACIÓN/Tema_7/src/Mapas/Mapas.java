
package Mapas;
import java.util.HashMap;
import java.util.Map;
public class Mapas {
    public static void main(String[]args){
        //CREACIÓN MAPA.
        Map<String,String> codigoCliente;
        codigoCliente = new HashMap<>();
        
        //INSERTAR DATOS.
        codigoCliente.put("Nacho", "001");
        codigoCliente.put("Ramón","002");
        codigoCliente.put("Eva", "003");
        
        System.out.println("MOSTRAR DATOS MEDIANTE CLAVE");
        System.out.printf("El código del cliente es: %s\n",codigoCliente.get("Ramón"));
        System.out.println();

        System.out.println("MOSTRAR DATOS EN CONJUNTO");
        for(Map.Entry<String,String> pares : codigoCliente.entrySet()){
            System.out.printf("Nombre cliente: %s - Código cliente: %s\n",pares.getKey(),pares.getValue());
        }
        System.out.println();
        
        System.out.println("MOSTRAR DATOS SOLO CLAVES");
        for(String valor:codigoCliente.keySet()){
            System.out.println(valor);
        }
        System.out.println();
        
        System.out.println("MOSTRAR DATOS SOLO VALORES");
        for(String valor:codigoCliente.values()){
            System.out.println(valor);
        }
        
        
        
        
        
    }
    
}

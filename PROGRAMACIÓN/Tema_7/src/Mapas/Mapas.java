
package Mapas;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.ListIterator;
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
        
        System.out.println();
        System.out.println("MAPAS DE MAPAS");
        System.out.println("*************************************************");
        System.out.println("COMUNIDADES AUTÓNOMAS Y PROVINCIAS");
        
        Map <String,List<String>> comunidadesProvincias = new HashMap<>();
        List<String>provinciasAndalucia = new LinkedList<>();
        List<String>provinciasExtremadura = new LinkedList<>();
        List<String>provinciasAragon = new LinkedList<>();
        
        //PROVINCIAS ANDALUCÍA
        provinciasAndalucia.add("JAÉN");
        provinciasAndalucia.add("GRANADA");
        provinciasAndalucia.add("MÁLAGA");
        provinciasAndalucia.add("ALMERÍA");
        provinciasAndalucia.add("CÁDIZ");
        provinciasAndalucia.add("HUELVA");
        provinciasAndalucia.add("SEVILLA");
        provinciasAndalucia.add("CÓRDOBA");
        //PROVINCIAS EXTREMADURA
        provinciasExtremadura.add("CÁCERES");
        provinciasExtremadura.add("BADAJOZ");
        //PROVINCIAS ARAGÓN
        provinciasAragon.add("HUESCA");
        provinciasAragon.add("ZARAGOZA");
        provinciasAragon.add("TERUEL");
        
        comunidadesProvincias.put("ANDALUCÍA", provinciasAndalucia);
        comunidadesProvincias.put("EXTREMADURA", provinciasExtremadura);
        comunidadesProvincias.put("ARAGÓN",provinciasAragon);
        
        
        for(Map.Entry<String,List<String>> provincias : comunidadesProvincias.entrySet()){
            System.out.printf("LA COMUNIDAD AUTÓNOMA: %s ESTÁ COMPUESTA POR: \n",provincias.getKey());
            ListIterator <String> it = provincias.getValue().listIterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
        
    
        
        
        
        
        
        
    }
    
}

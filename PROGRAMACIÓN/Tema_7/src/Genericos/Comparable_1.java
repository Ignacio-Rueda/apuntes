
package Genericos;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;
import java.util.ListIterator;
public class Comparable_1 {
    
    public static void main(String args[]){
        List<Integer> enteros = new LinkedList<>();
        List<LocalDate> fechas = new LinkedList<>();
        List<String> nombres = new LinkedList<>();
        List<Jugadores> jugadores = new LinkedList<>();
        
        enteros.add(1);
        enteros.add(5);
        enteros.add(-8);
        System.out.println(getMenor(enteros));
        
        fechas.add(LocalDate.of(2024, 1, 1));
        fechas.add(LocalDate.of(2000, 1, 1));
        fechas.add(LocalDate.of(1988, 12, 1));
        
        System.out.println(getMenor(fechas));
        
        nombres.add("Nacho");
        nombres.add("Antonio");
        nombres.add("Isabel");
        
        System.out.println(getMenor(nombres));
        
        jugadores.add(new Jugadores(4,"Nacho"));
        jugadores.add(new Jugadores(30,"Ramón"));
        jugadores.add(new Jugadores(25,"Eva"));
        
        System.out.println(getMenor(jugadores).getNombre());
    }
    
    public static <T extends Comparable> T getMenor(List<T> lista){
       //Comprobamos que no es nulo o vacía la lista que se nos pasa
       if(lista.size() == 0 || lista == null){
           return null;
       }
       T elementoMenor = lista.get(0);
       for(int i=1;i<lista.size();i++){
           if(elementoMenor.compareTo(lista.get(i))>0){//Si es mayor a 0 quiere decir que es mayor que el elemento.
               elementoMenor = lista.get(i);
           }
       }
       return elementoMenor;
    }
}

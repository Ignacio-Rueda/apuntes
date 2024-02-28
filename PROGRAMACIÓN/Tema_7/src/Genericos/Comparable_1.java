
package Genericos;
import java.util.LinkedList;
import java.util.List;
public class Comparable_1 {
    
    public static void main(String args[]){
        List<Integer> enteros = new LinkedList<>();
        enteros.add(1);
        enteros.add(5);
        enteros.add(-8);
        System.out.println(getMenor(enteros));
        
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

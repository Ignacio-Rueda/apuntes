package Genericos;

import java.util.List;
import java.util.Comparator;

public class Caja<T>{

    T atributo;

    public Caja(T atributo) {
        this.atributo = atributo;
    }

    public T getCaja() {
        return this.atributo;
    }

    public void setCaja(T atributo) {
        this.atributo = atributo;
    }
    /**
     * Método genérico.
     * Lo creo estático para poder usarlo desde la clase.
     * <T> indicamos que es un método genérico.
     * Sabemos que va a devolver un elemento de lo que se le pase por parámetro.
     */
    public static <T> T elementoLista(List<T>a,int i){
        return a.get(i);
    }
    /**
     * Método genérico.
     * Lo creo estático para poder usarlo desde la clase.
     * Sabemos que va a devolver un String.
     */
    
    public static <T> String obtenerNumTotal(List<Integer>a){
        return "Número total: "+a.size();
    }
    
 
    public static<T extends Comparable> T getMenor(List<T> a){
        //Comprobar que la lista no es nula o que no está vacía.
        if(a.size() == 0 || a==null){
            return null;
        }
        T elementoMenor = a.get(0);
        //Recorremos todos los elementos (empezamos por la posición 1) y los comparamos.
        for(int i=1;i<a.size();i++){
            if(elementoMenor.compareTo(a.get(i))>0){
                elementoMenor = a.get(i);
            }
        }
        
        return elementoMenor;
    }
   
}

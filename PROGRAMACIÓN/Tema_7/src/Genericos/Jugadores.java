
package Genericos;
import java.util.Comparator;
public class Jugadores implements Comparable<Jugadores>{
    int edad;
    String nombre;
    
    public Jugadores(int edad,String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public int compareTo(Jugadores o) {
        return Integer.compare(this.edad, o.edad);
    }

}

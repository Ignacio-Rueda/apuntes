package Genericos;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrabajadorTest {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Nacho", 1000, 34);
        Trabajador t2 = new Trabajador("Ramón", 3000, 30);
        Trabajador t3 = new Trabajador("Ana", 4000, 34);

        List<Trabajador> trabajadores = new LinkedList<>();
        trabajadores.add(t3);
        trabajadores.add(t2);
        trabajadores.add(t1);
        
        Set<Trabajador> trabajadoresSet = new TreeSet<>();
        trabajadoresSet.add(t3);
        trabajadoresSet.add(t2);
        trabajadoresSet.add(t1);
        
        System.out.println("MOSTRAMOS OBJETOS ORDENADOS POR HABERLOS GUARDADO EN UN TREESET");
        System.out.println(trabajadoresSet);
        System.out.println();
        
        System.out.println("MOSTRAMOS OBJETOS DESORDENADOS POR HABERLOS GUARDADO EN UN LINKEDLIST");
        System.out.println(trabajadores);
        System.out.println();
        
        System.out.println("UTILIZAMOS COLLECTIONS PARA ORDENAR LOS OBJETOS EN LA LISTA");
        Collections.sort(trabajadores);
        System.out.println(trabajadores);
        System.out.println();
        System.out.println("MOSTRAMOS TRABAJADOR CON MAYOR SUELDO");
        System.out.println(Trabajador.getMayorSueldo(trabajadores));

    }

}

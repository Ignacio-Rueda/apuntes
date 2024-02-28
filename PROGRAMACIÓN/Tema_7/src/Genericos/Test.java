package Genericos;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
public class Test {

    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>("Ignacio");
        Caja<Integer> miCaja_2 = new Caja<>(55);
        Caja<LocalDate> miCaja_3 = new Caja<>(LocalDate.of(2024,2,28));

        System.out.println(miCaja.getCaja());
        System.out.println(miCaja_2.getCaja());
        System.out.println(miCaja_3.getCaja());
        
        miCaja_3.setCaja(LocalDate.of(2025, 2, 26));
        
        System.out.println(miCaja_3.getCaja());
        
        List<Integer> edades = new LinkedList<>();
        for(int i=0;i<10;i++){
            edades.add(i);
        }
        edades.add(-500);
        int pos = 5;
        System.out.println(Caja.elementoLista(edades,pos));
        System.out.println(Caja.obtenerNumTotal(edades));
        
        System.out.println(Caja.getMenor(edades));
     
    }
   
 
}

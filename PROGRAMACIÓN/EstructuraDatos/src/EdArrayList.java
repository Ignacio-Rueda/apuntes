
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class EdArrayList {
    private static ArrayList <String> miArrayList = new ArrayList<String>();
    public static void main(String[] args) {
        
        //AÑADIR ELEMENTOS AL ARRAYLIST
        miArrayList.add("Ignacio");
        miArrayList.add("Rueda");
        miArrayList.add("Delgado");
        
        //OBTENER ELEMENTOS DEL ARRAYLIST
        for(int n=0;n<miArrayList.size();n++){
            System.out.printf("Posición %d%s%s%n",n," ",miArrayList.get(n));
        }
        System.out.println("");
        
        //ORDENAR ELEMENTOS DE UN ARRAYLIST DE MENOR A MAYOR.
        Collections.sort(miArrayList);
        for(String variable : miArrayList){
            System.out.println(variable);
        }
        System.out.println("");
        //ORDENAR ELEMENTOS DE UN ARRAYLIST DE MAYOR A MENOR.
        /*
            Para ordenar los elementos de mayor a menor, tenemos que crearnos un objeto de la calse Comparator, para que comparte los elementos y los ponga en orden
            inverso.
        
        */
        Comparator<String> comparador = Collections.reverseOrder();
        Collections.sort(miArrayList, comparador);
        
        for(String variable : miArrayList){
            System.out.println(variable);
        }
        System.out.println("");
        
     
    }
    
}

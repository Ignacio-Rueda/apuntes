package Listas;

import java.util.LinkedList;
import java.util.List;

public class Listas {

    public static void main(String args[]) {

        List<Integer> listaEnteros;
        listaEnteros = new LinkedList<>();

        //INTRODUCIR DATOS LISTA
        for (int n = 0; n < 10; n++) {
            listaEnteros.add(n);
        }
        System.out.println("MOSTRAR DATOS LISTA");
        System.out.println(listaEnteros);

        //LISTA DE LISTAS
        List<List<Integer>> listaDeListas;
        listaDeListas = new LinkedList<>();

        for (int n = 0; n < 10; n++) {
            List<Integer> miLista = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                miLista.add(i);
            }
            listaDeListas.add(n, miLista);
        }

        for (int n = 0; n < listaDeListas.size(); n++) {

            for (int j = 0; j < listaDeListas.get(n).size(); j++) {
                System.out.print(listaDeListas.get(n).get(j));
            }
            System.out.println();
        }

        System.out.println("SUMA DE MATRICES");
        System.out.println("CREAR DOS MATRICES");
        List<List<Integer>> matrizA = new LinkedList<>();
        List<List<Integer>> matrizB = new LinkedList<>();
        List<List<Integer>> matrizC = new LinkedList<>();

        for (int n = 0; n < 5; n++) {
            List<Integer> valoresMatriz = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                valoresMatriz.add(i);
            }
            matrizA.add(valoresMatriz);
            matrizB.add(valoresMatriz);
        }

        System.out.println("MOSTRAR VALORES MATRIZ");
        System.out.println("VALORES MATRIZ -> A");
        for (int n = 0; n < matrizA.size(); n++) {
            for (int j = 0; j < matrizA.get(n).size(); j++) {
                System.out.print(matrizA.get(n).get(j));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("VALORES MATRIZ -> B");
        for (int n = 0; n < matrizB.size(); n++) {
            for (int j = 0; j < matrizB.get(n).size(); j++) {
                System.out.print(matrizB.get(n).get(j));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ALMACENAR SUMA VALORES");
        for(int i=0;i<matrizA.size();i++){
            List <Integer> listaInterior = new LinkedList<>();
            for(int j=0;j<matrizA.get(i).size();j++){
                listaInterior.add(matrizA.get(i).get(j) + matrizB.get(i).get(j));
            }
            matrizC.add(listaInterior);
        }

        
        
        System.out.println("MOSTRAR VALORES");
        for(int i=0;i<matrizC.size();i++){
            for(int j=0;j<matrizC.get(i).size();j++){
                System.out.print(matrizC.get(i).get(j));
            }
            System.out.println();
        }
    }

}

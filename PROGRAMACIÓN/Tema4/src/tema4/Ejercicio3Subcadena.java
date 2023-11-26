/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

/**
 *
 * @author Ignacio Rueda
 */
public class Ejercicio3Subcadena {

    /*
    1-Queremos saber si en un texto aparecen las letras 'm', 'a', 'l' de manera consecutiva,
    ya sea porque se trate de la palabra "mal" o bien porque forme parte de otra palabra como "maldad", "ramal", "formalizar", etc.
    ¿cómo lo harías? ¿Qué alternativas se te ocurren?
    
    2-Imagina ahora que no solo queremos saber si la cadena "mal" aparece en un texto determinado,
    sino en qué posición del texto aparece. ¿Cómo podríamos resolverlo?
    
    3-Supongamos ahora que lo que nos interesa saber es si la cadena "mal" aparece más de una vez en el texto, 
    ¿qué se te ocurre para resolverlo?
     */
    public static void main(String[] args) {
        String textoAbuscar = "mal";
        String textoOriginal = "formalmentemal";
        int contador = 0;
        //1
        System.out.println(textoOriginal.contains(textoAbuscar));
        //2
        System.out.println("El texto se encuentra a partir de la posición:" + textoOriginal.indexOf(textoAbuscar));
        //3-a
        String aux = "";

        for (int x = 0; x < textoOriginal.length() - 1; x++) {
            if (x + textoAbuscar.length() <= textoOriginal.length()) {
                aux = textoOriginal.substring(x, x + textoAbuscar.length());
            }
            if (aux.contains(textoAbuscar)) {
                contador++;
            }
            aux = "";

        }

        System.out.printf("%s%s%s%d%n", "El número de veces que se ha encontrado la palabra ", textoAbuscar, " ha sido: ", contador);
        //3-b
        int posicion = -1;
        int numVeces = 0;
        do {
            posicion = textoOriginal.indexOf("mal", posicion + 1);
            if (posicion >= 0) {
                numVeces++;
            }
        } while (posicion >= 0);

// Salida de resultados
        System.out.printf("El texto \"mal\" se ha encontrado %d veces.\n", numVeces);

    }

}

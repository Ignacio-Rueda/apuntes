package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

public class BusquedaBuey {

    /**
     * Búsqueda del buey (OX en inglés).
     *
     * Crea un programa que rellene un array de 20 caracteres (no cadenas),
     * rellenado con caracteres aleatorios. Los caracteres a elegir son ?O?,
     * ?X?, ?L? y ?B?. Con estos cuatro caracteres se deberá rellenar el array,
     * conformando un array distinto para cada ejecución. Un ejemplo de array
     * generado podría ser:
     *
     * [B, B, B, X, L, X, L, L, O, X, O, L, O, O, B, O, B, X, O, L] Después se
     * deberá buscar si dentro de dicho array de 20 caracteres aparecen, en
     * posiciones consecutivas, los símbolos O y X. Solo hay que buscar la
     * primera aparición (si la hubiese). En el caso del ejemplo anterior
     * estarían en la posición 8:
     *
     * [B, B, B, X, L, X, L, L, O, X, O, L, O, O, B, O, B, X, O, L] Para la
     * búsqueda no se puede invocar a ningún método de ninguna clase (ni
     * convertir el array a un String). Como resultado de la ejecución, el
     * programa debería mostrar algo así:
     *
     * [B, B, B, X, L, X, L, L, O, X, O, L, O, O, B, O, B, X, O, L] OX
     * encontrado en posición 8
     *
     * O bien, si no aparece la secuencia OX:
     *
     * [L, L, B, X, B, B, X, L, L, X, B, X, O, L, X, L, X, X, X, L] OX no
     * encontrado
     *
     *
     *
     * Ampliación del ejercicio:
     *
     * Una vez resuelto, intentar ampliar el ejercicio para que en lugar de
     * indicar si se ha encontrado o no, se rellene un array de int donde se
     * indique las posiciones en las cuales se ha encontrado algún "OX". Una vez
     * finalice el programa se indicará cuántas veces ha sido encontrado y en
     * qué posiciones (usando el array de posiciones que se habrá rellenado
     * previamente). Por ejemplo, para este caso:
     *
     * [X, X, O, X, X, O, L, X, O, B, O, O, X, X, O, O, O, X, X, B] El resultado
     * debería ser algo así:
     *
     * OX ha sido encontrado. 3 veces. En posición 2. En posición 11. En
     * posición 16.
     */
    public static void main(String[] args) {
        final int NUMERO_CARACTERES = 20;
        int posArray = 0;//Guardaremos la posición en la que se ha encontrado el inicio de la consecución de caracteres.
        int numeroApariciones = 0; //Contar el número de apariciones.
        boolean existe = false;//Activar si la variable existe.
        int contadorCaracter = 0;
        int[] posicionesEncontradas = new int[NUMERO_CARACTERES];
        String resultado ="";//Almacenar texto final en el que controlamos el plural del número de veces.
        char[] arrayCaracteres = new char[NUMERO_CARACTERES];
        
        //1º.- GENERAR CARACTERES DE MANERA ALEATORIA:

        //0 = 79  X = 88 L = 76 B  = 66 (TABLA ASCII)
        

        while (contadorCaracter < NUMERO_CARACTERES) {
            //Generamos número aleatorio entre 66 y 88.
            int num = (int) (66 + (Math.random() * 23));
            //Si el número coincide con los buscados lo guardamos.
            if (num == 79 || num == 88 || num == 76 || num == 66) {
                char caracter = (char) num;
                arrayCaracteres[contadorCaracter] = caracter;
                contadorCaracter++;
            }
        }
        
        //char[] arrayCaracteres = {'X', 'X', 'O', 'X', 'X', 'O', 'L', 'X', 'O', 'B', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X', 'B'};
        //char [] arrayCaracteres = {'B', 'B', 'B', 'X', 'L', 'X', 'L', 'L', 'O', 'X', 'O', 'L', 'O', 'O', 'B', 'O', 'B', 'X', 'O', 'L'};
        
        
        //Recorremos el array de caracteres para buscar la consecución de caracteres solicitada, si existe, dejamos de buscar.
        for (int n = 0; n < arrayCaracteres.length && !existe; n++) {
            int pos = n + 1;
            if (pos < arrayCaracteres.length) {
                if (arrayCaracteres[n] == 'O' && arrayCaracteres[pos] == 'X') {
                    posArray = n;
                    posicionesEncontradas[n] = 1;
                    existe = true;
                }
            }
        }

        //2º- MOSTRAR RESULTADOS:
        if (existe) {
            System.out.printf("%s%nOX encontrado en la posición %d%n", Arrays.toString(arrayCaracteres), posArray);
        } else {
            System.out.printf("%s%nOX no encontrado %n", Arrays.toString(arrayCaracteres));
        }

        //3º- (AMPLIACIÓN EJERCICIO) MOSTRAR RESULTADOS:
        for (int n = 0; n < arrayCaracteres.length ; n++) {
            int pos = n + 1;
            if (pos < arrayCaracteres.length) {
                if (arrayCaracteres[n] == 'O' && arrayCaracteres[pos] == 'X') {
                    posicionesEncontradas[n] = 1;//Almacenar un 1 en la posición que encontramos el inicio de la combinación.
                    numeroApariciones++;
                }
            }
        }

        if (existe) {
            resultado = numeroApariciones>1?"veces":"vez";
            
            System.out.printf("OX ha sido encontrado. %d %s. %n", numeroApariciones,resultado);
            for (int n = 0; n < posicionesEncontradas.length; n++) {
                if (posicionesEncontradas[n] == 1) {
                    System.out.printf("En posición %d.%n", n);
                }
            }
        }

        
        
    }//Final método.

}//Final clase.

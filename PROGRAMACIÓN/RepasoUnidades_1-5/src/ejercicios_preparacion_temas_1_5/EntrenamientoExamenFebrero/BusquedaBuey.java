package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

public class BusquedaBuey {

    /**
     * B�squeda del buey (OX en ingl�s).
     *
     * Crea un programa que rellene un array de 20 caracteres (no cadenas),
     * rellenado con caracteres aleatorios. Los caracteres a elegir son ?O?,
     * ?X?, ?L? y ?B?. Con estos cuatro caracteres se deber� rellenar el array,
     * conformando un array distinto para cada ejecuci�n. Un ejemplo de array
     * generado podr�a ser:
     *
     * [B, B, B, X, L, X, L, L, O, X, O, L, O, O, B, O, B, X, O, L] Despu�s se
     * deber� buscar si dentro de dicho array de 20 caracteres aparecen, en
     * posiciones consecutivas, los s�mbolos O y X. Solo hay que buscar la
     * primera aparici�n (si la hubiese). En el caso del ejemplo anterior
     * estar�an en la posici�n 8:
     *
     * [B, B, B, X, L, X, L, L, O, X, O, L, O, O, B, O, B, X, O, L] Para la
     * b�squeda no se puede invocar a ning�n m�todo de ninguna clase (ni
     * convertir el array a un String). Como resultado de la ejecuci�n, el
     * programa deber�a mostrar algo as�:
     *
     * [B, B, B, X, L, X, L, L, O, X, O, L, O, O, B, O, B, X, O, L] OX
     * encontrado en posici�n 8
     *
     * O bien, si no aparece la secuencia OX:
     *
     * [L, L, B, X, B, B, X, L, L, X, B, X, O, L, X, L, X, X, X, L] OX no
     * encontrado
     *
     *
     *
     * Ampliaci�n del ejercicio:
     *
     * Una vez resuelto, intentar ampliar el ejercicio para que en lugar de
     * indicar si se ha encontrado o no, se rellene un array de int donde se
     * indique las posiciones en las cuales se ha encontrado alg�n "OX". Una vez
     * finalice el programa se indicar� cu�ntas veces ha sido encontrado y en
     * qu� posiciones (usando el array de posiciones que se habr� rellenado
     * previamente). Por ejemplo, para este caso:
     *
     * [X, X, O, X, X, O, L, X, O, B, O, O, X, X, O, O, O, X, X, B] El resultado
     * deber�a ser algo as�:
     *
     * OX ha sido encontrado. 3 veces. En posici�n 2. En posici�n 11. En
     * posici�n 16.
     */
    public static void main(String[] args) {
        final int NUMERO_CARACTERES = 20;
        int posArray = 0;//Guardaremos la posici�n en la que se ha encontrado el inicio de la consecuci�n de caracteres.
        int numeroApariciones = 0; //Contar el n�mero de apariciones.
        boolean existe = false;//Activar si la variable existe.
        int contadorCaracter = 0;
        int[] posicionesEncontradas = new int[NUMERO_CARACTERES];
        String resultado ="";//Almacenar texto final en el que controlamos el plural del n�mero de veces.
        char[] arrayCaracteres = new char[NUMERO_CARACTERES];
        
        //1�.- GENERAR CARACTERES DE MANERA ALEATORIA:

        //0 = 79  X = 88 L = 76 B  = 66 (TABLA ASCII)
        

        while (contadorCaracter < NUMERO_CARACTERES) {
            //Generamos n�mero aleatorio entre 66 y 88.
            int num = (int) (66 + (Math.random() * 23));
            //Si el n�mero coincide con los buscados lo guardamos.
            if (num == 79 || num == 88 || num == 76 || num == 66) {
                char caracter = (char) num;
                arrayCaracteres[contadorCaracter] = caracter;
                contadorCaracter++;
            }
        }
        
        //char[] arrayCaracteres = {'X', 'X', 'O', 'X', 'X', 'O', 'L', 'X', 'O', 'B', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X', 'B'};
        //char [] arrayCaracteres = {'B', 'B', 'B', 'X', 'L', 'X', 'L', 'L', 'O', 'X', 'O', 'L', 'O', 'O', 'B', 'O', 'B', 'X', 'O', 'L'};
        
        
        //Recorremos el array de caracteres para buscar la consecuci�n de caracteres solicitada, si existe, dejamos de buscar.
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

        //2�- MOSTRAR RESULTADOS:
        if (existe) {
            System.out.printf("%s%nOX encontrado en la posici�n %d%n", Arrays.toString(arrayCaracteres), posArray);
        } else {
            System.out.printf("%s%nOX no encontrado %n", Arrays.toString(arrayCaracteres));
        }

        //3�- (AMPLIACI�N EJERCICIO) MOSTRAR RESULTADOS:
        for (int n = 0; n < arrayCaracteres.length ; n++) {
            int pos = n + 1;
            if (pos < arrayCaracteres.length) {
                if (arrayCaracteres[n] == 'O' && arrayCaracteres[pos] == 'X') {
                    posicionesEncontradas[n] = 1;//Almacenar un 1 en la posici�n que encontramos el inicio de la combinaci�n.
                    numeroApariciones++;
                }
            }
        }

        if (existe) {
            resultado = numeroApariciones>1?"veces":"vez";
            
            System.out.printf("OX ha sido encontrado. %d %s. %n", numeroApariciones,resultado);
            for (int n = 0; n < posicionesEncontradas.length; n++) {
                if (posicionesEncontradas[n] == 1) {
                    System.out.printf("En posici�n %d.%n", n);
                }
            }
        }

        
        
    }//Final m�todo.

}//Final clase.

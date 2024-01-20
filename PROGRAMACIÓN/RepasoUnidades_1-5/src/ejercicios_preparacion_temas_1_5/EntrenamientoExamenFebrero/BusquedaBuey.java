package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Arrays;

public class BusquedaBuey {

    public static void main(String[] args) {
        String singularPlural="";//Almacenar vez o veces, dependiendo del n�mero.
        StringBuilder resultado = new StringBuilder();
        final int NUMERO_CARACTERES = 20;
        int posArray = 0;//Guardaremos la posici�n en la que se ha encontrado el inicio de la consecuci�n de caracteres.
        int numeroApariciones = 0; //Contar el n�mero de apariciones.
        boolean existe = false;//Activar si la variable existe.
        int[] posicionesEncontradas = new int[NUMERO_CARACTERES];
        // String resultado = "";//Almacenar texto final en el que controlamos el plural del n�mero de veces.
        char[] arrayCaracteres = new char[NUMERO_CARACTERES];

        //1- GENERAR CARACTERES
        generarCaracteres(arrayCaracteres);

        //char[] arrayCaracteres = {'X', 'X', 'O', 'X', 'X', 'O', 'L', 'X', 'O', 'B', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X', 'B'};
        //char [] arrayCaracteres = {'B', 'B', 'B', 'X', 'L', 'X', 'L', 'L', 'O', 'X', 'O', 'L', 'O', 'O', 'B', 'O', 'B', 'X', 'O', 'L'};
        //2- RECORREMOS EL ARRAY DE CARACTERES PARA BUSCAR LA CONSECUCI�N DE CARACTERES SOLICITADA, SI EXISTE, DEJAMOS DE BUSCAR.
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

        //3- OBTENER RESULTADO EJECICIO B�SICO:
        resultado.append("RESULTADOS EJERCICIO BASE:%n");
        if (existe) {
            resultado.append(String.format("%s%nOX encontrado en la posici�n %d%n",
                    Arrays.toString(arrayCaracteres), posArray
            ));
        } else {
            resultado.append(String.format("%s%nOX no encontrado %n",
                    Arrays.toString(arrayCaracteres)));
        }

        //4- OBTENER RESULTADO EJERCICIO AMPLIADO:
        //4.1 RECORREMOS EL ARRAY DE CARACTERES PARA BUSCAR LA CONSECUCI�N DE CARACTERES SOLICITADA.
        for (int n = 0; n < arrayCaracteres.length; n++) {
            int pos = n + 1;
            if (pos < arrayCaracteres.length) {
                if (arrayCaracteres[n] == 'O' && arrayCaracteres[pos] == 'X') {
                    posicionesEncontradas[n] = 1;//Almacenar un 1 en la posici�n que encontramos el inicio de la combinaci�n.
                    numeroApariciones++;
                }
            }
        }
        resultado.append("RESULTADOS AMPLIACI�N EJERCICIO:%n");
        if (existe) {
            singularPlural = numeroApariciones > 1 ? "veces" : "vez";

            resultado.append(String.format("OX ha sido encontrado. %d %s. %n", 
                    numeroApariciones, singularPlural
            ));
            //Usamos el array de posiciones rellenado para ver las posiciones.
            for (int n = 0; n < posicionesEncontradas.length; n++) {
                if (posicionesEncontradas[n] == 1) {
                    resultado.append(String.format("En posici�n %d.%n",
                            n));
                }
            }
        }
        //--------------------------------------
        //         MOSTRAR RESULTADOS
        //--------------------------------------
        
        System.out.printf(resultado.toString());
        
    }//Final m�todo main.

    /**
     * M�todo para generar caracteres de manera aleatoria.
     * @param arrayCaracteres
     */
    public static void generarCaracteres(char[] arrayCaracteres) {
        int contadorCaracter = 0;

        //0 = 79  X = 88 L = 76 B  = 66 (TABLA ASCII)
        while (contadorCaracter < arrayCaracteres.length) {
            //Generamos n�mero aleatorio entre 66 y 88.
            int num = (int) (66 + (Math.random() * 23));
            //Si el n�mero coincide con los buscados lo guardamos.
            if (num == 79 || num == 88 || num == 76 || num == 66) {
                char caracter = (char) num;
                arrayCaracteres[contadorCaracter] = caracter;
                contadorCaracter++;
            }
        }

    }

}//Final clase.

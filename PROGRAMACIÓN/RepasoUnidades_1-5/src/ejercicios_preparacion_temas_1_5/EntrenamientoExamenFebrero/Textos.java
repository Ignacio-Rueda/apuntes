package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class Textos {

    /**
     * Crea una clase llamada ?Textos? que permita almacenar una cadena de texto
     * y un array de cadenas de 8 posiciones. A continuación, implementa los
     * siguientes métodos (el resultado de cada uno de los métodos se almacenará
     * en la posición del array que coincida con su número):
     *
     * 1. Método para contar el número de vocales que tiene la cadena (como
     * resultado se almacenará: ___ vocales).
     *
     * 2. Método para invertir el orden de las letras de la cadena original
     * (como resultado se almacenará la cadena invertida).
     *
     * 3. Método para mimimí para convertir cada vocal de la cadena original en
     * la letra i (prohibido usar métodos de tipo replace).
     *
     * 4. Método para eliminar los espacios en blanco de la cadena (prohibido
     * usar métodos de tipo replace).
     *
     * 5. Método para comprobar si la cadena original es un palíndromo o no, es
     * decir, si se lee igual de izquierda a derecha y de derecha a izquierda
     * (como resultado se almacenará: "Sí es palindromo" o "No es palíndromo").
     *
     * 6. Método para contar el número de palabras que tiene la cadena original
     * (como resultado se almacenará: ___ palabras).
     *
     * 7. Método para eliminar todos los caracteres repetidos en la cadena
     * original (como resultado se almacenará la misma cadena quitando las
     * segundas y posteriores apariciones de los caracteres repetidos).
     *
     * 8. Método para cifrar la cadena original con cifrado César ROT2. En este
     * cifrado cada carácter se transformará en el carácter de dos posiciones a
     * la derecha: A será C, B será D, etc. (como resultado se almacenará la
     * cadena cifrada).
     *
     * Por último, crea un programa principal (main) que permita probar las
     * funcionalidades desarrolladas.
     */
    static String cadenaTexto;
    String[] arrayCadenaTexto = new String[8];

    public Textos(String cadena) {
        Textos.cadenaTexto = cadena;
    }

    public static String contarVocales() {
        int contador = 0;
        String resultado;
        for (int n = 0; n < Textos.cadenaTexto.length(); n++) {
            if (Textos.cadenaTexto.toLowerCase().charAt(n) == 'a' || Textos.cadenaTexto.toLowerCase().charAt(n) == 'e' || Textos.cadenaTexto.toLowerCase().charAt(n) == 'i' || Textos.cadenaTexto.toLowerCase().charAt(n) == 'o' || Textos.cadenaTexto.charAt(n) == 'u') {
                contador++;
            }
        }
        resultado = String.format("%d vocales", contador);
        return resultado;
    }

    public static String invertirOrdenLetras() {
        String resultado = "";
        for (int n = Textos.cadenaTexto.length() - 1; n >= 0; n--) {
            resultado += Textos.cadenaTexto.charAt(n);
        }
        return resultado;
    }

    public static String mimi() {
        String resultado = "";
        for (int n = 0; n < Textos.cadenaTexto.length(); n++) {
            if (Textos.cadenaTexto.toLowerCase().charAt(n) == 'a' || Textos.cadenaTexto.toLowerCase().charAt(n) == 'e' || Textos.cadenaTexto.toLowerCase().charAt(n) == 'o' || Textos.cadenaTexto.toLowerCase().charAt(n) == 'u') {
                resultado += 'i';
            } else {
                resultado += Textos.cadenaTexto.charAt(n);
            }
        }
        return resultado;
    }

    public static String eliminarEspacios() {
        String resultado = "";
        for (int n = 0; n < Textos.cadenaTexto.length(); n++) {
            if(Textos.cadenaTexto.charAt(n) ==' '){
            resultado += "";
            }else{
            resultado += Textos.cadenaTexto.charAt(n);
            }
        }
        return resultado;
    }
    
    public static String isPalindromo(){
        StringBuilder resultado =  new StringBuilder();
        resultado.append(Textos.cadenaTexto);
        resultado.reverse();
        return resultado.toString().equals(Textos.cadenaTexto)?"Sí es palíndromo":"No es palíndromo";
    }

    //Entrada principal progama.
    public static void main(String[] args) {
        Textos miTexto = new Textos("Nacho");
        System.out.println(Textos.contarVocales());
        System.out.println("");
        System.out.println(Textos.invertirOrdenLetras());
        System.out.println("");
        System.out.println(Textos.mimi());
        System.out.println("");
        System.out.println(Textos.eliminarEspacios());
         System.out.println("");
        System.out.println(Textos.isPalindromo());
    
    }

}

package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class Textos {

    /**
     * Crea una clase llamada ?Textos? que permita almacenar una cadena de texto
     * y un array de cadenas de 8 posiciones. A continuaci�n, implementa los
     * siguientes m�todos (el resultado de cada uno de los m�todos se almacenar�
     * en la posici�n del array que coincida con su n�mero):
     *
     * 1. M�todo para contar el n�mero de vocales que tiene la cadena (como
     * resultado se almacenar�: ___ vocales).
     *
     * 2. M�todo para invertir el orden de las letras de la cadena original
     * (como resultado se almacenar� la cadena invertida).
     *
     * 3. M�todo para mimim� para convertir cada vocal de la cadena original en
     * la letra i (prohibido usar m�todos de tipo replace).
     *
     * 4. M�todo para eliminar los espacios en blanco de la cadena (prohibido
     * usar m�todos de tipo replace).
     *
     * 5. M�todo para comprobar si la cadena original es un pal�ndromo o no, es
     * decir, si se lee igual de izquierda a derecha y de derecha a izquierda
     * (como resultado se almacenar�: "S� es palindromo" o "No es pal�ndromo").
     *
     * 6. M�todo para contar el n�mero de palabras que tiene la cadena original
     * (como resultado se almacenar�: ___ palabras).
     *
     * 7. M�todo para eliminar todos los caracteres repetidos en la cadena
     * original (como resultado se almacenar� la misma cadena quitando las
     * segundas y posteriores apariciones de los caracteres repetidos).
     *
     * 8. M�todo para cifrar la cadena original con cifrado C�sar ROT2. En este
     * cifrado cada car�cter se transformar� en el car�cter de dos posiciones a
     * la derecha: A ser� C, B ser� D, etc. (como resultado se almacenar� la
     * cadena cifrada).
     *
     * Por �ltimo, crea un programa principal (main) que permita probar las
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
        return resultado.toString().equals(Textos.cadenaTexto)?"S� es pal�ndromo":"No es pal�ndromo";
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

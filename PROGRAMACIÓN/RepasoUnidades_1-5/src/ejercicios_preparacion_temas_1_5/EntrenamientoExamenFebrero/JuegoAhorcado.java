package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 * @author Ignacio Rueda
 */
public class JuegoAhorcado {

    private static String[] arrayPalabras = {"SOL",
        "OSO",
        "MESA",
        "FLOR",
        "LAPIZ",
        "PERRO",
        "AGUA",
        "GATO",
        "LLAVE",
        "RANA",
        "CAMA",
        "VASO",
        "CAJA",
        "TELEVISOR",
        "COMPUTADOR",
        "CHOCOLATE",
        "MELOCOTON",
        "PARAGUAS",
        "AVENTURAS",
        "REBANADORA",
        "CUADERNO"

    };
    private static int[] palabrasUtilizadas = new int[arrayPalabras.length];//Almacenamos en las posiciones que ya se han utilizado.

    public static final int TAMANIO_MIN = 4;
    public static final int TAMANIO_MAX = 10;
    private String palabraSecreta = "";
    private int tamanioMaximoPalabra;
    private int maximoNumIntentos;
    private char[] letrasEncontradas;

    /**
     * Mecanismo que permite que cada vez que se cree un objeto, la palabra
     * secreta sea diferente. Cuando se haya "gastado" más del 80% de las
     * palabras, podrán volverse a usar todas de nuevo. Cuando ya se haya
     * "gastado" más del 80% de las palabras, entonces podrán volverse a usar
     * todas de nuevo, comenzando otra vez a "eliminar" palabras.
     */
    public static String palabraRandom(int tamanioMaximoPalabra) {
        boolean existe = true;
        int pos = 0;

        //1ºCALCULAR SI YA SE HAN CONSUMIDO EL 80% DE LAS PALABRAS.
        //----------------------------------------------------------------------
        int contador = 0;
        for (int n = 0; n < JuegoAhorcado.arrayPalabras.length; n++) {
            if (JuegoAhorcado.palabrasUtilizadas[n] == 1) {//Si hemos registrado la posición aumentamos.
                contador++;
            }
        }
        int porcentajeGastadas = contador * 100 / JuegoAhorcado.palabrasUtilizadas.length;

        if (porcentajeGastadas >= 80) {//Si se han utilizado el 80% o mas de las palbras reseteamos las posiciones a cero.
            for (int n = 0; n < JuegoAhorcado.arrayPalabras.length; n++) {
                JuegoAhorcado.palabrasUtilizadas[n] = 0;
            }
        }

        //2º COMPROBAR SI EXISTEN PALABRAS CON EL TAMAÑO SOLICITADO Y NO HAN SIDO UTILIZADAS.
        //----------------------------------------------------------------------------------
        boolean posiblePalabraPorTamanio = false;
        for (int n = 0; n < JuegoAhorcado.arrayPalabras.length && !posiblePalabraPorTamanio; n++) {
            if (JuegoAhorcado.arrayPalabras[n].length() == tamanioMaximoPalabra && JuegoAhorcado.palabrasUtilizadas[n] == 0) {
                posiblePalabraPorTamanio = true;
            }
        }
        //En este bucle entraremos SI existen palabras posibles por tamaño.
        boolean palabraUsada = true;//Para detectar si la posición está ocupada (1) o no ocupada (0).
        while (posiblePalabraPorTamanio && palabraUsada) {
            pos = (int) (Math.random() * (JuegoAhorcado.arrayPalabras.length));//Generar posición aleatoria.
            if (JuegoAhorcado.palabrasUtilizadas[pos] == 0 && JuegoAhorcado.arrayPalabras[pos].length() == tamanioMaximoPalabra) {
                JuegoAhorcado.palabrasUtilizadas[pos] = 1;//Almacenamos un 1 en esa posición para saber que esta palabra ya ha sido utilizada.
                palabraUsada = false;//Como hemos encontrado una posición en 0,salimos del bucle.
            }
        }
        //En este bucle entraremos porque NO existan palabras posibles por tamaño.
        while (!posiblePalabraPorTamanio && palabraUsada) {
            pos = (int) (Math.random() * (JuegoAhorcado.arrayPalabras.length));//Generar posición aleatoria.
            if (JuegoAhorcado.palabrasUtilizadas[pos] == 0) {
                JuegoAhorcado.palabrasUtilizadas[pos] = 1;//Almacenamos un 1 en esa posición para saber que esta palabra ya ha sido utilizada.
                palabraUsada = false;//Como hemos encontrado una posición en 0,salimos del bucle.
            }
        }

        return JuegoAhorcado.arrayPalabras[pos];

    }

    public boolean probar(char letra) throws IllegalStateException {
        if (this.maximoNumIntentos == 0) {
            throw new IllegalStateException("No quedan más intentos.");
        }
        boolean coincide = false;
        //String patron = String.valueOf(letra);
        Pattern patron = Pattern.compile(String.valueOf(letra));
        Matcher encaja = patron.matcher(palabraSecreta);
        if (encaja.find()) {
            //Recorro la palabra y guardo en la posición correspondiente la letra.
            for (int n = 0; n < this.palabraSecreta.length(); n++) {
                if (this.palabraSecreta.charAt(n) == letra) {
                    this.letrasEncontradas[n] = letra;
                }
            }
            coincide = true;
        }
        this.maximoNumIntentos--;
        return coincide;
    }

    public int getIntentosRestantes() {
        return this.maximoNumIntentos;
    }

    public int getLetrasRestantes() {
        int contador = 0;
        for (int n = 0; n < this.letrasEncontradas.length; n++) {
            if (this.letrasEncontradas[n] == '\0') {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (int n = 0; n < this.letrasEncontradas.length; n++) {
            resultado.append(String.format("%c ",
                    this.letrasEncontradas[n] == '\0' ? '_' : this.letrasEncontradas[n]
            ));
        }
        return resultado.toString();
    }

    public JuegoAhorcado(int tamanioMaximoPalabra, int maxNumIntentos) throws IllegalArgumentException {
        if (tamanioMaximoPalabra < JuegoAhorcado.TAMANIO_MIN || tamanioMaximoPalabra > JuegoAhorcado.TAMANIO_MAX) {
            throw new IllegalArgumentException(String.format("Tamaño %d no permitido.%n", maxNumIntentos));
        }
        this.tamanioMaximoPalabra = tamanioMaximoPalabra;
        this.palabraSecreta = JuegoAhorcado.palabraRandom(this.tamanioMaximoPalabra);
        this.maximoNumIntentos = maxNumIntentos;
        this.letrasEncontradas = new char[palabraSecreta.length()];
    }

    public void realizarOperaciones() {

    }

    public static void main(String[] args) {
        /**
         * Genere un número aleatorio entre 4 y 10 y cree un objeto del tipo
         * JuegoAhorcado con ese número aleatorio como tamaño máximo de palabra
         * y con 12 intentos.
         */
        //Creamos un array del tipo JuegoAhorcado para poder probar bastantes palabras.
        JuegoAhorcado miArrayJuegos[] = new JuegoAhorcado[10];
        int numIntentos = 26;
        int numAleatorio = (int) (4 + Math.random() * 7);
        JuegoAhorcado miJuego = null;

        for (int i = 0; i < miArrayJuegos.length; i++) {
            try {
                miArrayJuegos[i] = new JuegoAhorcado(numAleatorio, numIntentos);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        for (int j = 0; j < miArrayJuegos.length; j++) {
            //GENERAR LETRAS ALEATORIAS  Y QUE NO SE REPITAN
            int arrayAbecedario[] = new int[26];
            int posArrayAbecedario = 0;//Posición que ocupa en nuestro array abecedario.
            int posAscii = 0;
            
            for (int i = 0; i < numIntentos; i++) {

                boolean encontrada = false;
                do {
                    posAscii = (int) (65 + Math.random() * 26);//Posición al azar de una letra en tabla Asci
                    //Recorremos nuestro abecesario para comprobar si ya ha salido la letra.
                    encontrada = false;
                    for (int n = 0; n < arrayAbecedario.length; n++) {
                        //Si la posición generada al azar ya existe en alguna posición del array, tenemos que seguir buscando
                        if (arrayAbecedario[n] == posAscii) {
                            encontrada = true;
                        }
                    }
                    if (!encontrada) {
                        arrayAbecedario[posArrayAbecedario] = posAscii;
                        posArrayAbecedario++;
                    }
                } while (encontrada);
                //Mostrar datos por cada iteración:
                System.out.println("\nIntento número " + (i + 1));
                System.out.println("-------------------");
                System.out.printf("PROBAR CON LA LETRA: %c%n", (char) posAscii);
                miArrayJuegos[j].probar((char) posAscii);
                System.out.printf("ESTADO JUEGO: %s%n", miArrayJuegos[j]);
                System.out.printf("LETRAS RESTANTES: %d%n", miArrayJuegos[j].getLetrasRestantes());
                System.out.printf("INTENTOS RESTANTES: %s%n", miArrayJuegos[j].getIntentosRestantes());

            }//Fin bucle principal

        }

    }

}

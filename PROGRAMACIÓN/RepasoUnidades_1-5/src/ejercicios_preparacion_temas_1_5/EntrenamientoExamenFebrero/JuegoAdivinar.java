package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.util.Scanner;

/**
 * Implementa una clase JuegoAdivinar que modela un juego de adivinaci�n de
 * n�meros, que generar� un n�mero secreto aleatorio y a la que se le podra
 * consultar si un n�mero determinado es ese n�mero secreto o no.
 *
 * @author Ignacio Rueda
 */
public class JuegoAdivinar {

    //DECLARACI�N ATRIBUTOS DE CLASE
    public static final int LIMINTE_MIN_VAL_POSIBLE = 0;//No se indica en ejercicio.
    public static final int LIMITE_MAX_VAL_POSIBLE = 40;

    public static final int LIMITE_MIN_INTENTOS = 1;//No se indica en ejercicio.
    public static final int LIMITE_MAX_INTENTOS = 10;

    public static final int DEFAULT_MAX_VAL_POSIBLE = 10;
    public static final int DEFAULT_LIMITE_MAX_INTENTOS = 5;
    //DECLARACI�N ATRIBUTOS OBJETO
    private int numeroSecreto;
    private int intentosActuales;
    private int maxValorPosible;
    private int maxIntentos;

    //CONSTRUCTORES
    public JuegoAdivinar(int maxValorPosible, int maxIntentos) throws IllegalArgumentException {
        if (maxValorPosible > JuegoAdivinar.LIMITE_MAX_VAL_POSIBLE || maxValorPosible < JuegoAdivinar.LIMINTE_MIN_VAL_POSIBLE) {
            throw new IllegalArgumentException(String.format("L�mite de n�mero secreto fuera de rango %d.", maxValorPosible));
        }
        if (maxIntentos > JuegoAdivinar.LIMITE_MAX_INTENTOS || maxIntentos < JuegoAdivinar.LIMITE_MIN_INTENTOS) {
            throw new IllegalArgumentException(String.format("L�mite de intentos fuera de rango %d.", maxIntentos));
        }
        //Generar n�mero aleatorio entre 0 y m�ximo valor posible indicado.
        this.numeroSecreto = (int) (Math.random() * (maxValorPosible + 1));
        //Actualizar valores.
        this.maxValorPosible = maxValorPosible;
        this.maxIntentos = maxIntentos;
    }

    public JuegoAdivinar(int maxIntentos) throws IllegalArgumentException {
        this(JuegoAdivinar.DEFAULT_MAX_VAL_POSIBLE, maxIntentos);
    }

    public JuegoAdivinar() {
        this(JuegoAdivinar.DEFAULT_MAX_VAL_POSIBLE, JuegoAdivinar.DEFAULT_LIMITE_MAX_INTENTOS);
    }

    //DECLARACI�N DE M�TODOS GET
    public int getIntentosRestantes() {
        return this.maxIntentos - this.intentosActuales;
    }

    public int getMaxValPosible() {
        return this.maxValorPosible;
    }

    //OTROS M�TODOS DE LA CLASE
    public int adivinarNumero(int numero) {
        int resultado = 0;//Si el n�mero pasado como par�metro es igual al n�mero secreto.
        //Si el n�mero pasado como par�metro es menor que el n�mero secreto.
        if (numero < this.numeroSecreto) {
            resultado = 1;
        }//Si el n�mero pasado como par�metro es mayor que el n�mero secreto.
        else if (numero > this.numeroSecreto) {
            resultado = -1;
        }
        //Actualizar valores.
        this.intentosActuales ++;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("EJERCICIO 3.ADIVINA EL N�MERO");
        System.out.println("-------------------------------------------------");

        //Intento n�mero 1
        System.out.printf("Intentando crear juego con valores err�neos 10 y 41%n");
        try {
            JuegoAdivinar intento1 = new JuegoAdivinar(10, 41);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error. " + ex.getMessage());
        }
        //Intento n�mero 2
        System.out.printf("Intentando crear un juego con valor err�neo:11%n");
        try {
            JuegoAdivinar intento2 = new JuegoAdivinar(11);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error. " + ex.getMessage());
        }
        //Intento n�mero 3
        System.out.printf("Intentando crear un juego con valor err�neo: 0%n");
        try {
            JuegoAdivinar intento3 = new JuegoAdivinar(0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error. " + ex.getMessage());
        }
        System.out.println("Comienza el juego");
        //Crear un objeto JuegoAdivinar v�lido usando constructor sin par�metros.
        JuegoAdivinar miJuego = new JuegoAdivinar();
        //Informar al usuario de los intentos que tiene as� como del rango para adivinar.
        System.out.printf("Tienes %d intentos para averiguar el n�mero entre %d y %d.%n", miJuego.getIntentosRestantes(), 0, JuegoAdivinar.DEFAULT_MAX_VAL_POSIBLE);
        //Implementa un bucle en el que mientras queden intentos, se solicite al usuario un n�mero para intentar adivinar el n�mero secreto.
        Scanner teclado = new Scanner(System.in);

        boolean encontrado = false;
        while (miJuego.getIntentosRestantes() > 0 && !encontrado) {
            System.out.println("Introduce un n�mero");
            int numeroBuscado = teclado.nextInt();
            StringBuilder resultado = new StringBuilder();
            int adivinaNumero = miJuego.adivinarNumero(numeroBuscado);
            switch (adivinaNumero) {
                case 0:
                    resultado.append("�Correcto!");
                    encontrado = true;
                    break;
                case 1:
                    resultado.append(String.format("El n�mero que buscas es mayor que %d.", numeroBuscado));
                    break;
                case -1:
                    resultado.append(String.format("El n�mero que buscas es menor que %d.", numeroBuscado));
                    break;
            }
            System.out.println(resultado);
        }

    }

}

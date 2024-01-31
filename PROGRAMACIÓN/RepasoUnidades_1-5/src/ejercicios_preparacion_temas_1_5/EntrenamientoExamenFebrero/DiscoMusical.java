package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

/**
 * Escribe una clase llamada "DiscoMusical" con atributos como t�tulo, grupo
 * musical, n�mero de canciones, precio y fecha de lanzamiento. Crear un array
 * de tama�o 50 para almacenar objetos de la clase "DiscoMusical". A�adir varios
 * discos al array (puede hacerlo por teclado o generar datos de forma
 * aleatoria).
 *
 * Implementa los siguientes m�todos para obtener informaci�n del array de
 * discos:
 *
 * 1. Un m�todo que muestre solo aquellos discos cuya fecha de lanzamiento
 * coincida con el a�o especificado desde el teclado por el usuario.
 *
 * 2. Un m�todo que muestre los discos con mayor y menor n�mero de canciones,
 * as� como la cantidad media de canciones seg�n los discos almacenados en el
 * array.
 *
 * 3. Un m�todo que muestre el disco m�s barato y el m�s caro.
 *
 * 4. Un m�todo que permita conocer si son m�s caros los discos que est�n en las
 * posiciones pares del array o los que est�n en las posiciones impares.
 *
 * Por �ltimo, crea un programa principal (main) que permita probar las
 * funcionalidades desarrolladas.
 *
 * @author Ignacio Rueda
 */
public class DiscoMusical {

    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("EEEE - MMMM - YYYY", new Locale("es", "ES"));
    //Atributos
    private final String titulo;
    private final String grupoMusical;
    private int numCanciones;
    private double precio;
    private LocalDate fechaLanzamiento;

    public DiscoMusical(String titulo, String grupoMusical, int numCanciones, double precio, LocalDate fechaLanzamiento) {
        this.titulo = titulo;
        this.grupoMusical = grupoMusical;
        this.numCanciones = numCanciones;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Creamos constructor en copia
     */
    public DiscoMusical(DiscoMusical copia) {
        this(copia.titulo, copia.grupoMusical, copia.numCanciones, copia.precio, copia.fechaLanzamiento);
    }

    /**
     * Mostrar discos que coincidan con el a�o solicitado.
     *
     * @return
     */
    public static void mostrarDiscosPorAnio(int anio, DiscoMusical[] arrayDiscos, int cantidadDiscosIntroducidos) {
        for (int n = 0; n < cantidadDiscosIntroducidos; n++) {
            if (arrayDiscos[n].fechaLanzamiento.getYear() == anio) {
                System.out.println(arrayDiscos[n]);
            }
        }
    }

    /**
     * Mostrar discos con mayor y menor n�mero de canciones. As� como la
     * cantidad media de canciones almacenadas en el array.
     *
     * @return
     */
    public static void cantidadCanciones(DiscoMusical[] arrayDiscos, int cantidadDiscosIntroducidos) {
        double cantidadMediaCanciones = 0;
        //Creamos una copia y la ordenamos.
        DiscoMusical[] copia = new DiscoMusical[cantidadDiscosIntroducidos];
        for (int n = 0; n < cantidadDiscosIntroducidos; n++) {
            if (arrayDiscos[n] != null) {
                copia[n] = new DiscoMusical(arrayDiscos[n]);
            }
        }
        //Ordenamos de menor a mayor.
        for (int n = 0; n < copia.length; n++) {
            for (int j = n; j < copia.length; j++) {
                if (copia[n].numCanciones > copia[j].numCanciones) {
                    DiscoMusical aux = copia[n];
                    copia[n] = copia[j];
                    copia[j] = aux;
                }
            }
        }
        //Recorremos el array para conocer la cantidad media de canciones.
        for (int n = 0; n < copia.length; n++) {
            cantidadMediaCanciones += copia[n].numCanciones;
        }
        cantidadMediaCanciones = cantidadMediaCanciones / cantidadDiscosIntroducidos;
        System.out.printf("EL DISCO CON MENOR N�MERO DE CANCIONES ES: %s%n", copia[0]);
        System.out.printf("EL DISCO CON MAYOR N�MERO DE CANCIONES ES: s%n", copia[cantidadDiscosIntroducidos - 1]);
        System.out.printf("LA CANTIDAD MEDIA DE CANCIONES ALMACENADAS ES: %.2f%n", (cantidadMediaCanciones));

    }

    /**
     * Mostrar disco m�s barato y m�s caro.
     *
     * @return
     */
    public static void discoMasBaratoYmasCaro(DiscoMusical[] arrayDiscos) {
        double discoMasBarato = arrayDiscos[0].precio;
        int posBarato = 0;
        double discoMasCaro = 0;
        int posCaro = 0;
        for (int n = 0; n < arrayDiscos.length && arrayDiscos[n] != null; n++) {
            if (arrayDiscos[n].precio > discoMasCaro) {
                discoMasCaro = arrayDiscos[n].precio;
                posCaro = n;
            }
            if (n > 0 && arrayDiscos[n].precio < discoMasBarato) {
                discoMasBarato = arrayDiscos[n].precio;
                posBarato = n;
            }
        }
        System.out.printf("El disco m�s caro es %s%n", arrayDiscos[posCaro]);
        System.out.printf("El disco m�s barato es %s%n", arrayDiscos[posBarato]);
    }

    /**
     * Un m�todo que permita conocer si son m�s caros los discos que est�n en
     * las posiciones pares del array o los que est�n en las posiciones impares.
     *
     * @return
     */
    public static void posicionesParesImparesPrecio(DiscoMusical[] arrayDiscos) {
        //Contamos el n�mero de discos almacenadas.
        int cantidadDiscosAlmacenados = 0;
        for (int n = 0; n < arrayDiscos.length && arrayDiscos[n] != null; n++) {
            cantidadDiscosAlmacenados++;
        }

        double precioPosPar = 0;
        double precioPosImpar = 0;
        int contadorPosPar = 0;
        int contadorPosImpar = 0;
        for (int n = 0; n < arrayDiscos.length && arrayDiscos[n] != null; n++) {
            if (n % 2 == 0) {
                precioPosPar = arrayDiscos[n].precio;
            } else if (n % 2 == 1) {
                precioPosImpar = arrayDiscos[n].precio;
            }
        }
        if (precioPosPar > 0 && precioPosImpar > 0) {
            if (precioPosPar > precioPosImpar) {
                contadorPosPar++;
            } else {
                contadorPosImpar++;
            }
        }

        System.out.printf(String.format("LOS DISCOS M�S CAROS SE ENCUENTRAN EN LAS POSICIONES %s%n",
                contadorPosPar > contadorPosImpar ? "PARES" : "IMPARES"));

    }

    public String toString() {
        return String.format("TITULO: %s,GRUPO MUSICAL: %S, N�MERO DE CANCIONES: %S,PRECIO: %.2f, FECHA LANZAMIENTO: %s",
                this.titulo,
                this.grupoMusical,
                this.numCanciones,
                this.precio,
                this.fechaLanzamiento.format(formatoFecha).toUpperCase()
        );
    }

    //Entrada programa
    public static void main(String[] args) {
        int cantidadDiscosIntroducidos = 0;
        String[] titulos = {
            "Sombras en la Ciudad",
            "Lluvia de Estrellas",
            "Sue�os Perdidos",
            "Amanecer Eterno",
            "Cuando la miraba"
        };
        String[] grupoMusical = {"Ecos del Crep�sculo",
            "Revoluci�n Mel�dica",
            "V�rtice Sonoro",
            "Luz Lunar",
            "Pro la noche"
        };
        int[] numCanciones = {8, 7, 6, 5,12};
        double[] precio = {5.5, 69, 78, 25,85.90};
        String[] fechas = {"2003-01-01", "2014-02-01", "2003-03-01", "1980-04-01","1999-06-06"};

        DiscoMusical[] arrayDisco = new DiscoMusical[50];

        //CREAR DISCOS Y ALMACENARLOS EN EL ARRAY
        for (int n = 0; n < grupoMusical.length; n++) {
            LocalDate parsearFecha = LocalDate.parse(fechas[n]);
            arrayDisco[n] = new DiscoMusical(titulos[n], grupoMusical[n], numCanciones[n], precio[n], parsearFecha);
            cantidadDiscosIntroducidos++;
        }
        /**
         * ***********************************************************************************
         * SOLICITAMOS EL NOMBRE / LOS NOMBRES DE LOS DISCOS QUE COINCIDAN CON
         * UN A�O DETERMINADO
         * *************************************************************************************
         */
        System.out.println("");
        System.out.println("MOSTRAR LOS DISCOS QUE COINCIDAN CON UNA DETERMINADA FECHA");
        System.out.println("**********************************************************");
        DiscoMusical.mostrarDiscosPorAnio(2003, arrayDisco, cantidadDiscosIntroducidos);

        /**
         * ***********************************************************************************
         * UN M�TODO QUE MUESTRE LOS DISCOS CON MAYOR Y MENOR N�MERO DE
         * CANCIONES, AS� COMO LA CANTIDAD MEDIA DE CANCIONES SEG�N LOS DISCOS
         * ALMACENADOS EN EL ARRAY.
         * *************************************************************************************
         */
        System.out.println("");
        System.out.println("MOSTRAR LOS DISCOS CON MAYOR Y MENOR N�MERO DE CANCIONES");
        System.out.println("**********************************************************");
        DiscoMusical.cantidadCanciones(arrayDisco, cantidadDiscosIntroducidos);

        /**
         * ************************************************************************************
         * UN M�TODO QUE MUESTRE EL DISCO M�S BARATO Y M�S CARO.
         * ************************************************************************************
         */
        System.out.println("");
        System.out.println("MOSTRAR LOS DISCOS M�S BARATO Y M�S CARO");
        System.out.println("**********************************************************");
        discoMasBaratoYmasCaro(arrayDisco);
        /**
         * ************************************************************************************
         * UN M�TODO QUE PERMITA CONOCER SI SON M�S CAROS LOS DISCOS QUE EST�N
         * EN LAS POSCIONES PARES DEL ARRAY O LOS QUE EST�N EN LAS POSICIONES
         * IMPARES.
         * ************************************************************************************
         */
        System.out.println("");
        System.out.println("MOSTRAR SI SON MAS CAROS LOS DISCOS QUE SE ENCUENTRAN EN POSICIONES PARES O LOS QUE SE EN ENCUENTRAN EN POSICIONES IMPARES");
        System.out.println("**************************************************************************************************************************");
        posicionesParesImparesPrecio(arrayDisco);
    }//Fin m�todo
}//Fin clase

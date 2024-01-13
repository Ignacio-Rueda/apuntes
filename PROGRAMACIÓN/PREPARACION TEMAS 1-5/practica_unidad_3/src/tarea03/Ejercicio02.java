package tarea03;

import libtarea3.Dado;

/**
 * Ejercicio 2: Uso de la clase Dado
 *
 * @author Profe
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        //Constantes
        // Variables de entrada (dados y puntuación máxima)
        // Variables de salida
        // Variables auxiliares
        int numAleatorioPuntos = 0;
        int puntuacionJugador1 = 0;
        int puntuacionJugador2 = 0;
        int puntuacionJugador3 = 0;
        int posGanador = 0;
        int ultimaPuntuacion = 0;
        String participantes = "DADO1   DADO2   DADO3";
        long sumaPuntuacionesObtenidas = 0;
        String resultadoLanzamientos = "";

        // Clase Scanner para petición de datos de entrada (no es necesario)
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        //En realidad no hay entrada de datos como tal, pero podemos considerar
        //el número máximo como información de entrada ya que variará el
        //comportamiento del programa.
        //1. Cálculo del número aleatorio de puntos (entre 30 y 60)
        numAleatorioPuntos = 30 + (int) (Math.random() * 31);

        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------  
        //2. Creación de 3 dados (jugadores) de 6 caras
        Dado jugador1 = new Dado();
        Dado jugador2 = new Dado();
        Dado jugador3 = new Dado();
        Dado ganador;
        //3. Lanzamiento de los dados y acumulación de las puntuaciones
        //3.1 Lanzamos cada uno de los dados y mostramos las puntuaciones
        //Utilizamos los métodos de la clase para contar los lanzamientos
        while (sumaPuntuacionesObtenidas < numAleatorioPuntos) {
            puntuacionJugador1 = jugador1.lanzar();
            puntuacionJugador2 = jugador2.lanzar();
            puntuacionJugador3 = jugador3.lanzar();
                    
            resultadoLanzamientos += String.format("Lanzamiento nº %d%3s%d%7s%d%7s%d%n",
                    jugador1.getNumeroLanzamientos(),
                    "",
                    puntuacionJugador1,
                    "",
                    puntuacionJugador2,
                    "",
                    puntuacionJugador3
            );
            //3.2 Utilizando los métodos de la clase, acumulamos las puntuaciones
            //de todos los dados en todos los lanzamientos.
            sumaPuntuacionesObtenidas = jugador1.getSumaPuntuacionHistorica() + jugador2.getSumaPuntuacionHistorica() + jugador3.getSumaPuntuacionHistorica();
        }

        //4. Comprobación de cuál de los dados ha sido el ganador y consulta de
        //todas sus tiradas
        if(puntuacionJugador1 > puntuacionJugador2 && puntuacionJugador1 > puntuacionJugador3){
            ganador = jugador1;
            posGanador = 1;
            ultimaPuntuacion = puntuacionJugador1;
        }else if(puntuacionJugador2 > puntuacionJugador3){
            ganador = jugador2;
            posGanador = 2;
            ultimaPuntuacion = puntuacionJugador2;
        }else{
            ganador = jugador3;
            posGanador = 3;
            ultimaPuntuacion = puntuacionJugador3;
        }
        
        System.out.println(jugador1.getSerieHistoricaLanzamientos());
        //----------------------------------------------
        //      Salida de resultados
        //----------------------------------------------
        System.out.println("LANZAMIENTO DE DADOS");
        System.out.println("----------------------------------------");
        System.out.printf("Número máximo de puntos: %d%n", numAleatorioPuntos);
        System.out.printf("%38s%n", participantes);
        System.out.printf("%s%n%n",resultadoLanzamientos);

        System.out.printf("Juego Terminado. La suma de los lanzamientos es: %d.%n",jugador1.getSumaPuntuacionHistorica()+jugador2.getSumaPuntuacionHistorica()+jugador3.getSumaPuntuacionHistorica());
        System.out.printf("El ganador es el dado %d con %d puntos en la última jugada.%n",posGanador,ultimaPuntuacion);
        System.out.printf("El valor %d ha salido %d veces en todo el juego y se han realizado un total de %d lanzamientos.%n",ultimaPuntuacion,Dado.getNumeroVecesCaraGlobal(ultimaPuntuacion),Dado.getNumeroLanzamientosGlobal());
        System.out.printf("Todos los lanzamientos del dado %d: %s.%n",posGanador,ganador.getSerieHistoricaLanzamientos());
    }
}

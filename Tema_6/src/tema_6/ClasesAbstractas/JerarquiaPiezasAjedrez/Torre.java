package tema_6.ClasesAbstractas.JerarquiaPiezasAjedrez;

public class Torre extends PiezaAjedrez {

    public Torre(String color, int fila, int columna) {
        super(color, fila, columna);
    }

    @Override
    public boolean esMovible(int fila, int columna) {
        boolean resultado = true;
        //Puede desplazarse un número indeterminada de casillas, en VERTICAL u HORIZONTAL.
        //-Puede desplazarse en a cualquier casilla en horizontal y a cualquier casilla en vertical pero no a la vez.

        //Tiene que efectuarse algún movimiento(no puede quedarse en el mismo sitio).
        //No puede salirse del tablero, no puede salirse de las coordenadas (1,1)(8,8)
        /**
         * Debe darse la combinación: a) La fila sea mayor a 0 e inferior a 9 y
         * la columna 0. b) La columna sea mayor a 0 e inferior a 9 y la fila 0.
         */
        String msgErr = null;
        if ((fila > 0 && fila < 9) && (columna == 0)) {
            if (!(this.fila + fila > 0 && this.fila < 9)) {
                resultado = false;
            }

        } else if ((columna > 0 && columna < 9) && (fila == 0)) {
            if (!(this.columna + columna > 0 && this.columna < 9)) {
                resultado = false;
            }
        }

        return resultado;
    }

    @Override
    public void mover(int fila, int columna) throws IllegalArgumentException {
        if (!this.esMovible(fila, columna)) {
            throw new IllegalArgumentException(String.format("Movimiento no permitido (%d%d)->(%d%d)",
                    this.getFila(), this.getColumna(),
                    fila, columna
            ));
        } else {
            this.fila = fila;
            this.columna = columna;
        }

    }
}

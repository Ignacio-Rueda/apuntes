package tema_6.ClasesAbstractas.JerarquiaPiezasAjedrez;

public abstract class PiezaAjedrez {

    //Atributos.
    private final String color;//Privado porque una vez que lo asignes ya no va a cambiar.
    protected int fila;
    protected int columna;

    public static final int NUM_MINIMO = 1;
    public static final int NUM_MAX = 8;

    public PiezaAjedrez(String color, int fila, int columna) throws IllegalArgumentException {
        String msgError = null;
        //Controlar los parámetros de entrada y de ser válidos se realiza la asignación.
        if (!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro")) {
            msgError = String.format("Error: color no válido: %s", color);
        } else if (fila < PiezaAjedrez.NUM_MINIMO || fila > PiezaAjedrez.NUM_MAX) {
            msgError = String.format("Error: número fila inválido %s", fila);
        } else if (columna < PiezaAjedrez.NUM_MINIMO || columna > PiezaAjedrez.NUM_MAX) {
            msgError = String.format("Error: número columna inválido %s", columna);
        } 
        if(msgError!=null){
            throw new IllegalArgumentException(msgError);
        }else{
            this.color = color;
            this.columna = columna;
            this.fila = fila;
        }

    }//Final constructor.
    
    public String getColor(){
        return this.color;
    }
    public int getFila(){
        return this.fila;
    }
    public int getColumna(){
        return this.columna;
    }
    
    
    //MÉTODOS ABSTRACTOS -> Cada pieza tiene sus propios movimientos.
    public abstract boolean esMovible(int fila, int columna);

    public abstract void mover(int fila, int columna) throws IllegalArgumentException;

}//Final clase

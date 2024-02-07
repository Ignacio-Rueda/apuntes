package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

public class Vino {

    private int codigo;
    private String denominacion;
    private double grados;
    private String origen;
    private static int numVinos;

    public Vino(int codigo, String denominacion, double grados, String origen) throws IllegalArgumentException {
        if (grados < 0) {
            throw new IllegalArgumentException(String.format("Lo siento, los grados no pueden ser %.2f", grados));
        }
        if (codigo < 0) {
            throw new IllegalArgumentException(String.format("Lo siento, el código no puede ser %d", codigo));
        }
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.grados = grados;
        this.origen = origen;
        Vino.numVinos++;
    }

    //No lanzamos excepciones porque los valores son correctos.
    public Vino() {
        this(1, "Vino Peleón", 25, "Jumilla");

    }

    public boolean isRiojaFuerte() {
        return this.origen.equals("Rioja") && this.grados >= 17 ? true : false;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDenominacio() {
        return this.denominacion;
    }

    public double getGrados() {
        return this.grados;
    }

    public String getOrigen() {
        return this.origen;
    }
    public static int getNumVinosCreados(){
        return Vino.numVinos;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    @Override
    public String toString(){
        return String.format("Código=%d Denominación=%s Grados=%.2f Origen=%s", 
                this.codigo,
                this.denominacion,
                this.grados,
                this.origen);
    }
    public static void main(String[] args) {
        /**
         * Crear un vino con el constructor por defecto y mostrar sus datos
         * usando toString(). ? Crear un vino con el constructor con parámetros,
         * tipo Rioja y graduación 19. Tras eso, usando el método
         * isRiojaFuerte() escribir si es o no fuerte el vino recién creado. ?
         * Modificar la graduación del vino anterior a 15. Mostrar sus datos y
         * volver a mostrar si es un vino o no fuerte usando el método
         * isRiojaFuerte(). ? Intentar crear un vino con parámetros incorrectos,
         * por ejemplo el número de grados con valor -7, de modo que se genere
         * una excepción, que capturaremos con la estructura trycatch. ?
         * Escribir el total de vinos empleando el get correspondiente del
         * atributo que usamos para llevar la cuenta de los vinos que se van
         * creando.
         */
        
        Vino miVino = new Vino();
        System.out.println("Crear vino 1 con el constructor por defecto:");
        System.out.println(miVino);
        System.out.println("Crear vino 2 con el constructor con parámetros:");
        Vino miVino2 = new Vino(2,"Conmorcillo Rioja Reserva",19,"Rioja");
        System.out.println(miVino2);
        String resultado = "";
        if(miVino2.isRiojaFuerte()){
            resultado = "Es"+miVino2.getOrigen()+" Fuerte";
        }else{
        resultado = "Es "+miVino2.getOrigen()+" débil";
        }
        System.out.println(resultado);
        try{
            Vino miVino3 = new Vino(3,"Romero",-7, "Alcalaíno");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Se han creado "+Vino.getNumVinosCreados()+"vinos");
    }

}

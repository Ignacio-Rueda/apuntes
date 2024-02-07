package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * @author Ignacio Rueda
 */
public class Estudiante {

    private String nombre;
    private double notaMedia;
    private int numNotas;

    public Estudiante(String nombre, double notaMedia, int numNotas) throws IllegalArgumentException {
        if (notaMedia < 0 || numNotas < 0) {
            throw new IllegalArgumentException("Datos iniciales erróneos");
        }
        this.nombre = nombre;
        this.notaMedia = notaMedia;
        this.numNotas = numNotas;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getNotaMedia(){
        return this.notaMedia;
    }
    public int getNumNotas(){
        return this.numNotas;
    }
    public boolean actualizarNotaMeida(double nuevaNota) {
        boolean resultado = false;
        if (nuevaNota >= 0) {
            this.notaMedia += nuevaNota;
            this.numNotas++;
            this.notaMedia = this.notaMedia/this.numNotas;
            resultado = true;
        }
        return resultado;
    }

    public char calificacionMedia() {
        char nota = 'F';
        if (this.notaMedia >= 9) {
            nota = 'A';
        } else if (this.notaMedia >= 8) {
            nota = 'B';
        } else if (this.notaMedia >= 7) {
            nota = 'C';
        } else if (this.notaMedia >= 6) {
            nota = 'D';
        } else if (this.notaMedia >= 5) {
            nota = 'E';
        }
        return nota;
    }

    public String toString() {
        return String.format("Estudiante: %s, nota media: %.2f,número de notas: %d",
                this.nombre,
                this.notaMedia,
                this.numNotas
        );
    }

    public static void main(String[] args) {
        System.out.println("Intento crear un estudiante de nombre Ricardo");
        try {
            Estudiante estudiante = new Estudiante("Ricardo", -5, -5);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.printf("%nVamos a crear dos objetos estudiante %nMostramos la información de los dos objetos estudiante%n%n");
        Estudiante estudiante2 = new Estudiante("Antonio Bernal Campillo",0.0,0);
        Estudiante estudiante3 = new Estudiante("Francisco Cucharas Gómez",2.0,1);
        
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        
        System.out.printf("%nActualizamos la nota media de Antonio con una nueva nota de 7.7%n");
        estudiante2.actualizarNotaMeida(7.7);
        System.out.println(estudiante2);
        
        System.out.printf("%nActualizamos la nota media de Francisco con una nueva nota de 7.5%n");
        estudiante3.actualizarNotaMeida(7.5);
        System.out.println(estudiante3);
        
        
        System.out.printf("%nMostramos la calificación media de Antonio%n");
        System.out.printf("La calificación media de: %s es %c%n",estudiante2.getNombre(),estudiante2.calificacionMedia());
    }
}

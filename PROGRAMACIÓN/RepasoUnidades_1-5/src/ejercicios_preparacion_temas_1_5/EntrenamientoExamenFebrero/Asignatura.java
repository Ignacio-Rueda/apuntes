package ejercicios_preparacion_temas_1_5.EntrenamientoExamenFebrero;

/**
 *
 * Desarrollar una clase llamada "Asignatura" con atributos para almacenar el
 * nombre de la asignatura y el número de horas semanales. Incluir un atributo
 * de tipo array de instancias de la clase "Estudiante" para almacenar los
 * estudiantes matriculados en la asignatura. Para los estudiantes almacena su
 * nombre, sus apellidos y un código identificador del tipo E0001, E0002?
 * (ejemplo: E0025 - Ana García Sánchez)
 *
 * La clase Estudiante tendrá un constructor sin parámetros que permitirá crear
 * un nuevo estudiante asignándole de forma automática una combinación aleatoria
 * de nombre y apellidos generados a partir de un array de 10 nombres comunes
 * (Ana, Antonio, María, Javier, Marta, Carlos?) y 20 apellidos comunes (García,
 * Rodríguez, González, Fernández, López, Martínez, Sánchez, Pérez...). Su
 * código identificador se generará de forma secuencial según los estudiantes
 * creados hasta ese momento.
 *
 * Incluir métodos para establecer y obtener el nombre y el número de horas de
 * la asignatura, así como para añadir, eliminar y mostrar los estudiantes
 * matriculados en la asignatura.
 *
 * Por último, crea un programa principal (main) que permita probar las
 * funcionalidades desarrolladas.
 */
public class Asignatura {

    static String nombreAsignatura;
    static int numeroHorasSemanales;
    static Estudiante[] arrayEstudiante = new Estudiante[10];
    static int contadorEstudiantes = 0;

    public static void setNombreAsignatura(String nombreAsignatura) {
        Asignatura.nombreAsignatura = nombreAsignatura;
    }

    public static String getNombreAsignatura() {
        return Asignatura.nombreAsignatura;
    }

    public static void setNumeroHorasSemanales(int numeroHorasSemanales) {
        Asignatura.numeroHorasSemanales = numeroHorasSemanales;
    }

    public static int getNumerHorasSemanales() {
        return Asignatura.numeroHorasSemanales;
    }

    //Añadir estudiantes.
    public static void addEstudiante(Estudiante estudiante) {
        Asignatura.arrayEstudiante[contadorEstudiantes] = estudiante;
        Asignatura.contadorEstudiantes++;
    }

    //Eliminar estudiantes.
    public static void deleteEstudiante(String codigo) {
        //Buscamos el estudiante por el código identficador y lo eliminamos.
        for (int n = 0; n < Asignatura.arrayEstudiante.length; n++) {
            if (Asignatura.arrayEstudiante[n].codigoIdentificador.equals(codigo)) {
                Asignatura.arrayEstudiante[n] = null;
            }
        }
        Asignatura.contadorEstudiantes--;
        Asignatura.ordenarEstudiantes();
    }

    /**
     * Método para desplazar la posición nula al final.
     */
    public static void ordenarEstudiantes() {
        for (int n = 0; n < Asignatura.arrayEstudiante.length; n++) {
            for (int i = n; i < Asignatura.arrayEstudiante.length; i++) {
                if (Asignatura.arrayEstudiante[n] == null) {
                    Estudiante aux = Asignatura.arrayEstudiante[n];
                    Asignatura.arrayEstudiante[n] = Asignatura.arrayEstudiante[i];
                    Asignatura.arrayEstudiante[i] = aux;
                }
            }

        }
    }

    //Mostrar estudiantes.
    public static void mostrarEstudiantes() {
        for (int n = 0; n < Asignatura.arrayEstudiante.length; n++) {
            System.out.println(arrayEstudiante[n]);
        }
    }

    public static void main(String[] args) {

        //Rellenar array con estudiantes.
        for (int n = 0; n < 10; n++) {
            Asignatura.addEstudiante(new Estudiante());
        }

        //Mostramos los estudiantes creados:
        System.out.println("MOSTRAR ESTUDIANTES");
        System.out.println("*******************");
        Asignatura.mostrarEstudiantes();

        //Eliminamos un estudiante.
        System.out.println("");
        System.out.println("ELIMINAMOS UN ESTUDIANTE");
        System.out.println("************************");
        Asignatura.deleteEstudiante("E-0004");

        //Mostramos de nuevo los estudiantes.
        System.out.println("MOSTRAR ESTUDIANTES");
        System.out.println("*******************");
        Asignatura.mostrarEstudiantes();

        //Añadimos un estudiante.
        System.out.println("AÑADIR UN ESTUDIANTE");
        System.out.println("*******************");
        Asignatura.addEstudiante(new Estudiante());

        //Mostramos de nuevo los estudiantes.
        System.out.println("MOSTRAR ESTUDIANTES");
        System.out.println("*******************");
        Asignatura.mostrarEstudiantes();

    }

}

class Estudiante {

    final int DIGITOS_NUMERICOS = 4;//Cantidad de digitos numéricos del código.
    String nombre;
    String apellidos;
    String codigoIdentificador;
    String[] arrayNombresComunes = {"Ana", "Antonio", "María", "Javier", "Marta", "Carlos", "Nacho", "Ramón", "Raúl", "Pepe"};
    String[] arrayApellidosComunes = {"García", "Rodríguez", "González", "Fernández", "López", "Martínez", "Sánchez", "Pérez", "Rueda", "Delgado"};
    static int contadorIdentificador = 0;

    int pos;//Posición aleatoria

    public Estudiante() {
        pos = (int) (Math.random() * arrayNombresComunes.length);
        this.nombre = arrayNombresComunes[pos];
        pos = (int) (Math.random() * arrayNombresComunes.length);
        this.apellidos = arrayApellidosComunes[pos];
        Estudiante.contadorIdentificador++;
        codigoIdentificador = Integer.toString(contadorIdentificador);
        //Ahora contamos cantidad de caracteres y asignamos 0
        int cantidadDitigos = codigoIdentificador.length();
        StringBuilder construirCodigo = new StringBuilder("E-0000");
        this.codigoIdentificador = construirCodigo.replace(construirCodigo.length() - cantidadDitigos, construirCodigo.length(), String.valueOf(Estudiante.contadorIdentificador)).toString();
    }

    public String toString() {
        return String.format("NOMBRE: %s APELLIDOS %S CÓDIGO IDENTIFICADOR %S",
                this.nombre,
                this.apellidos,
                this.codigoIdentificador
        );
    }

}

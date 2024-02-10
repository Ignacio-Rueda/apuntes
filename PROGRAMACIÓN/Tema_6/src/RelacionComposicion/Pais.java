/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelacionComposicion;

/**
 *
 * @author Ignacio Rueda
 */
public class Pais {

    private String nombre;
    private Comunidades[] comunidades;

    public Pais() {
    }

    public Pais(String nombre, Comunidades[] comunidades) {
        this.nombre = nombre;
        this.comunidades = new Comunidades[comunidades.length];

        for (int n = 0; n < comunidades.length; n++) {
            this.comunidades[n] = new Comunidades (comunidades[n].getNombreComunidad(),comunidades[n].getNombreProvincias());//Evitamos la modificación
        }
    }

    public String getNombrePais() {
        return this.nombre;
    }

    public String getComunidadesPais() {
        StringBuilder nombreComunidades = new StringBuilder();
        for (int n = 0; n < this.comunidades.length; n++) {
            nombreComunidades.append(String.format("%s%n", this.comunidades[n].getNombreComunidad()));
        }
        //
        nombreComunidades.insert(0, String.format("%s tiene: %d comunidades.%n", this.nombre, this.comunidades.length));
        return nombreComunidades.toString();
    }

    public String[] getProvinciasComunidad(String nombreComunidad) throws IllegalArgumentException {
        boolean nombreCorrecto = false;
        int pos = 0;//Posición que ocupa en el array la comunidad.
        //Recorrer todos los nombres de las comunidades para ver si coincide
        for (int n = 0; n < this.comunidades.length; n++) {
            if (this.comunidades[n].getNombreComunidad().equalsIgnoreCase(nombreComunidad)) {
                nombreCorrecto = true;
                pos = n;
            }
        }
        if (!nombreCorrecto) {
            throw new IllegalArgumentException("Nombre comunidad erróneo");
        }
        
        return this.comunidades[pos].getNombreProvincias();
    }

}

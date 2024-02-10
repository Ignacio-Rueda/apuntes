/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelacionComposicion;

/**
 *
 * @author Ignacio Rueda
 */
public class Comunidades {
    private String nombre;
    private String [] provincias;
    
    public Comunidades(){
    }
    public Comunidades(String nombre,String[]provincias){
        this.nombre = nombre;
        this.provincias = new String[provincias.length];
        
        for(int n=0;n<provincias.length;n++){
            this.provincias[n] = provincias[n];
        }
    }
    
    public String getNombreComunidad(){
        return this.nombre;
    }
    
    public int getNumProvincias(){
        return this.provincias.length;
    }
    
    public String[] getNombreProvincias(){
        return this.provincias;
    }
    
}

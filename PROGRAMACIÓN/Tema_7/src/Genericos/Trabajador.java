package Genericos;

import java.util.List;

public class Trabajador implements Comparable<Trabajador> {

    private int edad;
    private double sueldo;
    private String nombre;

    public Trabajador(String nombre, double sueldo, int edad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public int compareTo(Trabajador otro) {
        return Double.compare(this.sueldo, otro.sueldo);
    }
    @Override
    public String toString(){
        return String.format("Nombre: %s Edad: %d Sueldo: %.2f",
                this.nombre,
                this.edad,
                this.sueldo
        );
    }

    public static Trabajador getMayorSueldo(List<Trabajador> a) {
        if (a.size() == 0 || a == null) {
            return null;
        }
        Trabajador empleado = a.get(0);
        for(int i=1;i<a.size();i++){
            if(empleado.compareTo(a.get(i))<0){
                empleado = a.get(i);
            }
        }
        return empleado;

    }

}

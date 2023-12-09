/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motores;

/**
 *
 * @author Ignacio Rueda
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo(new MotorDiesel());
        System.out.println(miVehiculo.getRevolucionesMotor());
        System.out.println(miVehiculo.getTipoCombustible());
        
    }
    
}

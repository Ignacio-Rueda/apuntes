/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motores;

/**
 *
 * @author Ignacio Rueda
 */
public class Vehiculo {
    TiposMotores tpMotor;
    
    public Vehiculo(TiposMotores tpMotor){
       this.tpMotor = tpMotor;
    }
    public int getRevolucionesMotor(){
        return this.tpMotor.getRevoluciones();
    }
    public String getTipoCombustible(){
        return this.tpMotor.getTipoCombustible();
    }
}

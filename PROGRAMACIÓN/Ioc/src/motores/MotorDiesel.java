/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motores;

/**
 *
 * @author Ignacio Rueda
 */
public class MotorDiesel implements TiposMotores {

    @Override
    public int getRevoluciones() {
        return 125;
    }

    @Override
    public String getTipoCombustible() {
        return "Diesel";
    }

 
}

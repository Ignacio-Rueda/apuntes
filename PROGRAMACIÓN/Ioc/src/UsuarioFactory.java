/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ignacio Rueda
 */
public class UsuarioFactory {
    Iusuario iusuario;
    public UsuarioFactory(Iusuario iusuario){
        this.iusuario = iusuario;
    }
    public void insertarUsuario(){
        this.iusuario.insertarUsuario();
    }
    public void eliminarUsuariobyId(int id){
        this.iusuario.eliminarUsuariobyId(id);
    }
}

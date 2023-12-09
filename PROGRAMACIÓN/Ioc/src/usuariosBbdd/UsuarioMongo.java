package usuariosBbdd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ignacio Rueda
 */
public class UsuarioMongo implements Iusuario {

    @Override
    public void insertarUsuario() {
        System.out.println("Insertar usuario en Mongo");
    }

    @Override
    public void eliminarUsuariobyId(int id) {
        System.out.println("Eliminar usuario en Mongo con id "+id);    
    }
    
}

package usuariosBbdd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ignacio Rueda
 */
public class App {

    public static void main(String[] args) {
        UsuarioFactory usuario = new UsuarioFactory(new UsuarioOracle());
        
        usuario.insertarUsuario();
        usuario.eliminarUsuariobyId(5);
    }
    
}

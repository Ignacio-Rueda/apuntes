
/**
 *
 * @author Ignacio Rueda
 */
public class UsuarioOracle implements Iusuario {

    @Override
    public void insertarUsuario() {
        System.out.println("Insertando usuario Oracle");
    }

    @Override
    public void eliminarUsuariobyId(int id) {
        System.out.println("Eliminando usuario en Oracle con id "+id);
    }
    
}

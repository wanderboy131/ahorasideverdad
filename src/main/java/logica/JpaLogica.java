

package logica;

import bd.JpaPersistencia;
import bd.UsuarioJpaController;



/**
 *
 * @author acer
 */
public class JpaLogica {
    
    JpaPersistencia jpa = new JpaPersistencia();
    public void crearUsuario(String usuario, String contraseña){
        Usuario usuario1 = new Usuario(usuario, contraseña);
        jpa.crearUsuario(usuario1);
    }
    
    public boolean verificarUsuarios(String username, String contraseña){
        return jpa.traerUsuario(username, contraseña);
    }
}

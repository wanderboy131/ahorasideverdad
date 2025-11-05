/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.util.ArrayList;
import java.util.List;
import logica.Usuario;


public class JpaPersistencia {
    
   UsuarioJpaController jpa = new UsuarioJpaController();
   
   public void crearUsuario(Usuario usuario){
       jpa.create(usuario);
   }
    
   public boolean traerUsuario(String username, String contraseña){
       List<Usuario> lista = jpa.findUsuarioEntities();
       for ( Usuario l : lista){
           if ( l.getUsername().equals(username) && l.getContraseña().equals(contraseña)){
               return true;
           }
       }
       return false;
   } 
}

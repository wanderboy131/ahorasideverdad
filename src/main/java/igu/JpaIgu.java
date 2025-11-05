/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igu;

import logica.JpaLogica;

/**
 *
 * @author acer
 */
public class JpaIgu {
    
    JpaLogica jpa = new JpaLogica();
    public void crearUsuario(String usuario, String contraseña){
        jpa.crearUsuario(usuario, contraseña);
    }

    public boolean verificarUsuario(String username, String contraseña){
        return jpa.verificarUsuarios(username, contraseña);
    }
    
}

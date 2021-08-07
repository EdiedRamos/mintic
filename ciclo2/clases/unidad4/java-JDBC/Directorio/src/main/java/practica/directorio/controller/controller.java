/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.directorio.controller;
import practica.directorio.model.dao.dao_users;
import practica.directorio.model.vo.users;
import java.sql.SQLException;
import java.util.ArrayList;
import practica.directorio.model.dao.dao_directory;
import practica.directorio.model.vo.directory;

/**
 *
 * @author ediei
 */
public class controller {
    /*
        en este método hay problemas cuando el usuario a registrar ya está
        registrado
    */
    public boolean registrar_usuario(String user_name, String password) {
        users user = new users(user_name, password);
        try {
            dao_users.registrarUsuario(user);
        } catch(SQLException e) {
            System.out.println("Error en registrar usuario");
            return false;
        }
        return true;
    }
    
    /*
        método para iniciar sesión, primero debe existir el usuario en la BD,
        luego debe coincidir la constraseña.
    */
    public boolean iniciar_sesion(String user_name, String password) {
        users user = new users(user_name, password);
        try {
            return dao_users.buscarUsuario(user);
        } catch(SQLException e) {
            System.out.println("Error en inicio de sesion");
            return false;
        }
    }
    
    /*
        método para listar los contactos de un usuario
    */
    public ArrayList<directory> listar_contactos(String user_name) {
        users user = new users();
        user.setUser_name(user_name);
        ArrayList<directory> res = null;
        try {
            res = dao_directory.listarContactos(user);
        } catch(SQLException e) {
            System.out.println("Error en 'listar_contactos'");
        }
        return res;
    }
    
    /*
        método para agregar un contacto
    */
    public boolean agregar_contacto(String user_name, String name, String cellphone, String email) {
        directory directorio = new directory(user_name, name, cellphone, email);
        try {
            dao_directory.agregarContacto(directorio);
        } catch(SQLException e) {
            System.out.println("Error en agregar el contacto");
            return false;
        }
        return true;
    }
    public boolean eliminar_contacto(String user_name, String name) {
        directory directorio = new directory();
        directorio.setOwner(user_name);
        directorio.setName(name);
        try {
            dao_directory.eliminarContacto(directorio);
        } catch(SQLException e) {
            System.out.println("Error en eliminar el contacto");
            return false;
        }
        return true;
    }
}

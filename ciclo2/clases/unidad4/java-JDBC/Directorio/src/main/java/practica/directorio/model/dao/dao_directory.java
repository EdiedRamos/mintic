/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.directorio.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import practica.directorio.model.vo.directory;
import practica.directorio.model.vo.users;
import static practica.directorio.util.util_connection.get_connection;

/**
 *
 * @author ediei
 */
public class dao_directory {
    public static ArrayList<directory> listarContactos(users usuario) throws SQLException {
        ArrayList<directory> lista_dir = new ArrayList<>();
        String sql = "select * from directory where owner = '" + usuario.getUser_name() + "';";
        String pass = null;
        try (
                Connection cnt = get_connection();
                Statement st = cnt.createStatement();
            ) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista_dir.add(new directory(rs.getString("owner"), rs.getString("name"), rs.getString("cellphone"), rs.getString("email")));
            }
        }
        return lista_dir;
    }
    public static void agregarContacto(directory directorio) throws SQLException {
        /*
            Para registrar un usuario:
            1. No debe estar registrado
        */
        String sql = "insert into directory (owner, name, cellphone, email) values "
                + "('" + directorio.getOwner()+ "', '" + directorio.getName() + "', '" + directorio.getCellphone() + "', '" + directorio.getEmail() + "');";
        try (
                Connection cnt = get_connection();
                Statement st = cnt.createStatement();
            ) {
            st.executeUpdate(sql);
        }
    }
    public static void eliminarContacto(directory directorio) throws SQLException {
        /*
            Para registrar un usuario:
            1. No debe estar registrado
        */
        String sql = "delete from directory where owner = '" + directorio.getOwner() + "' and name = '" + directorio.getName() +"';";
        try (
                Connection cnt = get_connection();
                Statement st = cnt.createStatement();
            ) {
            st.executeUpdate(sql);
        }
    }
}

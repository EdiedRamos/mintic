/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.directorio.model.dao;

import java.sql.*;
import practica.directorio.model.vo.users;
import static practica.directorio.util.util_connection.get_connection;

/**
 *
 * @author ediei
 */


public class dao_users {
    public static void registrarUsuario(users usuario) throws SQLException {
        /*
            Para registrar un usuario:
            1. No debe estar registrado
        */
        String sql = "insert into users (user_name, password) values ('"+ usuario.getUser_name() +"','" + usuario.getPassword() + "');";
        try (
                Connection cnt = get_connection();
                Statement st = cnt.createStatement();
            ) {
            st.executeUpdate(sql);
        }
    }
    public static boolean buscarUsuario(users usuario) throws SQLException {
        String sql = "select * from users where user_name = '" + usuario.getUser_name() + "';";
        String pass = null;
        try (
                Connection cnt = get_connection();
                Statement st = cnt.createStatement();
            ) {
            ResultSet rs = st.executeQuery(sql);
            if (rs == null) {
                return false;
            } else {
                pass = rs.getString("password");
                return usuario.getPassword().equals(pass);
            }
        }
    }
}

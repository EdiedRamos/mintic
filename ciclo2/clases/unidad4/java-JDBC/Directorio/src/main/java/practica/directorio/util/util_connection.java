/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.directorio.util;

import java.sql.*;

/**
 *
 * @author ediei
 */
public class util_connection {
    public static Connection get_connection() {
        Connection cnt = null;
        try {
            cnt = DriverManager.getConnection("jdbc:sqlite:data_base.db");
        } catch(SQLException e) {
            System.err.println(e);
        }
        return cnt;
    }
}

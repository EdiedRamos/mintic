/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.borrar.java_jdbc;

/**
 *
 * @author ediei
 */

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        
        try {
            
            // crear la conexión
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/aprendiendo", "root", "");
            
            // crear objeto statement
            
            Statement sentencia = conexion.createStatement();
            
            // Ejecutar sql
            
            ResultSet respuesta = sentencia.executeQuery("SELECT DISTINCT POBLACIÓN FROM CLIENTES");
            
            while (respuesta.next()) {
                System.out.println("Empresa -> " + respuesta.getString("POBLACIÓN"));
            }
            
        } catch(Exception e) {
            System.err.println(e);
        }
        
    }
}

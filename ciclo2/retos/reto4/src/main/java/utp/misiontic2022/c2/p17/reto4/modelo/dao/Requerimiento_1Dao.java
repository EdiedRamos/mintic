package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> lista = new ArrayList<>();
        String sql = "select l.Nombre || ' ' || l.Primer_Apellido as Lider, l.Cargo, count(l.ID_Lider) as [# Proyectos] from Proyecto as p, Lider as l where p.ID_Lider = l.ID_Lider and p.Constructora = 'Pegaso' group by l.ID_Lider order by l.Cargo, Lider;";
        try (
            Connection con = JDBCUtilities.getConnection();
            Statement st = con.createStatement();
        ) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new Requerimiento_1(
                    rs.getString("Lider"),
                    rs.getString("Cargo"),
                    rs.getInt("# Proyectos")
                ));
            }
        }
        return lista;
    }
}
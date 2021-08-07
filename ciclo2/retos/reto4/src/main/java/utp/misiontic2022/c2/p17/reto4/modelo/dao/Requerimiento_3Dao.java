package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> lista = new ArrayList<>();
        String sql = "select p.ID_Proyecto, p.Ciudad, p.Clasificacion, sum(c.Cantidad * mc.Precio_Unidad) Costo_Proyecto from Proyecto p, Compra c, MaterialConstruccion mc where p.ID_Proyecto = c.ID_Proyecto and c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion and p.Ciudad in ('Sta. Rosa de Cabal', 'Pereira') group by p.ID_Proyecto having Costo_Proyecto > 87000 order by p.Ciudad, p.Clasificacion;";
        try (
            Connection cnt = JDBCUtilities.getConnection();
            Statement st = cnt.createStatement();
        ) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new Requerimiento_3(
                    rs.getInt("ID_Proyecto"),
                    rs.getString("Ciudad"),
                    rs.getString("Clasificacion"),
                    rs.getInt("Costo_Proyecto")
                ));
            }
        }
        return lista;
    }
}
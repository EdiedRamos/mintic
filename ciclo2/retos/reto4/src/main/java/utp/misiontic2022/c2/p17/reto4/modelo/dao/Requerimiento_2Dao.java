package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> lista = new ArrayList<>();
        String sql = "select mc.ID_MaterialConstruccion, mc.Nombre_Material, c.Cantidad, mc.Precio_Unidad, c.Cantidad * mc.Precio_Unidad as Precio_Total from Compra c, MaterialConstruccion mc, Proyecto p where c.ID_Proyecto = p.ID_Proyecto and mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion and (p.ID_Proyecto in (14, 20, 18, 36, 45, 48, 56)) order by p.ID_Proyecto, mc.Precio_Unidad desc;";
        try (
            Connection cnt = JDBCUtilities.getConnection();
            Statement st = cnt.createStatement();
        ) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lista.add(new Requerimiento_2(
                    rs.getInt("ID_MaterialConstruccion"),
                    rs.getString("Nombre_Material"),
                    rs.getInt("Cantidad"),
                    rs.getInt("Precio_Unidad"),
                    rs.getInt("Precio_Total")
                ));
            }
        }
        return lista;
    }
}
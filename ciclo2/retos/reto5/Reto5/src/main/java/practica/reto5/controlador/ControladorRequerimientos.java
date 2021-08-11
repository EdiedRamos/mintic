package practica.reto5.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import practica.reto5.modelo.dao.Requerimiento_1Dao;
import practica.reto5.modelo.dao.Requerimiento_2Dao;
import practica.reto5.modelo.dao.Requerimiento_3Dao;
import practica.reto5.modelo.vo.Requerimiento_1;
import practica.reto5.modelo.vo.Requerimiento_2;
import practica.reto5.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    private Requerimiento_1Dao r1d;
    private Requerimiento_2Dao r2d;
    private Requerimiento_3Dao r3d;
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        r1d = new Requerimiento_1Dao();
        return r1d.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        r2d = new Requerimiento_2Dao();
        return r2d.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        r3d = new Requerimiento_3Dao();
        return r3d.requerimiento3();
    }
}
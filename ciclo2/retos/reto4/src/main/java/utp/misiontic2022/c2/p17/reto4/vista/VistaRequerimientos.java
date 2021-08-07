package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;

import javax.annotation.processing.SupportedSourceVersion;

import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            for (Requerimiento_1 r : controlador.consultarRequerimiento1()) {
                System.out.println(r.getLider() + " " + r.getCargo() + " " + r.getProyectos());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            for (Requerimiento_2 r : controlador.consultarRequerimiento2()) {
                System.out.println(r.get_id_material() + " " + r.get_nombre_material() + " " + r.get_cantidad() + " " + r.get_precio_unidad() + " " + r.get_precio_total());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            for (Requerimiento_3 r : controlador.consultarRequerimiento3()) {
                System.out.println(r.get_id_proyecto() + " " + r.get_ciudad() + " " + r.get_clasificacion() + " " + r.get_costo_proyecto());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

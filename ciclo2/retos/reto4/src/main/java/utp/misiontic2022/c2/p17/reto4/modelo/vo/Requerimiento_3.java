package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_3 {
    private int id_proyecto;
    private String ciudad;
    private String clasificacion;
    private int costo_proyecto;
    
    public Requerimiento_3(int id_proyecto, String ciudad, String clasificacion, int costo_proyecto) {
        this.id_proyecto = id_proyecto;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.costo_proyecto = costo_proyecto;
    }
    
    public int get_id_proyecto() {
        return this.id_proyecto;
    }
    
    public String get_ciudad() {
        return this.ciudad;
    }
    
    public String get_clasificacion() {
        return this.clasificacion;
    }
    
    public int get_costo_proyecto() {
        return this.costo_proyecto;
    }
}

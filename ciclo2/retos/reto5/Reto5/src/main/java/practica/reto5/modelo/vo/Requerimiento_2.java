package practica.reto5.modelo.vo;

public class Requerimiento_2 {
    private int id_material;
    private String nombre_material;
    private int cantidad;
    private int precio_unidad;
    private int precio_total;
    
    public Requerimiento_2(int id_material, String nombre_material, int cantidad, int precio_unidad, int precio_total) {
        this.id_material = id_material;
        this.nombre_material = nombre_material;
        this.cantidad = cantidad;
        this.precio_unidad = precio_unidad;
        this.precio_total = precio_total;
    }
    
    public int get_id_material() {
        return this.id_material;
    }
    
    public String get_nombre_material() {
        return this.nombre_material;
    }
    
    public int get_cantidad() {
        return this.cantidad;
    }
    
    public int get_precio_unidad() {
        return this.precio_unidad;
    }
    
    public int get_precio_total() {
        return this.precio_total;
    }
}

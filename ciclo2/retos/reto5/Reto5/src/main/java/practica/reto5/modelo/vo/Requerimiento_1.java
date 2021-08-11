package practica.reto5.modelo.vo;

public class Requerimiento_1 {
    private String lider;
    private String cargo;
    private int proyectos;
    
    public Requerimiento_1(String lider, String cargo, int proyectos) {
        this.lider = lider;
        this.cargo = cargo;
        this.proyectos = proyectos;
    }
    
    public String getLider() {
        return this.lider;
    }
    
    public String getCargo() {
        return this.cargo;
    }
    
    public int getProyectos() {
        return this.proyectos;
    }
}

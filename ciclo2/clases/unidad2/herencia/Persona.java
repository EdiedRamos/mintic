public class Persona {
    // campos de clase
    private String nombre;
    private Integer edad;
    
    // constructor
    public Persona() {
        setNombre("Pancho");
        setEdad(50);
    }
    
    public Persona(String nombre, Integer edad) {
        setNombre(nombre);
        setEdad(edad);
    }
    
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    // getters
    public String getNombre() {
        return this.nombre;
    }
    public Integer getEdad() {
        return this.edad;
    }
}
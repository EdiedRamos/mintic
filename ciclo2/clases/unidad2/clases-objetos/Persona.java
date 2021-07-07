public class Persona {
    // campos de clase
    private String nombre;
    private String cedula;
    private Integer edad;
    private Integer estatura;
    
    // constructor
    public Persona() {
        setNombre("Pancho");
        setCedula("xxxxxxxxxxx");
        setEdad(50);
        setEstatura(150);
    }
    public Persona(String nombre, String cedula, Integer edad, Integer estatura) {
        setNombre(nombre);
        setCedula(cedula);
        setEdad(edad);
        setEstatura(estatura);
    }
    
    // getters
    public String getNombre() {
        return this.nombre;
    }
    public String getCedula() {
        return this.cedula;
    }
    public Integer getEdad() {
        return this.edad;
    }
    public Integer estatura() {
        return this.estatura;
    }
    
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }
    
    // metodos
    public void saludar() {
        System.out.printf("Hola, mi nombre es %s\n", this.nombre);
    }
}
public class Estudiante extends Persona {
    // campos de clase
    private String nomColegio;
    
    // constructor
    public Estudiante(String nomColegio) {
        setNomColegio(nomColegio);
    }
    
    public Estudiante(String nombre, Integer edad, String nomColegio) {
        super(nombre, edad);
        setNomColegio(nomColegio);
    }
    
    // setters
    public void setNomColegio(String nomColegio) {
        this.nomColegio = nomColegio;
    }
    
    // getters
    public String getNombColegio() {
        return this.nomColegio;
    }
}
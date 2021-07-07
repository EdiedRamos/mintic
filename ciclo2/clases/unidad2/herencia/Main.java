public class Main {
    public static void main(String args[]) {
        Estudiante p = new Estudiante("Edied", 21, "Tecnico Industrial");
        // Estudiante p = new Estudiante("Tecnico Industrial");
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        System.out.println(p.getNombColegio());
    }
}
public class Main {
    public static void main(String args[]) {
        Persona p = new Persona("Edied", "123456789", 21, 165);
        Persona p2 = new Persona();
        p.saludar();
        System.out.println(p.getEdad());
        p2.saludar();
        System.out.println(p2.getEdad());
    }
}
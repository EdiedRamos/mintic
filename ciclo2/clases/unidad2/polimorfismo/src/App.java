public class App {
    public static void main(String[] args) throws Exception {
        Cerdo cerdo = new Cerdo();
        Dog dog = new Dog();
        Animal animal = new Animal();
        cerdo.makeSound();
        dog.makeSound();
        animal.makeSound();
    }
}

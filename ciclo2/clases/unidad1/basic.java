import java.util.Scanner;

public class basic {
  // función para saludar, dado un nombre
  static void saludar(String nombre) {
    System.out.println("Hola, " + nombre);
  }
  
  // función para calcular la cantidad de dígitos de un número
  static int digitos(int numero) {
    return numero == 0 ? 0 : digitos(numero / 10) + 1;
  }
  
  // función para mostar el doble y el tripe de un número
  static void doble_triple(int numero) {
    System.out.println("El doble de " + numero + " es " + (numero << 1));
    System.out.println("El triple de " + numero + " es " + (numero * 3));
  }
  
  // función para convertir X grados celsius a fahrenheit
  static float celsius_fahrenheit(float cel) {
    return 32 + (9 * cel / 5);
  }
  
  // función para revisar al paridad de un número
  static boolean par(int n) {
    return (n & 1) == 0;
  }
  
  // función main
  public static void main(String args[]) {
    // instancias
    Scanner sc = new Scanner(System.in);
    
    // probando la función "saludar"
    // String nombre = "Edied Isaias Ramos Hernandez";
    // saludar(nombre);
    
    // probando la función "digitos"
    // int numero = -10;
    // System.out.println(digitos(numero));
    
    // probando la función "doble_triple"
    // System.out.println("Ingrese un numero para calcular el doble y el tripe:");
    // int numero2 = sc.nextInt();
    // doble_triple(numero2);
    
    // probando la función "celsius_fahrenheit"
    // System.out.println("Ingrese la cantidad de grados centigrados:");
    // float celsius = sc.nextFloat();
    // System.out.printf("%.3fC es equivalente a %.3fF\n", celsius, celsius_fahrenheit(celsius));
    
    // probando la función "par"
    System.out.println("Ingrese un numero:");
    int numero3 = sc.nextInt();
    System.out.println(numero3 + " es " + (par(numero3) ? "par" : "impar"));
  }
}
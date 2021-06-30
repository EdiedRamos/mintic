import java.util.Scanner;

/*
Pide por teclado el nombre, edad y salario y muestra el salario
  -> Si es menor de 16 no tiene edad para trabajar
  -> Entre 19 y 50 años el salario es un 5 por ciento más
  -> Entre 51 y 60 años el salario es un 10 por ciento más
  -> Si es mayor de 60 el salario es un 15 por ciento más
 */

public class Ejercicio9 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String nombre;
    int edad;
    double salario = 0.0;
    System.out.println("Ingrese su nombre:");
    nombre = sc.nextLine();
    System.out.println("Ingrese su edad:");
    edad = sc.nextInt();
    System.out.println("Ingrese su salario:");
    salario = sc.nextDouble();
    System.out.print(nombre + " ");
    if (edad < 16) {
      System.out.println("Usted no tiene edad para trabajar");
    } else {
      System.out.print("Su salario es: $");
      if (edad > 18 && edad < 51) {
        salario += salario * 0.05;
      } else if (edad > 50 && edad < 61) {
        salario += salario * 0.1;
      } else {
        salario += salario * 0.15;
      }
      System.out.printf("%.2f\n", salario);
    }
  }
}
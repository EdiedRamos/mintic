import java.util.Scanner;

/*
  Realizar un programa que calcule el sueldo de un trabajador, el programa
  solicita el número de horas que has trabajado en un mes, las horas se
  pagan a $30.000.
*/

public class Ejercicio3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantas horas ha trabajado?:");
    int ht = sc.nextInt();
    final int cht = 30000;
    int total = ht * cht;
    System.out.println("Su sueldo es de: $" + total);
  }
}
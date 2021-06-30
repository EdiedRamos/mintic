import java.util.Scanner;

/*
  Realizar un programa que realice el promedio de las notas de un alumno,
  para ello el programa va a tener que solicitar el nombre del alumno y las
  notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
  3.0 también debe imprimir "Aprobado", si no alcanzó esa nota debe imprimir
  "Reprobado" . Requisitos: Las notas que se ingresan pueden tener
  decimales.
*/

public class Ejercicio2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String nombre;
    double notas[] = new double[4];
    System.out.println("Nombre del alumno:");
    nombre = sc.nextLine();
    notas[3] = 0.0;
    for (int i = 0; i < 3; i++) {
      notas[i] = sc.nextDouble();
      notas[3] += notas[i];
    }
    notas[3] /= 3.0;
    System.out.println(nombre + " fue " + (notas[3] >= 3.0 ? "Aprobado" : "Reprobado"));
  }
}
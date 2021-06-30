import java.util.Scanner;

/*
  Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
  número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
  tabla y mostrar los datos.
*/

public class Ejercicio4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tabla que desea ver:");
    int tabla = sc.nextInt();
    for (int i = 0; i < 11; i++) {
      System.out.println(tabla + " x " + i + " = " + tabla * i);
    }
  }
}
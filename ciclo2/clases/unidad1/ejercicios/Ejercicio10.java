import java.util.Scanner;

/*
  Muestra la serie de fibonacci hasta un número pedido por teclado. Por
  ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
  1, 2, 3, 5, 8, 13, 21, 34, 55, 89.
*/

public class Ejercicio10 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = 0, b = 1, aux = 1, tope;
    System.out.println("Ingrese el numero tope para la serie de fibonacci:");
    tope = sc.nextInt();
    while (a <= tope) {
      System.out.println("[" + a + "]");
      a = b;
      b = aux;
      aux = a + b;
    }
  }
}
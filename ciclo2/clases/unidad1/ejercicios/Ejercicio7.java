import java.util.Scanner;

/*
  Pedir un número, comprobar si es primo y preguntar si quiere introducir más
  (S/N) y volver a pensar.
 */

public class Ejercicio7 {
  public static boolean primo(int n) {
    if (n < 1) {
      return false;
    }
    if (n < 3) {
      return true;
    }
    if ((n & 1) < 1) {
      return false;
    }
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char opt = 'S';
    int numero;
    while (opt == 'S') {
      System.out.println("Ingrese un numero para verificar si es primo:");
      numero = sc.nextInt();
      System.out.println(numero + (primo(numero) ? "" : " no") + " es primo");
      System.out.println("Desea ingresar otro numero? (S/N)");
      opt = sc.next().charAt(0);
    }
  }
}
import java.util.Scanner;

/*
  Realizar la suma, la resta, la división y la multiplicación de dos números
  leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
  y <número 2> es igual a <resultado> ”.
*/

public class Ejercicio1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Ingrese el primer numero");
    a = sc.nextInt();
    System.out.println("Ingrese el segundo numero");
    b = sc.nextInt();
    System.out.printf("La suma de %d y %d es %d\n", a, b, a + b);
    System.out.printf("La resta de %d y %d es %d\n", a, b, a - b);
    System.out.printf("La multiplicacion de %d y %d es %d\n", a, b, a * b);
    System.out.printf("La division de %d y %d es %.2f\n", a, b, a * 1.0 / b * 1.0);
  }
}
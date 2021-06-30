import java.util.Scanner;

/*
  Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
  adivinar introduciendo el número por teclado. En el caso que el número a
  adivinar sea mayor al ingresado, decirle al usuario "El número que busca es
  mayor", de lo contrario, "El número que busca es menor". El programa
  finalizará cuando se introduzca el número correcto. Nota: usar la clase
  Random para generar el número aleatorio.
 */

public class Ejercicio5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    final int rd = (int)(Math.random() * 101) + 1;
    int n;
    while (true) {
      System.out.println("Adivine el numero:");
      n = sc.nextInt();
      if (n == rd) {
        System.out.println("Muy Bien");
        break;
      } else if (n < rd) {
        System.out.println("El numero que buscar es mayor");
      } else {
        System.out.println("El numero que buscar es menor");
      }
    }
    System.out.println(rd);
  }
}
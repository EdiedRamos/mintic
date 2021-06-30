import java.util.Scanner;

/*
  Realizar un programa que permita controlar el juego de piedra, papel, tijera
  introduciendo P para piedra, L para papel y T para tijera por cada jugador.
  El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
  de cada ronda preguntar si desea volver a jugar.
*/

public class Ejercicio8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char j1, j2, opt = 'S';
    String plt = "\n(P) Piedra\n(L) Papel\n(T) Tijera";
    while (opt == 'S') {
      System.out.println("Jugador 1" + plt);
      j1 = sc.next().charAt(0);
      System.out.println("Jugador 2" + plt);
      j2 = sc.next().charAt(0);
      // resultados
      if (j1 == j2) {
        System.out.println("Empate");
      } else if (j1 == 'P' && j2 == 'T' || j1 == 'L' && j2 == 'P' || j1 == 'T' && j2 == 'L') {
        System.out.println("El jugador 1 es el ganador");
      } else {
        System.out.println("El jugador 2 es el ganador");
      }
      System.out.println("Nuevo Juego? (N/S)");
      opt = sc.next().charAt(0);
    }
  }
}
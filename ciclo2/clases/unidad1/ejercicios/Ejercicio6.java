import java.util.Scanner;

/*
  Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
  que calcule el peso ideal.
  -> peso ideal mujeres = altura - 120
  -> peso ideal hombres = altura - 110
 */

public class Ejercicio6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char sexo;
    int altura, peso_ideal;
    System.out.println("Ingrese el sexo:");
    sexo = sc.next().charAt(0);
    System.out.println("Ingrese su estatura en (cm):");
    altura = sc.nextInt();
    peso_ideal = altura - (sexo == 'M' ? 120 : 110);
    System.out.println("Su peso ideal es: " + peso_ideal);
  }
}
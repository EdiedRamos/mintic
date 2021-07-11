import java.util.ArrayList;
import java.util.Iterator;

public class listas {
    public static void main(String args[]) {
        // creación de la lista
        ArrayList<Integer> lista = new ArrayList<>();
        // agregar números a la lista
        for (int i = 1; i < 10; i++) {
            lista.add(i * 10 + 5);
        }
        // agrega un número en la posición específicada lista.add(posicion, valor)
        lista.add(1, 222);
        // recorrer la lista
        // usando el for tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        // usando foreach
        for (Integer i : lista) {
            System.out.println(i);
        }
        // usando iterator
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            Integer valor = iterador.next();
            System.out.println(valor);
        }
    }
}
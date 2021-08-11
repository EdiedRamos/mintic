package practica.reto5;

import practica.reto5.vista.*;

/**
 * Esta clase solo se debe usar para hacer pruebas locales, no se debe subir en
 * iMaster
 */
public class App {

    public static void main(String[] args) {
//         System.out.println("Requerimiento 1");
//         VistaRequerimientos.requerimiento1();
//
//         System.out.println("\nRequerimiento 2");
//         VistaRequerimientos.requerimiento2();
//
//        System.out.println("\nRequerimiento 3");
//        VistaRequerimientos.requerimiento3();

//        Interfaz it = new Interfaz();
//        it.setVisible(true);
        try {
            RequerimientosGUI r = new RequerimientosGUI();
            r.setVisible(true);

        } catch (Exception e) {
            System.out.println("fallo la gui");
            e.printStackTrace();
            System.exit(0);
        }
    }
}

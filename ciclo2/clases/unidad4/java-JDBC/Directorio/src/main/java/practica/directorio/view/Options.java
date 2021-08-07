/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.directorio.view;

import java.util.ArrayList;
import practica.directorio.controller.controller;
import practica.directorio.model.vo.directory;
import practica.directorio.util.util_reader;

/**
 *
 * @author ediei
 */
public class Options {
    
    private static String opt;
    private static String nombre;
    private static String contra;
    private static boolean state;
    private static controller controlador;
    private static ArrayList<directory> lista_dir;
    
    public static void start() {
        controlador = new controller();
        boolean loop = true;
        while (loop) {
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");
            try {
                opt = util_reader.read("Ingrese la opcion");
                switch (opt) {
                    case "1":
                        // registrar usuario
                        nombre = util_reader.read("Ingrese su nombre:");
                        contra = util_reader.read("Igrese su contraseña");
                        state = controlador.registrar_usuario(nombre, contra);
                        System.out.println(state ? "Usuario regitrado" : "No se pudo registrar");
                        break;
                    case "2":
                        // iniciar sesion
                        nombre = util_reader.read("Ingrese su nombre:");
                        contra = util_reader.read("Igrese su contraseña");
                        state = controlador.iniciar_sesion(nombre, contra);
                        System.out.println(state ? "Bienvenido" : "Error de sesion"
                                + "");
                        if (state) {
                            sesion();
                        }
                        break;
                    case "3":
                        // cerrar la app
                        loop = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta!");
                }
                System.out.println("");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    
    private static void sesion() {
        boolean loop = true;
        while (loop) {
            System.out.println("1. Listar contactos");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. cerrar sesion");
            try {
                opt = util_reader.read("Ingrese la opcion");
                switch (opt) {
                    case "1":
                        // listar contactos
                        lista_dir = controlador.listar_contactos(nombre);
                        if (lista_dir.isEmpty()) {
                            System.out.println("No tiene contactos");
                        } else {
                            for (directory dir : lista_dir) {
                                System.out.println("[" + dir.getName() + "][" + dir.getCellphone() + "][" + dir.getEmail() + "]");
                            }
                        }
                        break;
                    case "2":
                        // agregar contacto
                        System.out.println("Informacion del contacto");
                        state = controlador.agregar_contacto(nombre, util_reader.read("Nombre:"),
                                util_reader.read("Celular:"),
                                util_reader.read("email:"));
                        System.out.println(state ? "Contacto agregado" : "No se pudo agregar el contacto");
                        break;
                    case "3":
                        // eliminar contacto
                        state = controlador.eliminar_contacto(nombre, util_reader.read("Nombre:"));
                        System.out.println(state ? "Contacto eliminado" : "No se pudo eliminar el contacto");
                        break;
                    case "4":
                        loop = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta!");
                }
                System.out.println("");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}

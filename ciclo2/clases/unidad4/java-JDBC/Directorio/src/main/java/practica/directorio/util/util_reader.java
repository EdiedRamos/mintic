/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.directorio.util;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author ediei
 */

public class util_reader {
    public static String read(String msg) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.next();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1º_ejercicio_examen_damian;

/**
 *
 * @author jalvarezotero
 */
public class Factorial {

    public static void main(String[] args) {
        final int new_name = 8;

        int j = new_name;
        int f;

        int i;
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }

        System.out.println(f);

    }

}

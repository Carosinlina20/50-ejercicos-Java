/*
10 Haz un programa que contenga la declaración e inicialización de un array de números enteros vacío de 5 posiciones
 */

package excercise10;

import java.lang.reflect.Array;

public class Excercise10 {

    public static void main(String[] args) {

        int [] list;
        list = new int[5];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 98;

        int num = list[list.length - 1];

        for (int i = 0; i < list.length ;i++){
            System.out.println(list[i]);
        }

    }
}

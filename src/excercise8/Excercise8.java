/*
8 Haz un programa que imprima el cuadrado de un número introducido por teclado
 */

package excercise8;

import java.util.Scanner;

public class Excercise8 {

    public static void main(String[] args) {

        int base;

        int expo = 2;

        System.out.println("Introduce el número que al quieres elevar al cuadrado");

        Scanner sc = new Scanner(System.in);

        base = sc.nextInt();

        int result = (int) Math.pow(base, expo);

        System.out.println(base + " elevado en " + expo + " es " + result);


    }
}

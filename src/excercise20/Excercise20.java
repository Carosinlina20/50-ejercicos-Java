/*
21 Haz un programa que diga si el cuadrado de n es par, siendo n un número introducido por teclado.
 */

package excercise20;

import java.util.Scanner;

public class Excercise20 {

    public static void main(String[] args) {

        int base;

        int expo = 2;

        System.out.println("Introduce el número que al quieres elevar al cuadrado");

        Scanner sc = new Scanner(System.in);

        base = sc.nextInt();

        int result = (int) Math.pow(base, expo);

        System.out.println(base + " elevado en " + expo + " es " + result);

        if (result % 2 == 0) {
            System.out.println(result + " es un numero par");

        }

    }
}

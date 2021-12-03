/*
 * 12 Haz un programa que contenga un array de n posiciones, siendo n un número introducido por teclado
 */
package excercise12;

import java.util.Scanner;

public class Excercise12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de tu posición");

        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println(numbers.length);


    }
}

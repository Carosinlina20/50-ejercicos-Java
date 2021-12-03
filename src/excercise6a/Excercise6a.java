/*
 *6 Haz un programa que imprima la división de dos números introducidos por teclado sin decimales.
 */

package excercise6a;

import java.util.Scanner;

public class Excercise6a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");

        int num1 = sc.nextInt();


        System.out.println("Introduce el segundo número");

        int num2 = sc.nextInt();


        System.out.println("La división de los número es " + (num1 / num2));

    }
}

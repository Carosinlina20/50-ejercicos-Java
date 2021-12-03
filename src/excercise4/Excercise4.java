/*
 * 4 Haz un programa que imprima la resta de dos números introducidos por teclado sin decimales
 */

package excercise4;

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");

        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");

        int num2 = sc.nextInt();

        System.out.println("La resta de los número es " + (num1 - num2));


    }

}


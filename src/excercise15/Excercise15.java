/*
 * 16 Haz un programa que te diga de dos números introducidos por teclado cuál es menor
 */
package excercise15;

import java.util.Scanner;


public class Excercise15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();


        if (num1 < num2) {

            System.out.println("El numero menor es: " + num1);
        } else {

            System.out.println("El numero menor es " + num2);
        }

    }
}

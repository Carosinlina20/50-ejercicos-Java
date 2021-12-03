/*
Haz un programa que te diga si el número que has introducido por teclado es par e impar.
 */
package excercise13;

import java.util.Scanner;

public class Excercise13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Escribe un número");

        number = sc.nextInt();

        if (number % 2 != 0) {
            System.out.println(number + " es un numero impar");

        }



}


}

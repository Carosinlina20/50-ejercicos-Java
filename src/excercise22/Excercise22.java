/*
23 Haz un programa que diga si la raiz cuadrada de n es par, siendo n un número introducido por teclado.
 */

package excercise22;

import java.util.Scanner;

public class Excercise22 {

    public static void main(String[] args) {

        double number, root;

        System.out.println("Ingresa el numero del que quieres sacar la raíz cuadrada");

        Scanner sc = new Scanner(System.in);
        number = sc.nextDouble();
        root = Math.sqrt(number);

        System.out.println("La raíz cuadrada de " + number + " es " + root);

        if (root % 2 == 0) {
            System.out.println("y " + root + " es un numero par");

        }

    }
}

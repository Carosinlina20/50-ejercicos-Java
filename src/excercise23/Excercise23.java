/*
 * 24 Haz un programa que diga si la raiz cuadrada de n es impar, siendo n un número introducido por teclado.
 */
package excercise23;

import java.util.Scanner;

public class Excercise23 {
    public static void main(String[] args) {
        double number;
        double root;

        System.out.println("Ingresa el numero del que quieres sacar la raíz cuadrada");

        Scanner sc = new Scanner(System.in);
        number = sc.nextDouble();
        root = Math.sqrt(number);

        System.out.println("La raíz cuadrada de " + number + " es " + root);

        if (root % 2 != 0) {
            System.out.println("y " + root + " es un numero impar");

        }
    }
}

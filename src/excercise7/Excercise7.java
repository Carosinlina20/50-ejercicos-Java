/*
 *7 Haz un programa que imprima la raíz cuadrada de un número introducido por teclado
 */

package excercise7;

import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {

        double number, root;

        System.out.println("Ingresa el numero del que quieres sacar la raíz cuadrada");

        Scanner sc = new Scanner(System.in);
        number = sc.nextDouble();
        root = Math.sqrt(number);

        System.out.println("La raíz cuadrada de " + number + " es " + root);


    }
}

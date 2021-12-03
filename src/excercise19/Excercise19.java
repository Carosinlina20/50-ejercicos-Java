/*
 * 20 Haz un programa que calcule el arcotangente de n , siendo n un número introducido por teclado.
 */
package excercise19;

import java.util.Scanner;


public class Excercise19 {

    public static void main(String[] args) {

        double number;
        System.out.println("Ingresa el número a calcular");


        Scanner sc = new Scanner(System.in);
        number = sc.nextDouble();

        double arco = Math.atan(number);

        System.out.println("El arcotangente es " + arco );

    }
}

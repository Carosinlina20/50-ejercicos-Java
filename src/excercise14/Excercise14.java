/*
15 Haz un programa que te diga de dos números introducidos por teclado cuál es mayor.
 */
package excercise14;

import java.util.Scanner;

public class Excercise14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println("El numero mayor es: " + num1);
        else
            System.out.println("El numero mayor es: " + num2);

    }
}

/*
 * 2 Haz un programa que imprima un número introducido por teclado
 */

package excercise2;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("A continuación introduce un  número: ");
        num = sc.nextInt();

        System.out.println("has introducido el número " + num);

    }
}




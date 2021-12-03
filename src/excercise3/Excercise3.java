/*

3. Haz un programa que imprima la suma de dos números introducidos por teclado sin decimales
 */

package excercise3;

import java.util.Scanner;

public class Excercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el primer número");

        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");

        int num2 = sc.nextInt();

        System.out.println("La suma de los número es " + (num1 + num2));


    }

}

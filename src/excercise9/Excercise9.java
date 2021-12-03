/*
 * 9 Haz un programa que imprima el resultado de a * b + c, siendo a b y c números introducidos por teclado
 */

package excercise9;


import java.util.Scanner;

public class Excercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");

        int num1 = sc.nextInt();


        System.out.println("Introduce el segundo número");

        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer número");

        int num3 = sc.nextInt();

        int result = num1 * num2 + num3;


        System.out.println("El resultado es " + result);





    }
}

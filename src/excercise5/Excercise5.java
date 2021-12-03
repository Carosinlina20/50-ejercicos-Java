/*
 * 5 Haz un programa que imprima la multiplicación de dos números introducidos por teclado con decimales
 */


package excercise5;
import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");

        double num1 = sc.nextDouble();


        System.out.println("Introduce el segundo número");

        double num2 = sc.nextDouble();


        System.out.println("La multiplicación de los número es " + (num1 * num2));

    }
}



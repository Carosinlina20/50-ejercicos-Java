import java.util.Scanner;

/*
25 Haz un programa que realice esta operación a * b - c (a-d)^2, introduciendo todos los números por teclado
 */
public class excercise24 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero A");
        a = sc.nextDouble();
        System.out.println("Ingresa el numero B");
        b = sc.nextDouble();
        System.out.println("Ingresa el numero C");
        c = sc.nextDouble();
        System.out.println("Ingresa el numero D");
        d = sc.nextDouble();

        double result = a * b - c * (Math.pow(a - d, 2));

        System.out.println("El resultado es " + result);

    }
}



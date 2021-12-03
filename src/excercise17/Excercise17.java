/*
18 Haz un programa que recorra un array de 9 posiciones y te imprima el valor de cada posición, el array debe contener los números del 1 al 9.
 */
package excercise17;

public class Excercise17 {
    public static void main(String[] args) {

        int [] list;
        list = new int[9];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;
        list[5] = 6;
        list[6] = 7;
        list[7] = 8;
        list[8] = 9;

        for(int num : list){
            System.out.println(num);
        }

        for (int i = 0; i < list.length ;i++){
            System.out.println(list[i]);
        }


    }
}

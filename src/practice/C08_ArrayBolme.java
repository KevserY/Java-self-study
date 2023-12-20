package practice;

import java.util.Arrays;

public class C08_ArrayBolme {
    public static void main(String[] args) {
        // verilen int bir array'deki
        // tüm elementlerin değerlerini 3 ile çarpın.
        //Verilen Array:

        int[] arrbol = {8, 3, 4, 15, 21, 6};
        System.out.println("array'in ilk hali: " + Arrays.toString(arrbol));


        for (int i = 0; i < arrbol.length; i++) {
            arrbol[i] *= 3;
        }
        System.out.println("verilen array'in 3'le çarpılmış hali: " + Arrays.toString(arrbol) );

    }
}
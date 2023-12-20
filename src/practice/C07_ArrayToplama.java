package practice;

import java.util.Arrays;

public class C07_ArrayToplama {
    public static void main(String[] args) {
        // verilen int bir array'deki
        // tüm elementlerin değerlerini 5 artırın.
    //verilen array:

        int[] arrArtirma = {3,7,9,12,34,2};
        System.out.println("verilen array: " + Arrays.toString(arrArtirma));


        for (int i = 0; i < arrArtirma.length; i++) {

            arrArtirma[i] += 5;
        }
        System.out.println("verilen array'in 5 artırılmış hali: "+ Arrays.toString(arrArtirma));





    }
}

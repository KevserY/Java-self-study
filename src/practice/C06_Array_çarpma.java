package practice;

import java.util.Arrays;

public class C06_Array_çarpma {
    public static void main(String[] args) {
        // verilen int bir array'deki
        // tüm elementlerin değerlerini 2 katını alın.

        // verilen int:
        int [] arr = {3,5,7,10};
        System.out.println("verilen Array'in ilk hali: "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] *=2;

        }
        System.out.println("Verilen Array'in 2 ile çarpılmış hali: " + Arrays.toString(arr));

    }
}

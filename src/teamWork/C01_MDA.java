package teamWork;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        //- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
        // sonucu YAZDIRAN bir method olusturun.

        int[][] arr = {{2,3,6,1},{3,7,6,9},{5,9,7,3},{2,4}};

        ciftsayitoplami(arr); //MDA'daki çift sayıların toplamı: 20



    }

    public static void ciftsayitoplami(int[][]arr){
       int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    toplam+= arr[i][j];
                }
            }
        }
        System.out.println("MDA'daki çift sayıların toplamı: " + toplam);
    }
}

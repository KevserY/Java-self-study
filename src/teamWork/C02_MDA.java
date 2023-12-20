package teamWork;

import java.util.Arrays;

public class C02_MDA {
    public static void main(String[] args) {
        // - Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        //   yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.

        //input : int[][] arr = {{3,4,5}, {2,3,6,7}}; output: [5, 7, 11]





        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int[]yeniarr=new int[4];

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                yeniarr[j]+=arr[i][j];
            }
        }

        System.out.println(Arrays.toString(yeniarr));

            }
        }


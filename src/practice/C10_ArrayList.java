package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_ArrayList {
    public static void main(String[] args) {

        // verilen bir int array'de tekrar eden elementleri silip,
        // array'i, her elementin unique olduğu bir hale getirin.

        int[] arr = {3, 2, 5, 6, 7, 2, 8, 6, 9, 5, 8, 6, 2, 5, 3, 4, 7, 9}; // !!!var olan bir array'in elemanları silinip, artırılamaz!!!

        //bir list oluşturalım, boş,
        List<Integer> uniqueList = new ArrayList<>();
        //sonra array'in tüm elemanlarını tek tek ele alalım,
        //listede olup olmadığına bakalım, listede yoksa ekleyelim.

        for (int i = 0; i < arr.length; i++) {
            if (!uniqueList.contains(arr[i])) { // eğer uniqueList "arr[i]" nin tek tek getirdiği elemanları içerMİYORSA, '.add' listeye dahil et.
                uniqueList.add(arr[i]);
            }
        }
        System.out.println("Unique list: " + uniqueList); //Unique list: [3, 2, 5, 6, 7, 8, 9, 4]

        for (int i = 0; i < arr.length; i++) {
            arr[i] = uniqueList.get(i);
        }

        System.out.println(Arrays.toString(arr));

    }
}


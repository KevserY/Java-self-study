package Java_Practice;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Görev-1: kullanıcıdan bir karakter girmesini isteyip,
        // o karakterin Ascii değerini yazdırın.

        // Örnek:
        //input: #
        // output: girdiğiniz değerin Ascii değeri: 35'dir.

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz:");

        char krk1 = scanner.next().charAt(0);
        System.out.println(krk1+ 0);




    }
}

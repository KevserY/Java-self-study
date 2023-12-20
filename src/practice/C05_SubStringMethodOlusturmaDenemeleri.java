package practice;

import java.util.Scanner;

public class C05_SubStringMethodOlusturmaDenemeleri {
    public static void main(String[] args) {
        /*  Kullanicidan input olarak verilen bir String'i, baslangic ve bitis indexlerine gore
            baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
            bir method olusturun.

            - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse,
            hata mesaji verin.
            - kullanici str'da olan index'lerden daha buyuk bir index girerse,
            hata mesaji verin.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle yazınız: ");
        String girilencumle = scanner.nextLine();

        System.out.print("Başlangıç index'i giriniz:");
        int basindex = scanner.nextInt();

        System.out.print("Bitiş index'i giriniz: ");
        int bitindex = scanner.nextInt();


        if (basindex > bitindex) {
            System.out.println(" HATA ! \nBaşlangıç index'i bitiş index'inden büyük olamaz");
        }

        if (basindex == bitindex) {
            System.out.println(" HATA ! \nBaşlangıç ve Bitiş index'leri birbirine eşit olamaz !");
        }

        if ((basindex > girilencumle.length()) && (bitindex > girilencumle.length())) {
            System.out.println(" HATA ! \nBaşlangıç ve Bitiş index'leri metnin uzunluğundan fazla olamaz !");

        } else {
            System.out.println(girilencumle.substring(basindex, bitindex));
        }

    }
}
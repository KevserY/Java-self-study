package practice;

import java.util.Scanner;

public class C03_ifElseAyİsmleri {
    public static void main(String[] args) {
        /*    Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.

              NOT:  Buyuk harf, kucuk harf hassasiyeti olmasin.
                    Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz: ");
        char girilenHarf = scanner.next().toLowerCase().charAt(0);

        if (girilenHarf == 'o') {
            System.out.println("Ocak");
        } else if (girilenHarf == 'ş') {
            System.out.println("şubat");
        } else if (girilenHarf == 'm') {
            System.out.println("Mart ve Mayıs");
        } else if (girilenHarf == 'n') {
            System.out.println("Nisan");
        } else if (girilenHarf == 'h') {
            System.out.println("hazıran");
        } else if (girilenHarf == 't') {
            System.out.println("temmuz");
        } else if (girilenHarf == 'a') {
            System.out.println("Ağustos ve Aralık");
        } else if (girilenHarf == 'e') {
            System.out.println("Eylül ve Ekim");
        } else if (girilenHarf == 'k') {
            System.out.println("Kasım");
        } else {
            System.out.println("Bu harfle başlayan bir ay bulunmamaktadır");
        }
    }


}

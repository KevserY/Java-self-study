package Java_Practice;

import java.util.Scanner;

public class toplama_çarpma_işlemi {
    public static void main(String[] args) {
        //Görev: kullanıcıdan 2 tam sayı alıp,
        //sayıların toplamını ve çarpımını yazdıran bir program yazdırın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("ilk tamsayıyı giriniz");
        int sayı1= scanner.nextInt(); //kullanıcıdan integer bir veri almamızı sağlıyor.

        System.out.println("ikinci tamsayıyı giriniz");
        int sayı2= scanner.nextInt();

        //toplam ve çarpım için atama yapıyoruz:
        int toplam =sayı1 + sayı2;
        int çarpım= sayı1 * sayı2;

        System.out.println("Toplam: " + toplam + "\nÇarpım: " + çarpım); //alt satıra yazdırması için \n yazıyoruz.

    }
}

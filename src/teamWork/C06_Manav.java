package teamWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C06_Manav {
    public static void main(String[] args) {
        /*
            Basit bir 5 ürünlü manav alisveris programi yaziniz.
          1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
          2. Adim : Baska bir urun almak isteyip istemedigini sor.
                     istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                     Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
          3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
          4. Adim : Alisveris bitince toplam odemesi gereken tutari goster. */

        ArrayList<String> urunAdi = new ArrayList<>(Arrays.asList("1-Domates","2-Soğan","3-Patates","4-Mandalina","5-Muz"));
        ArrayList<Integer> urunFiyati = new ArrayList<>(Arrays.asList(20,10,15,25,35));

        System.out.println("***** YILDIZ MANAV *****");
        for (String each:urunAdi) {
            System.out.println(each);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("ÜRÜN SEÇİNİZ: ");
        int secim = scanner.nextInt();

        System.out.print("KAÇ KİLO ALMAK İSTERSİNİZ: ");
        int miktar = scanner.nextInt();

        System.out.print("ALIŞVERİŞE DEVAM ETMEK İSTER MİSİNİZ ? \n  E / H ---> ");
        char cevap = scanner.next().toUpperCase().charAt(0);

        if (cevap == 'E') {
            System.out.print("ÜRÜN SEÇİNİZ: ");
            int secim2 = scanner.nextInt();

            System.out.print("KAÇ KİLO ALMAK İSTERSİNİZ: ");
            int miktar2 = scanner.nextInt();

            int tutar = miktar * urunFiyati.get(secim-1);
            System.out.println("ALIŞVERİŞİNİZİN TOPLAM TUTARI: " + tutar+" TL  \n  YİNE BEKLERİ ...");

        } else if (cevap == 'H'){
            int tutar = miktar * urunFiyati.get(secim-1);
            System.out.println("ALIŞVERİŞİNİZİN TOPLAM TUTARI: " + tutar+" TL  \n  YİNE BEKLERİ ...");

        }else {
            System.out.print("GEÇERSİZ GİRİŞ ! \n ALIŞVERİŞE DEVAM ETMEK İSTER MİSİNİZ ? \n CEVAP: E / H  ---> ");
        }





    }
}

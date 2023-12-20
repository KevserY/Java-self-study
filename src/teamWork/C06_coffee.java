package teamWork;

import java.util.Scanner;

public class C06_coffee {
    public static void main(String[] args) {
/*
        Basit bir Kahve makinesi oluşturun:
        1. Şart: 3 çeşit kahvemiz olsun.
        Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
        Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.

        Örn:
        Hangi Kahveyi İstersiniz?
                1.Türk kahvesi
                2.Filtre Kahve
                3.Americano
        2.Şart : Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        3. Şart : Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        sorusunu sorsun.
        4. Şart : Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
        sorusunu sorsun.

        Sonuç : Siparişlerimizi verdik. Son hali görmek istiyoruz. Konsola şunu yazdırın:

         örnek : Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz ? \n 1. Türk Kahvesi \n 2. Filtre Kahve \n 3. Americano");
        int secim = scanner.nextInt();

        System.out.print("Süt eklemek ister misiniz ? \n (Evet veya Hayır olarak cevaplayınız) ");
        String sut = scanner.next().toUpperCase();

        System.out.print("Şeker ister misiniz ?  \n  (Evet veya Hayır olarak cevaplayınız)");
        String seker = scanner.next().toUpperCase();

        System.out.print("Kahveniz hangi boyutta olsun ? \n Büyük boy - Orta boy - Küçük boy olarak giriniz)");
        String boyut = scanner.nextLine().toUpperCase();

        System.out.println("");

        if (secim == 1) {
            System.out.println("Türk Kahvesi");
        } else if (secim == 2) {
            System.out.println("Filtre Kahve");
        } else if (secim == 3) {
            System.out.println("Americano");
        } else if (sut == "EVET") {
            System.out.println(" sütlü");
        } else if (seker == "EVET") {
            System.out.println(" şekerli");
        }

        if (boyut == "BÜYÜK BOY") {
        System.out.println("BÜYÜK BOY");
        } else if (boyut == "ORTA BOY") {
            System.out.println("");
        }


        System.out.println(secim + sut + seker + boyut + " hazırdır. \n Afiyet olsun !!!");


    }
}

package okulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scanner = new Scanner(System.in);

    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void ogretmenListesi() {
        // KEY= kimlikNo, Value= adSoyad, yas, bolum, sicilNo
        ogretmenlerMap.put("12345678912", "Mete, Met, 33, Matematik, 1234");
        ogretmenlerMap.put("12345678913", "Gül, Aç, 42, Fen, 4569");
        ogretmenlerMap.put("12345678914", "Nil, Ak, 28, İngilizce, 1547");
        ogretmenlerMap.put("12345678915", "Mehmet, Ren, 56, Edebiyat, 2597");
        ogretmenlerMap.put("12345678916", "Yeşim, San, 36, Resim, 5716");
    }

    public static void ogretmenMenu() {
        /* İşlemler menüsünde:
           bir önceki menüde seçilen Kişi türü ile ilgili ekleme,
           kimlik no ile silme ve arama,
           var olan tüm kişileri listeleme işlemleri yapılacak.
           Üst menüye dönme veya çıkış işlemleri de olacak.   */

        String tercih = "";
        do {
            System.out.println("============= ÖĞRETMEN İŞLEMLERİ =============\n" +
                    "         1- Yeni Öğretmen Ekleme\n" +
                    "         2- TC No İle Öğretmen Arama\n" +
                    "         3- TC No İle Öğretmen Kayıt Silme\n" +
                    "         4- Tüm Öğretmenlerin Listesi\n" +
                    "         A- Anamenü\n" +
                    "         Q- ÇIKIŞ");
            tercih = scanner.nextLine();
            switch (tercih) {
                case "1": // öğretmen bilgileri girerek yeni kayıt oluşturan bir method yaz
                    ogretmenEkle();
                    break;
                case "2":// TC No ile öğretmen arama methodu kuralım
                    tcOgretmenArama();
                    break;
                case "3"://  TC No İle Öğretmen Kayıt Silme
                    tcOgretmenSilme();
                    break;
                case "4": // varolan tüm öğretmenlerin listesini yazdıran bir method ekle
                    ogretmenListesiYazdir();
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Geçersiz Giriş !\nLütfen Öğretmen İşlemleri Menüsü'nden bir seçim yapınız");
            }

        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void tcOgretmenSilme() {
        System.out.println("Kaydını silmek istediğiniz Öğretmenin TC Kimlik Numarası'nı giriniz: ");
        String silinecekOgretmen = scanner.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        try {
            if (sonucValue.equals(silinecekValue)) {
                System.out.printf("Silme İşlemi Gerçekleşmiştir...\n");
            }
        } catch (NullPointerException e) {
            System.out.printf("Verilen TC Kimlik No ile Öğretmen Bulunamadı !\n");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static void ogretmenEkle() {
        // "12345678916","Yeşim, San, 36, Resim, 5716");
        System.out.println("Lütfen eklemek istediğiniz Öğretmenin bilgilerini giriniz:\n");
        System.out.print("TC No :");
        String tcNo = scanner.nextLine();
        System.out.print("İsim :");
        String isim = scanner.nextLine();
        System.out.print("Soyisim :");
        String soyisim = scanner.nextLine();
        System.out.print("Yaş :");
        String yas = scanner.nextLine();
        System.out.print("Branş :");
        String brans = scanner.nextLine();
        System.out.print("Sicil No :");
        String sicilNo = scanner.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + yas + ", " + brans + ", " + sicilNo;
        ogretmenlerMap.put(tcNo, eklenecekValue);

        System.out.printf("Ekleme işlemi gerçekleştirilmiştir.\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

    }
    public static void tcOgretmenArama() {
        System.out.println("Aradığınız Öğretmenin TC Kimlik Numarasını Giriniz : ");
        String istenenTc = scanner.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("====== TC ile Öğretmen Arama ======\n" +
                "TC Kimlik No     İsim   Soyisim   Yaş   Bölüm   Sicil No");

        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            if (istenenTc.equals(eachKey)) {
                System.out.printf("%11s        %-6s    %-8s%2s  %-6s     %s\n", eachKey, eachValueArr[0],
                        eachValueArr[1], eachValueArr[2], eachValueArr[3], eachValueArr[4]);
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

    }

    public static void ogretmenListesiYazdir() {

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("========== *YAZICI KOLEJİ* ==========\n" +
                "====== ÖĞRETMEN LİSTESİ ======\n" +
                "TC Kimlik No       İsim   Soyisim   Yaş   Bölüm   Sicil No");

        for (Map.Entry<String, String> each : ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            // daha düzenli bir formatta listeleyeceğiz. System.out.println(eachKey + " " + eachValue);

            String eachValueArr[] = eachValue.split(", ");
            System.out.printf("%11s        %-6s    %-8s%2s  %-6s     %s\n", eachKey, eachValueArr[0],
                    eachValueArr[1], eachValueArr[2], eachValueArr[3], eachValueArr[4]);
        }
        System.out.printf("");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }


    }
}

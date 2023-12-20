package okulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {
    static Scanner scanner = new Scanner(System.in);

    static Map<String,String> ogrencilerMap = new HashMap<>();

    public static void ogrenciListesi() {
    // KEY= kimlikNo, VALUE= adSoyad, yas, numara, sinif
        ogrencilerMap.put("12345678978", "Ali, Can, 13, 123, 9B");
        ogrencilerMap.put("12345678945", "Ahmet, Han, 13, 154, 9A");
        ogrencilerMap.put("12345678956", "Neşe, Tan, 14, 246, 9C");
        ogrencilerMap.put("12345678989", "Hasan, Kan, 15, 321, 10B");
        ogrencilerMap.put("12345678952", "Ayşe, Yan, 16, 486, 11B");
    }

    public static void ogrenciMenu() {
        String tercih = "";
        do {
            System.out.println("============= ÖĞRENCİ İŞLEMLERİ =============\n" +
                    "         1- Yeni Öğrenci Ekleme\n" +
                    "         2- TC No İle Öğrenci Arama\n" +
                    "         3- TC No İle Öğrnci Kayıt Silme\n" +
                    "         4- Tüm Öğrencilerin Listesi\n" +
                    "         A- Anamenü\n" +
                    "         Q- ÇIKIŞ");
            tercih = scanner.nextLine();
            switch (tercih) {
                case "1": // öğrenci bilgileri girerek yeni kayıt oluşturan bir method
                    ogrenciEkle();
                    break;
                case "2":// TC No ile öğrenci arama methodu
                    tcOgrenciArama();
                    break;
                case "3"://  TC No İle Öğrenci Kayıt Silme
                    tcOgrenciSilme();
                    break;
                case "4": // varolan tüm öğrencilerin listesini yazdıran method
                    ogrenciListesiYazdir();
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Geçersiz Giriş !\nLütfen Öğrenci İşlemleri Menüsü'nden bir seçim yapınız");
            }

        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void ogrenciListesiYazdir() {
        Set<Map.Entry<String, String>> ogrenciEntrySet = ogrencilerMap.entrySet();

        System.out.println("========== *YAZICI KOLEJİ* ==========\n" +
                "====== ÖĞRENCİ LİSTESİ ======\n" +
                "TC Kimlik No       İsim   Soyisim   Yaş  Numara  Sınıf  ");

        for (Map.Entry<String, String> each : ogrenciEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

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

    public static void tcOgrenciSilme() {

        System.out.println("Kaydını silmek istediğiniz Öğrencinin TC Kimlik Numarası'nı giriniz: ");
        String silinecekOgrenci = scanner.nextLine();

        String silinecekValue = ogrencilerMap.get(silinecekOgrenci);

        String sonucValue = ogrencilerMap.remove(silinecekOgrenci);

        try {
            if (sonucValue.equals(silinecekValue)) {
                System.out.printf("Silme İşlemi Gerçekleşmiştir...\n");
            }
        } catch (NullPointerException e) {
            System.out.printf("Verilen TC Kimlik No ile Öğrenci Bulunamadı !\n");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static void tcOgrenciArama() {

        System.out.println("Aradığınız Öğrencinin TC Kimlik Numarasını Giriniz : ");
        String istenenTc = scanner.nextLine();

        Set<Map.Entry<String, String>> ogrenciEntrySet = ogrencilerMap.entrySet();
        System.out.println("====== TC ile Öğrenci Arama ======\n" +
                "TC Kimlik No     İsim   Soyisim   Yaş   Numara   Sınıf");

        for (Map.Entry<String, String> each : ogrenciEntrySet
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

    public static void ogrenciEkle() {

        System.out.println("Lütfen eklemek istediğiniz Öğrencinin bilgilerini giriniz:\n");
        System.out.print("TC No :");
        String tcNo = scanner.nextLine();
        System.out.print("İsim :");
        String isim = scanner.nextLine();
        System.out.print("Soyisim :");
        String soyisim = scanner.nextLine();
        System.out.print("Yaş :");
        String yas = scanner.nextLine();
        System.out.print("Numara :");
        String numara = scanner.nextLine();
        System.out.print("Sınıf :");
        String sinif = scanner.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + yas + ", " + numara + ", " + sinif;
        ogrencilerMap.put(tcNo, eklenecekValue);

        System.out.printf("Ekleme işlemi gerçekleşmiştir...\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

}



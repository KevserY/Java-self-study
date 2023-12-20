package okulProjesi;

import java.util.Scanner;

public class Depo {
    static Scanner scanner = new Scanner(System.in);


    public static void anaMenu() {

        String panelTercih = "";

        do {
        System.out.println("============= *YAZICI KOLEJİ* ==============\n" +
                "==== ÖĞRETMEN VE ÖĞRENCİ YÖNETİM PANELİ ====\n" +
                "1- ÖĞRENCİ İŞLEMLERİ\n" +
                "2- ÖĞRETMEN İŞLEMLERİ\n" +
                "Q- ÇIKIŞ");
        panelTercih = scanner.nextLine();
            System.out.println("");

            switch (panelTercih) {
                case "1" : // öğrenci işlemlerine gidecek
                    Ogrenci.ogrenciMenu();
                    break;
                case "2" : // öğretmen işlemlerine gidecek
                    Ogretmen.ogretmenMenu();
                    break;
                case "q" :
                case "Q" :
                    break;
                default:
                    System.out.println("Geçersiz Giriş !\nLütfen Yönetim Paneli'nden saçim yapınız!");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

        }while (!panelTercih.equalsIgnoreCase("Q"));
        Depo.projeDurdur();

    }
    public static void projeDurdur() {
        System.out.println("Çıkış yapılıyor.....");
        System.exit(0);
    }


}

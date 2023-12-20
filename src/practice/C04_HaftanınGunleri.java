package practice;

import java.util.Scanner;

public class C04_HaftanınGunleri {
    public static void main(String[] args) {
        /*     Kullanicidan bir gün ismi girmesini isteyin,
               girilen gun hafta ici bir gun ise “Simdi calisma zamani. Tatile .. gun var” seklinde hafta sonu tatiline kac
               gun kaldigini yazdirin,
               girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gün ismi giriniz:");
        String girilengun = scanner.nextLine().toLowerCase();


        if (girilengun.equals("pazartesi")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 4 gün var.");

        } else if (girilengun.equals("salı")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 3 gün var.");

        } else if (girilengun.equals("carsamba")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 2 gün var.");

        } else if (girilengun.equals("persembe")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 1 gün var.");
        } else if (girilengun.equals("cuma")) {
            System.out.println("Şimdi çalışma zamanı. Tatil yarın :)");

        } else if (girilengun.equals("cumartesi")) {
            System.out.println("Şimdi dinlenme zamanı");

        } else if (girilengun.equals("pazar")) {
            System.out.println("Şimdi dinlenme zamanı");
        }else{
            System.out.println("Bu isimde bir gün yok !");
        }

    }
}

package Java_Practice;

import java.util.Scanner;

public class Çay_Şeker {

    //Görev : Kullanıcıya günde kaç çay içtiğini ve kaç şeker kullandığını sorun.
    // bir yılda kaç kg şeker kullandığını hesaplayıp yazdırınız.
        // 1 şeker=1,7 gr

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Gün içinde kaç çay içersiniz?");
        int çay= scanner.nextInt();//ALDIĞIMIZ BİLGİYİ DEPOLAYALIM
        System.out.println("1 günde kaç şeker kullanırsınız?");
        int şeker= scanner.nextInt();


        double yıllıkşekertüketimi= (şeker * 1.7 * 365);
        System.out.println("1 yılda tükettiğiniz şeker miktarı: " + yıllıkşekertüketimi+"gr'dır");
        System.out.println("alternatif yazım:");
        System.out.println("1 yılda " + yıllıkşekertüketimi + "gr şeker tüketiyorsunuz.");


        //!!!!!!!!!!!!!!!!SONUCU NASIL INTEGER YAZDIRIRIM??????


    }
}

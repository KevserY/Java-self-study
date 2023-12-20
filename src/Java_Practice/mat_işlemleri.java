package Java_Practice;

import java.util.Scanner;

public class mat_işlemleri {
    public static void main(String[] args) {
 //Görev: kullanıcıdan bir sayı alıp,
        //sayının küpünün yarısını konsola yazdırın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");

        int sayı=scanner.nextInt(); //kullanıcıdan veri almamızı sağlar (burada Integer)

        System.out.println("Girilen sayının küpünün yarısı: " + (sayı * sayı * sayı) /2 );



    }
}

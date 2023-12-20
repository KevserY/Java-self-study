package Java_Practice;

import java.util.Scanner;

public class data_casting {
    public static void main(String[] args) {
         //data casting: bir data türünü başka bir data türüne değiştirmeye denir.

        //Görev: Kullanıcıdan bir dikdörtgenin uzunluğu ve genişliği için 2 double sayı girmelerini isteyin,
        //ardından dikdörtgenin alanını hesaplayıp, sonucu integer'a çevirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("dikdörtgenin uzunluğunu giriniz: ");
        double uzunluk= scanner.nextDouble();

        System.out.println("dikdörtgenin genişliğini giriniz: ");
        double genişlik= scanner.nextDouble();

        double alan = uzunluk * genişlik; //alan için atama yaptık. tamam.

        System.out.println("Dikdörtgenin Alanı: " + alan); //bunları yanyana yazdırdık.tamam.

        System.out.println((int)(uzunluk * genişlik)); //double olan sonucu int yazdırdık .tamam

        //Dikdörtgenin Alanı: .... "integer" ==>bu iki veriyi yanyana yazdırmayı dene




    }
}

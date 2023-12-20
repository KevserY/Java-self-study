package Java_Practice;

import java.util.Scanner;

public class string_practice {
    public static void main(String[] args) {
         //Görev : Kullanıcıdan 2 ayrı Strıng isteyin ve bu Stringleri birleştirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String satır1= scanner.nextLine(); // girilen satırları almak için bunu yazarız.

        System.out.println("mesleğinizi giriniz:");
        String satır2= scanner.next(); //BUNU UNUTMA!! next()sadece bir kelime alır, diğer yazılanları görmez.

        System.out.println(satır1 +", " + satır2+".");

        // next(); ve nextLine() arasındaki fark:
        // next() satır1 de yazılan ilk kelimeyi alır, ilk boşluğa kadar.
        // nextLine() satır1 de yazılı olan bütün kelimeleri alır.






    }
}

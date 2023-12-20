package Java_Practice;

import java.util.Scanner;

public class scanner_2 {
    public static void main(String[] args) {


        //Görev-2: kullanıcıdan bir sayı isteyin
// ve bu sayının karesini haseplayan bir kod yazın.
        //girilecek olan sayıya sınır koyalım. (100< ve 50> olsun)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin:");
        int sayı = scanner.nextInt();

        if(sayı >=50 && sayı<=100) //eğer sayı 50-100 arasındaysa yazdırır.

        System.out.println("Sayının karesi:" + sayı*sayı);

        //ancak girilen sayı verilen sayı aralığında değil ise
        // "50-100 arasında bir sayı giriniz" yazdırralım

if(sayı<50 || sayı>100){
    System.out.println("Lütfen 50-100 arasında bir sayı girin!");} // bir aralık belirtirken && yada || kullanımına dikkat et.

//SONUNDAAAAA :)

    }}

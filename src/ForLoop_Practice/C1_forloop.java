package ForLoop_Practice;

import java.util.Scanner;

public class C1_forloop {
    public static void main(String[] args) {
        // Kullanıcıdan 20 den küçük bir sayı alıp,
        // bu sayının faaktoriyel değerini hesaplayın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("20'den küçük bir pozitif tamsayı giriniz: ");
        int sayı = scanner.nextInt();

        long faktoriyelSonuc = 1;

        System.out.print(sayı +"!= ");

        for (int i = sayı; i >= 1; i--) {
            faktoriyelSonuc *= i;
            if (i != 1) {
                System.out.print(i +" * ");
            }else {
                System.out.print(i + " = ");
            }
        }
        System.out.print( faktoriyelSonuc);

        System.out.println("");

        System.out.println(sayı + " sayısının faktoriyel değeri: " + faktoriyelSonuc);
    }
}

package teamWork;

import java.util.Arrays;
import java.util.Scanner;

public class C06_SezarSifre {
    public static void main(String[] args) {
        /* 2. SORU
            Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.

            Sezar Şifreleme: İlk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
            Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
            Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.

            //hello ----> ıfmmp ---> her harfin 1 birim kaydırılmış hali
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yalnızca harflerden oluşan bir metin giriniz: ");
        String girilenMetin = scanner.nextLine().toUpperCase();


        char[] sifrearr = new char[girilenMetin.length()];
        for (int i = 0; i < girilenMetin.length(); i++) {
            sifrearr[i] = girilenMetin.charAt(i);
        }
        System.out.println(Arrays.toString(sifrearr));




    }
}

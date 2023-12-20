package Java_Practice;

public class concat_practice {
    public static void main(String[] args) {
        /*
        create 3 char variables then print A L I on the console using
        String pickName= "ABCDEFGHIJKLMNOPRSTUVWXYZ";
        */

        String pickName= "ABCDEFGHIJKLMNOPRSTUVWXYZ";

        //variable olusturduk. char.At ile bunlara atama yapacağız.

        char krk1 = pickName.charAt(0);
        char krk2 = pickName.charAt(8);
        char krk3 = pickName.charAt(11);

        //System.out.println(krk1 + krk2 + krk3); -----> //toplama işlemi yaptı +.ASCİİ karşiliklarını topladı (214)

        System.out.println(krk1 +" "+ krk2 +" " +krk3); // aralarında boşluk olması için "içine de boşluk yapıyoruz"
        //bu işleme Concatenation (concat) diyoruz. + işaretlerinin aralarına "" koyarız
        // Bir String’i, baska bir String veya primitive deger ile + isareti kullanarak isleme
        //sokarsak Java bu degiskenleri birlestirerek yeni bir String olusturur.

        System.out.println(3+5+"wise quarter");
        System.out.println("3+5"+" wise quarter");




    }
}

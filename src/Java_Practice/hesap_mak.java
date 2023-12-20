package Java_Practice;

import java.util.Scanner;

public class hesap_mak {
    public static void main(String[] args) {
        //ask user to enter 2 numbers,
        //show them a menu of operations sign and ask them to choose one.
        //print the result on the console.
        //Addition: 1
        //Subtraction: 2
        //Multiplication: 3
        //Division: 4

        Scanner scanner= new Scanner(System.in);
        System.out.println("İlk numarayı giriniz:");
        double sayı1=scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz:");
        double sayı2=scanner.nextDouble();

        System.out.println("Aşağıdaki menüden seçtiğiniz işlemin numarasını giriniz:");
        System.out.println("Addition: 1\n" + "Subtraction: 2\n" + "Multiplication: 3\n" + "Division: 4");

        byte seçim= scanner.nextByte();

        if (seçim== 1){
            System.out.println(sayı1+sayı2);
        }

        else if (seçim== 2){
            System.out.println(sayı1 - sayı2);
        }

        else if (seçim== 3){
            System.out.println(sayı1 * sayı2);
        }

        else if (seçim== 4){
            System.out.println(sayı1 / sayı2);
        }
        else{
            System.out.println("menüden birini seçiniz");
        }

    }
}

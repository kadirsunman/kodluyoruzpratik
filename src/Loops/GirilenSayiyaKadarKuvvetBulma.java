package Loops;

import java.util.Scanner;

public class GirilenSayiyaKadarKuvvetBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int girilenSayi = scan.nextInt();

        for (int i = 1; i < girilenSayi; i*= 4)
        {
            System.out.println(i);
        }
        for (int i = 1; i < girilenSayi; i*= 5)
        {
            System.out.println(i);
        }

    }

}

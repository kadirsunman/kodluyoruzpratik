package Loops;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı Giriniz : ");
        int sayi = scan.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriniz : ");
        int us = scan.nextInt();
        int sonuc = 1;
        for(int i = 0; i < us ; i++)
        {
            sonuc *= sayi;
        }
        System.out.println(sonuc);
    }
}

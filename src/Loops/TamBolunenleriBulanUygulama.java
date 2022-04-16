package Loops;

import java.util.Scanner;

public class TamBolunenleriBulanUygulama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int girilenSayi = scan.nextInt();
        int toplam = 0;
        int adet = 0;
        for(int i = 0 ; i < girilenSayi; i++)
        {
            if(i % 3 == 0 || i % 4 == 0)
            {
                toplam += i;
                adet ++;
            }
        }
        System.out.println("Ortalama : " + (toplam / adet));
    }

}

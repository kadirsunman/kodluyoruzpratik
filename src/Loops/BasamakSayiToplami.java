package Loops;

import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int girilenSayi = scan.nextInt();
        int kalan;
        int toplam = 0;
        while(girilenSayi != 0 )
        {
            kalan = girilenSayi % 10;
            girilenSayi = girilenSayi / 10;
            toplam += kalan;
        }
        System.out.println(toplam);
    }
}

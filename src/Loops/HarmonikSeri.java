package Loops;

import java.util.Scanner;

    public class HarmonikSeri {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayi Giriniz : ");
            int girilenSayi = scan.nextInt();
            double toplam = 0;
            for (double i = 1; i < girilenSayi; i++)
            {
                toplam += (1 / i);
            }
            System.out.println("Sonuç : " + toplam);

    }
}

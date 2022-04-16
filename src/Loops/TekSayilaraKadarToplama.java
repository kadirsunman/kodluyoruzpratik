package Loops;

import java.util.Scanner;

public class TekSayilaraKadarToplama {
    public static void main(String[] args) {
        int toplamSayi = 0;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.print("Sayi Giriniz : ");
            int girilenSayi = scan.nextInt();
            if(girilenSayi % 2 == 1)
            {
                break;
            }
            else
            {
                toplamSayi += girilenSayi;
            }
        }
        System.out.println("Toplam : " + toplamSayi);

    }

}

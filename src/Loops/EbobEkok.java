package Loops;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");
        int sayi2 = scan.nextInt();
        int ebob = 1;
        int count = 1;
        while(sayi1 > count && sayi2 > count)
        {
            if(sayi1 % count == 0 && sayi2 % count == 0)
            {
                ebob = count;
            }
            count++;
        }
        int ekok = sayi1 * sayi2 / ebob;
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }
}

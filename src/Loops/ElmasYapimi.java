package Loops;

import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int girilenSayi = scan.nextInt();
        int ustDeger = girilenSayi /2, altDeger = girilenSayi / 2, ortaDeger = girilenSayi /2;

        for (int i = 0; i <= ustDeger ; i++) {
            for (int j = 0; j < (ustDeger - i)+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i = 0 ; i < girilenSayi + 2; i++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
        for (int i = altDeger; i >=0 ; i--) {
            for (int j = 0; j < (altDeger - i)+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
}
}

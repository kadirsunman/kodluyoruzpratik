package Loops;

import java.util.Scanner;

public class HomeworkThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int girilenSayi = scan.nextInt();

        for (int i = girilenSayi; i >=0 ; i--) {
            for (int j = 0; j < (girilenSayi - i)+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
}
}

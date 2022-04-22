package Loops;

import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int count = scan.nextInt();
        int maxValue = 0;
        int minValue = 0;
        for (int i = 1 ; i <= count ;i++)
        {
            System.out.print(i + ". Sayıyı giriniz : ");
            int value = scan.nextInt();
            if(value > maxValue)
            {
                maxValue = value;
            }
            if(value < minValue)
            {
                minValue = value;
            }
        }
        System.out.println("En büyük sayı : " + maxValue);
        System.out.println("En küçük sayı : " + minValue);


    }
}

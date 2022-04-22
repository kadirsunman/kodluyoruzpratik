package Loops;

import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int value = scan.nextInt();
        int total = 0;
        for (int i = 1 ; i < value; i++)
        {
            if(value % i == 0)
            {
                total += i;
            }
        }
        if(value == total)
        {
            System.out.println(value + " Mükemmel Sayıdır.");
        }
        else
        {
            System.out.println(value + " Mükemmel Sayı Değildir.");
        }
    }
}

package Loops;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int value = scan.nextInt();
        if(isPalindrom(value)) System.out.println( value + " Palindrom bir sayı.");
        else System.out.println("Palindrom değil!");
    }

    private static boolean isPalindrom(int value) {
        int temp= value, reverseNumber = 0, lastNumber;
        while(temp != 0)
        {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(value == reverseNumber)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
}

package Loops;

import java.util.Scanner;


public class RecursivePrime {
    public static int primeValue(int value, int divide)
    {
        if(divide == 1)
        {
            return 1;
        }
        if(value % divide == 0)
        {
            return 0;
        }
        return primeValue(value,--divide);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int value = scan.nextInt();
        int divide = value -1;
        if(primeValue(value, divide) == 1) System.out.println(value + " sayısı ASALDIR!");
        else System.out.println(value + " sayısı ASAL değildir!");
    }
}

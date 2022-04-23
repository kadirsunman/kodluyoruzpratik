package Loops;

import java.util.Scanner;

public class RecursivePow {
    public static int gettingBase(int value, int pow)
    {
        if(pow == 0)
        {
            return 1;
        }
        pow--;
        return value *= gettingBase(value, pow);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = scan.nextInt();
        System.out.print("Taban değeri giriniz : ");
        int pow = scan.nextInt();
        System.out.println("Sonuç : " + gettingBase(base, pow));
    }
}

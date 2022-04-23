package Loops;

import java.util.Scanner;


public class RecursivePattern {
    public static int firstValue;
    public static int goBottom(int value)
    {
        if(value < 1)
        {
            goUpper(value);
            return  1;

        }
        System.out.println(value);
        return goBottom(value -= 5);
    }
    public static int goUpper(int value)
    {
        if(value > firstValue )
        {
            return 1;
        }
        System.out.println(value);
        return goUpper(value += 5);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int value = scan.nextInt();
        firstValue = value;
        goBottom(value);

    }
}

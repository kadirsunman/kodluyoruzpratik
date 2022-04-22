package Loops;

import java.util.Scanner;

public class HomeworkFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman Sayısı : ");
        int value = scan.nextInt();
        int firstValue = 0;
        int secoundValue = 1;
        System.out.print(firstValue + " ");
        System.out.print(secoundValue + " ");
        for (int i = 2; i <= value;i++)
        {
            int total = firstValue + secoundValue;
            firstValue = secoundValue;
            secoundValue = total;
            System.out.print(total + " ");
        }

    }
}

package Arrays;

import java.util.Scanner;

public class ValueToFarOrNear {
    public static void main(String[] args) {
        int[] array = {15,12,788,1,-1,-778,2,0};
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int value = scan.nextInt();
        int nearValue = -10000, farValue = 10000;
        for(int i = 0; i < array.length;i++)
        {
            if(value < array[i])
            {
                if(array[i] < farValue)
                {
                    farValue = array[i];
                }
            }
            else if(value > array[i])
            {
                if(array[i] > nearValue)
                {
                    nearValue = array[i];
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearValue);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + farValue);
    }


}

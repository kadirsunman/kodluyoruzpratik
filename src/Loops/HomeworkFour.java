package Loops;

import java.util.Scanner;

public class HomeworkFour {
    public static void main(String[] args) {
        for (int i = 1 ; i < 100; i++)
        {
            if(i != 1 && i != 2)
            {
                for (int j = 2; j <= i / 2; j++)
                {
                    if(i % j == 0)
                    {
                        break;
                    }
                    if(j == i / 2 )
                    {
                        System.out.println(i);
                    }
                }
            }
            if (i == 2)
            {
                System.out.println(i);
            }
        }
    }
}

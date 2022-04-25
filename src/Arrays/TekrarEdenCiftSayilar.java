package Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 5, 6, 8, 10, 14,6, 8, 11, 12,7, 14};
        for (int i = 0; i <list.length;i++)
        {
            for(int j= i; j < list.length; j++)
            {
                if(list[i] == list[j] && i != j)
                {
                    if(list[i] % 2 == 0)
                    {
                        System.out.println("Tekrar eden çift sayı : " + list[i]);
                    }
                }
            }
        }

    }
}

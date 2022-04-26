package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ElemanFrekans {
    public static void main(String[] args) {
        int [] list = {10,20,20,10,10,20,5,20,5};
        List<Integer> soloValue = new ArrayList<Integer>();
        soloValue.add(list[0]);
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < soloValue.size(); j++)
            {
                if(soloValue.get(j) == list[i])
                {
                    break;
                }
                else if(list[i] != soloValue.get(j) && j == soloValue.size() -1)
                {
                    soloValue.add(list[i]);
                }
            }
        }
        System.out.println("Tekrar Sayıları");
        for(int i = 0; i < soloValue.size(); i++)
        {
            int f = 0;
            for(int j = 0; j < list.length; j++)
            {
                if(soloValue.get(i) == list[j])
                {
                    f++;
                }
            }
            System.out.println(soloValue.get(i) + " sayısı " + f + " kere tekrar edildi.");
        }

    }
}

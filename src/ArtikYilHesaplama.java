import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int year = scan.nextInt();
        boolean artikYilState = false;
        if(year % 100 == 0)
        {
            if(year % 400 == 0)
            {
                artikYilState = true;
            }
            else
            {
                artikYilState = false;
            }
        }
        else
        {
            if(year % 4 == 0)
            {
                artikYilState = true;
            }
            else
            {
                artikYilState = false;
            }
        }
        if(artikYilState)
        {
            System.out.println(year + " bir artık yıldır !" );
        }
        else
        {
            System.out.println(year + " bir artık yıldır değildir !" );
        }

    }
}

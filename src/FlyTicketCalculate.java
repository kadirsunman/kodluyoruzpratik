import java.util.Scanner;

public class FlyTicketCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        int distance = scan.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int age = scan.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int type = scan.nextInt();
        if(distance > 0 && age > 0 && (type == 1 || type == 2) )
        {
            double resultPrice = 0;
            double normalPrice = distance * 0.10;
            if(age < 12)
            {
                resultPrice = normalPrice - normalPrice * 0.5;
            }
            else if(age > 12 && age < 24)
            {
                resultPrice = normalPrice - normalPrice * 0.1;
            }
            else if(age > 65)
            {
                resultPrice = normalPrice - normalPrice * 0.3;
            }
            else
            {
                resultPrice = normalPrice;
            }
            if(type == 2)
            {
                resultPrice -= resultPrice * 0.2;
                resultPrice *= 2;
            }
            System.out.println("\nToplam Tutar = " + resultPrice + "₺");
        }
        else
        {
            System.out.println("\n Hatalı Veri Girdiniz !");
        }
    }

}

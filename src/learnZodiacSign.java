import java.util.Scanner;

public class learnZodiacSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Doğum Ayı : ");
        int mounth = scan.nextInt();
        System.out.print("Doğum Günü : ");
        int day = scan.nextInt();
        if((mounth == 1 && day >= 22) || (mounth == 2 && day <= 19))
        {
            System.out.println("Burcunuz : 'Kova'");
        }
        else if((mounth == 2 && day >= 20) || (mounth == 3 && day <= 20))
        {
            System.out.println("Burcunuz : 'Balık'");
        }
        else if((mounth == 3 && day >= 21) || (mounth == 4 && day <= 20))
        {
            System.out.println("Burcunuz : 'Koç'");
        }
        else if((mounth == 4 && day >= 21) || (mounth == 5 && day <= 21))
        {
            System.out.println("Burcunuz : 'Boğa'");
        }
        else if((mounth == 5 && day >= 22) || (mounth == 6 && day <= 22))
        {
            System.out.println("Burcunuz : 'İkizler'");
        }
        else if((mounth == 6 && day >= 23) || (mounth == 7 && day <= 22))
        {
            System.out.println("Burcunuz : 'Yengeç'");
        }
        else if((mounth == 7 && day >= 23) || (mounth == 8 && day <= 22))
        {
            System.out.println("Burcunuz : 'Aslan'");
        }
        else if((mounth == 8 && day >= 23) || (mounth == 9 && day <= 22))
        {
            System.out.println("Burcunuz : 'Başak'");
        }
        else if((mounth == 9 && day >= 23) || (mounth == 10 && day <= 22))
        {
            System.out.println("Burcunuz : 'Terazi'");
        }
        else if((mounth == 10 && day >= 23) || (mounth == 11 && day <= 21))
        {
            System.out.println("Burcunuz : 'Akrep'");
        }
        else if((mounth == 11 && day >= 22) || (mounth == 12 && day <= 21))
        {
            System.out.println("Burcunuz : 'Yay'");
        }
        else if((mounth == 12 && day >= 22) || (mounth == 1 && day <= 21))
        {
            System.out.println("Burcunuz : 'Oğlak'");
        }
    }

}

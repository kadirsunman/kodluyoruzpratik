package Loops;

import java.util.Scanner;

public class ATMProject {
    public static Scanner scan = new Scanner(System.in);
    public static int right = 3;
    public static int balance = 2000;
    public static int select;
    public static void main(String[] args) {

        while(right > 0)
        {
            System.out.print("Username : ");
            String username = scan.nextLine();
            System.out.print("Password : ");
            String password = scan.nextLine();
            if(username.equals("java") && password.equals("101"))
            {
                System.out.println(username + " Hoşgeldiniz!");
                if(openMenu()) break;
            }
            else
            {
                right--;
                System.out.println("Hatalı giriş! Tekrar deneyiniz.");
                if(right == 0)
                {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                else
                {
                    System.out.println("Kalan hakkınız : " + --right);
                }

            }
        }
    }
    public static boolean openMenu()
    {
        do {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz..");
            System.out.println( "1) Para yatırma \n" +
                    "2) Para çekme \n" +
                    "3) Bakiye Sorgula \n" +
                    "4) Çıkış Yap");
            select = scan.nextInt();
            switch (select)
            {
                case 1:
                    System.out.println("Para miktarı : ");
                    int price = scan.nextInt();
                    balance += price;
                    break;
                case 2:
                    System.out.println("Para miktarı : ");
                    int price2 = scan.nextInt();
                    if(price2 > balance)
                    {
                        System.out.println("Bakiye Yetersiz !");
                    }
                    else
                    {
                        balance -= price2;
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz : " + balance);
                    break;
            }


        }while (select != 4);
        System.out.println("İyi Günler");
        return true;

    }
}

import java.util.Scanner;

public class sicaklikcause {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.print("Bir sıcaklık giriniz : ");
        sicaklik = scan.nextInt();

        if(sicaklik < 5)
        {
            System.out.println("Kayak yapabilirsiniz...");
        }
        else if(sicaklik >= 5 && sicaklik <15)
        {
            System.out.println("Sinemaya gidebilirsiniz...");
        }
        else if(sicaklik >= 15 && sicaklik < 25)
        {
            System.out.println("Pikniğe gidebilirsiniz...");
        }
        else
        {
            System.out.println("Yüzmeye gidebilirsiniz...");
        }

    }
}

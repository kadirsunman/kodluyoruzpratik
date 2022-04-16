package Loops;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("C(n,r)");
        System.out.print("n : ");
        int n = scan.nextInt();
        System.out.print("r : ");
        int r = scan.nextInt();
        //C(n,r) = n! / (r! * (n-r)!)
        int result;
        int nF = 1, rF = 1, n_rF = 1;
        for(int i = 1; i <= n; i++)
        {
            nF *= i;
        }
        for(int i = 1; i <= r; i++)
        {
            rF *= i;
        }
        for(int i = 1; i <= n-r; i++)
        {
            n_rF *= i;
        }
        result = nF / (rF * n_rF);
        System.out.println("Sonuç : "  + result);
    }

}

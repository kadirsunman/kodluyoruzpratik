package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrangement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz (n): ");
        int arrayCount = scan.nextInt();
        int[] values = new int[arrayCount];
        for (int i = 0; i < arrayCount; i++)
        {
            System.out.print((i + 1) + ". Elemanı : ");
            values[i] = scan.nextInt();
        }
        Arrays.sort(values);
        System.out.print("Sıralama : ");
        for (int i = 0 ; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
    }
}

package Arrays;

import java.util.Scanner;

public class MatrisTranspoze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz : ");
        int row = scan.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz : ");
        int column = scan.nextInt();
        int[][] matrix = new int[row][column];
        for(int i= 0;i <row;i++)
        {
            for(int j = 0; j < column ; j++)
            {
                System.out.print(i + 1 + ". satır " + (j + 1) + ". sütun değeri giriniz : ");
                matrix[i][j] = scan.nextInt();
            }
        }
        int[][] transpozeMatrix = new int[column][row];
        for(int i= 0;i <row;i++)
        {
            for(int j = 0; j < column ; j++)
            {
                transpozeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matris : ");
        for(int i= 0;i <row;i++)
        {
            for(int j = 0; j < column ; j++)
            {
                System.out.print(matrix[i][j] + " ") ;
            }
            System.out.println("");
        }
        System.out.println("Transpoze : ");
        for(int i= 0;i <column;i++)
        {
            for(int j = 0; j < row ; j++)
            {
                System.out.print(transpozeMatrix[i][j] + " ") ;
            }
            System.out.println("");
        }


    }
}

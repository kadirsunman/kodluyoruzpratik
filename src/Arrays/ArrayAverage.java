package Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] members = {1 ,3 ,5 ,6 ,8 ,10};
        int sum= 0;
        for (int i = 0; i < members.length; i++)
        {
            sum += 1 / members[i];
        }
        int result = members.length / sum;
        System.out.println(result);
    }
}

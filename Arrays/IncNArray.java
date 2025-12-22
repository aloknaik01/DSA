package Arrays;

import java.util.Arrays;

public class IncNArray
{
    public static void main()
    {
        System.out.println("Enter a Number");
        int n = new java.util.Scanner(System.in).nextInt();
        int res[] = incNArray(n);
        System.out.println(Arrays.toString(res));
    }

    static int[] incNArray(int n){
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = i+1;
        }

        return arr;
    }
}

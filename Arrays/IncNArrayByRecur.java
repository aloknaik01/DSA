package Arrays;

import java.util.Arrays;

public class IncNArrayByRecur {
    public static void main() {
        System.out.println("Enter array size");
        int n = new java.util.Scanner(System.in).nextInt();
        int arr[] = new int[n];
        int res[] = descNArrayByRecur(arr, 0);
        System.out.println(Arrays.toString(res));
    }


    static int[] descNArrayByRecur(int a[], int index)
    {
        if(index > a.length -1) return a;
        a[index] = index+1;
        return descNArrayByRecur(a, ++index);
    }
}
